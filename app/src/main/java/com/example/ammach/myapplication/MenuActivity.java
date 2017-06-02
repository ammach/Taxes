package com.example.ammach.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ammach.myapplication.Taxe38.Taxe38Activity;
import com.example.ammach.myapplication.TaxeBoisson.TaxeAnnelleBoissonPdf;
import com.example.ammach.myapplication.TaxeSejour.MenuSejour;

import utils.Connectivity;

public class MenuActivity extends AppCompatActivity {


    TextView userConnecte;
    Button taxe38;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        getSupportActionBar().hide();

        initViews();

        String userName=getIntent().getStringExtra("userName");
        if(userName!=null){
            String mystring=new String("Bienvenue "+userName);
            SpannableString content = new SpannableString(mystring);
            content.setSpan(new UnderlineSpan(), 0, mystring.length(), 0);
            userConnecte.setText(content);
        }
        else{
            SharedPreferences prefs = getSharedPreferences("userName", MODE_PRIVATE);
            String restoreduserName = prefs.getString("userName", null);
            String mystring=new String("Bienvenue "+restoreduserName);
            SpannableString content = new SpannableString(mystring);
            content.setSpan(new UnderlineSpan(), 0, mystring.length(), 0);
            userConnecte.setText(content);
        }
    }

    void initViews(){
        userConnecte= (TextView) findViewById(R.id.userConnecte);
        taxe38=(Button) findViewById(R.id.taxe38);
    }

    public void taxe38Click(View view) {
        if(Connectivity.isConnected(this)){
            startActivity(new Intent(this, Taxe38Activity.class));
            finish();
        }
        else {
            Toast.makeText(this,"u r offline", Toast.LENGTH_SHORT).show();
        }
    }

   public void taxeBoissonClick(View view) {
       if(Connectivity.isConnected(this)){
           startActivity(new Intent(this, TaxeAnnelleBoissonPdf.class));
           finish();
       }
       else {
           Toast.makeText(this,"u r offline", Toast.LENGTH_SHORT).show();
       }
    }

    public void taxeSejourClick(View view) {
        if(Connectivity.isConnected(this)){
            startActivity(new Intent(this, MenuSejour.class));
        }
        else {
            Toast.makeText(this,"u r offline", Toast.LENGTH_SHORT).show();
        }
    }

    public void taxeTNBClick(View view) {
    }

    public void localeClick(View view) {
    }

    public void configurationClick(View view) {
    }

    public void notificationClick(View view) {
    }

    public void administrationClick(View view) {
    }

    public void deconnecter(View view) {
    }
}
