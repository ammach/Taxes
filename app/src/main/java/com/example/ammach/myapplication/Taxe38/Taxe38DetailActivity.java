package com.example.ammach.myapplication.Taxe38;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.PopupMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.ammach.myapplication.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

import adapters.Taxe38DetailAdapter;
import bean.Taxe38Trimistrielle;
import helpers.SendIdTaxe38Annuel;

public class Taxe38DetailActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView listViewTaxe38ByAnnuel;
    List<Taxe38Trimistrielle> taxe38Trimistrielles;
    Taxe38DetailAdapter taxe38DetailAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taxe38_detail);

        getSupportActionBar().setBackgroundDrawable(getResources().getDrawable(R.drawable.draw_actionbar));


        initViews();

        getTaxes38AnnuellesByAnnuel();

        taxe38DetailAdapter=new Taxe38DetailAdapter(taxe38Trimistrielles,this);
        listViewTaxe38ByAnnuel.setAdapter(taxe38DetailAdapter);

        listViewTaxe38ByAnnuel.setOnItemClickListener(this);

    }

    private void initViews() {
        listViewTaxe38ByAnnuel= (ListView) findViewById(R.id.listViewTaxe38ByAnnuel);
    }

    public void getTaxes38AnnuellesByAnnuel(){
        taxe38Trimistrielles=new ArrayList<Taxe38Trimistrielle>();
        SendIdTaxe38Annuel sendIdTaxe38Annuel=new SendIdTaxe38Annuel();
        sendIdTaxe38Annuel.execute(getIntent().getLongExtra("idTaxe38Annuel",0));
        try {
            JSONArray jsonArray=new JSONArray(sendIdTaxe38Annuel.get());
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject= (JSONObject) jsonArray.get(i);

                Taxe38Trimistrielle taxe38Trimistrielle=new Taxe38Trimistrielle(new BigDecimal(jsonObject.getLong("montantTotalTrimistrielleItem")),new BigDecimal(jsonObject.getLong("montantRetardTotalTrimistrielleItem")),jsonObject.getInt("numeroTrimistre"));
                taxe38Trimistrielles.add(taxe38Trimistrielle);
            }
        } catch (InterruptedException | ExecutionException | JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
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
                    case R.id.editer:
                        break;
                    case R.id.imprimer:
                        break;
                }
                return true;
            }
        });
        menu.inflate (R.menu.menu_taxe38detail);
        menu.show();
    }
}
