package com.example.ammach.myapplication;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.widget.Toast;

import config.Configuration;

/**
 * Created by ammach on 9/20/2016.
 */
public class MyApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();

        Context myContext = null;
        try {
            myContext = createPackageContext("com.ammach.simulatetaxes",0);
            SharedPreferences prefs = myContext.getSharedPreferences("taxesPref", Context.CONTEXT_IGNORE_SECURITY);

            String adresse = prefs.getString("adresse", null);
            if(adresse!=null){
                Configuration.add_ip=adresse;
                Toast.makeText(this,adresse, Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(this, "adresse null", Toast.LENGTH_SHORT).show();
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }

    }
}
