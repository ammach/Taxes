package com.example.ammach.myapplication.Taxe38;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.ammach.myapplication.MenuActivity;
import com.example.ammach.myapplication.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

import adapters.Taxe38Adapter;
import bean.Commune;
import bean.Locale;
import bean.Quartier;
import bean.Redevable;
import bean.Rue;
import bean.Secteure;
import bean.Taxe38Anuelle;
import bean.Ville;
import config.Configuration;
import helpers.ReadTask;
import utils.Connectivity;

public class Taxe38Activity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, AdapterView.OnItemClickListener {

    List<Taxe38Anuelle> taxe38Anuelles;
    Taxe38Adapter taxe38Adapter;
    ListView listViewTaxe38;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taxe38);

        initViews();

        getTaxes38Annuelles();

        taxe38Adapter=new Taxe38Adapter(taxe38Anuelles,this);
        listViewTaxe38.setAdapter(taxe38Adapter);
        progressBar.setVisibility(View.INVISIBLE);
        listViewTaxe38.setOnItemClickListener(this);
    }

    public void initViews(){
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setItemIconTintList(null);
        listViewTaxe38= (ListView) findViewById(R.id.listViewTaxe38);
        progressBar= (ProgressBar) findViewById(R.id.pgb);
    }

    public void getTaxes38Annuelles(){
        taxe38Anuelles=new ArrayList<Taxe38Anuelle>();
        ReadTask readTask=new ReadTask();
        readTask.execute("http://"+ Configuration.add_ip+":28075/taxe3_new/webresources/taxe38anuelle/list");

        try {
            JSONArray jsonTaxe38Array=new JSONArray(readTask.get());
            for (int i = 0; i < jsonTaxe38Array.length(); i++) {
                JSONObject jsonTaxe38Object=jsonTaxe38Array.getJSONObject(i);

                Commune commune=new Commune(new Ville(jsonTaxe38Object.getJSONObject("locale").getJSONObject("rue").getJSONObject("quartier").getJSONObject("secteure").getJSONObject("commune").getJSONObject("ville").getString("nom")));
                Secteure secteure=new Secteure(jsonTaxe38Object.getJSONObject("locale").getJSONObject("rue").getJSONObject("quartier").getJSONObject("secteure").getString("nom"),commune);
                Quartier quartier=new Quartier(jsonTaxe38Object.getJSONObject("locale").getJSONObject("rue").getJSONObject("quartier").getString("nom"),secteure);
                Rue rue=new Rue(jsonTaxe38Object.getJSONObject("locale").getJSONObject("rue").getString("nom"),quartier);
                Locale locale=new Locale(jsonTaxe38Object.getJSONObject("locale").getString("adresse"),rue);
                Redevable redevable=new Redevable(jsonTaxe38Object.getJSONObject("redevable").getString("cin"));
                Taxe38Anuelle taxe38Anuelle=new Taxe38Anuelle(jsonTaxe38Object.getLong("id"),jsonTaxe38Object.getInt("annee"),locale,redevable,new BigDecimal(jsonTaxe38Object.getLong("valeurLocation")));
                taxe38Anuelles.add(taxe38Anuelle);
            }

        } catch (InterruptedException | ExecutionException | JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.taxe38, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.menu_principal) {
            startActivity(new Intent(this, MenuActivity.class));
            finish();
        } else if (id == R.id.rechercher) {
            startActivity(new Intent(this, Taxe38SearchActivity.class));
        }
        else if (id == R.id.deconnecter) {

        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {

        final int pos=position;

        PopupMenu menu = new PopupMenu (this, view);
        menu.setOnMenuItemClickListener (new PopupMenu.OnMenuItemClickListener ()
        {
            @Override
            public boolean onMenuItemClick (MenuItem item)
            {
                int id = item.getItemId();
                switch (id)
                {
                    case R.id.detail:
                        break;
                    case R.id.listeTaxe38Trimes:

                        if(Connectivity.isConnected(Taxe38Activity.this)){
                            Intent intent=new Intent(Taxe38Activity.this,Taxe38DetailActivity.class);
                            intent.putExtra("idTaxe38Annuel",taxe38Anuelles.get(pos).getId());
                            startActivity(intent);
                        }
                        else {
                            Toast.makeText(Taxe38Activity.this,"u r offline", Toast.LENGTH_SHORT).show();
                        }
                        break;
                    case R.id.imprimer:
                        break;
                }
                return true;
            }
        });
        menu.inflate (R.menu.menu_taxe38);
        menu.show();


    }
}
