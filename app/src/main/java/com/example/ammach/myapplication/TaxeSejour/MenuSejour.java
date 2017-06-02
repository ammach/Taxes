package com.example.ammach.myapplication.TaxeSejour;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.ammach.myapplication.R;

public class MenuSejour extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_sejour);
    }

    public void lineClick(View view) {
        startActivity(new Intent(this, LineChartActivity.class));
    }

    public void barClick(View view) {
        startActivity(new Intent(this, BarChartActivity.class));
    }
}
