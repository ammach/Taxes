package com.example.ammach.myapplication.TaxeSejour;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.ammach.myapplication.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

import config.Configuration;
import helpers.ReadTask;
import im.dacer.androidcharts.BarView;
import utils.MathUtil;

public class BarChartActivity extends AppCompatActivity {

    BarView barView;
    ArrayList<Integer> values;
    ArrayList<String> semestres=new ArrayList<>();

    BigDecimal[][]nums=new BigDecimal[2][4];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart);

        initiate();

        getValuesChart();




    }


    public void getValuesChart() {
        ReadTask readTask = new ReadTask();
        readTask.execute("http://" + Configuration.add_ip + ":28075/taxe3_new/webresources/taxesejourtrimistrielle/search/2015/2016/2/2/1");

        try {
            JSONArray jsonArray = new JSONArray(readTask.get());
            values = new ArrayList<Integer>();
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                Toast.makeText(this, jsonObject.toString(), Toast.LENGTH_SHORT).show();
                long valTrim1 = jsonObject.getLong("trimestre1");
                long valTrim2 = jsonObject.getLong("trimestre2");
                long valTrim3 = jsonObject.getLong("trimestre3");
                long valTrim4 = jsonObject.getLong("trimestre4");

                    values.add((int) valTrim1);
                    values.add((int) valTrim2);
                    values.add((int) valTrim3);
                    values.add((int) valTrim4);

                nums[i][0]=BigDecimal.valueOf(valTrim1);
                nums[i][1]=BigDecimal.valueOf(valTrim2);
                nums[i][2]=BigDecimal.valueOf(valTrim3);
                nums[i][3]=BigDecimal.valueOf(valTrim4);


                    semestres.add(valTrim1+" semestre1");
                    semestres.add(valTrim2+" semestre2");
                    semestres.add(valTrim3+" semestre3");
                    semestres.add(valTrim4+" semestre4");


            }
            int max= MathUtil.calculerMax(nums).intValue();
            barView.setDataList(values,max);
            barView.setBottomTextList(semestres);
        } catch (InterruptedException | ExecutionException | JSONException e) {
            e.printStackTrace();
        }
    }


    public void initiate() {
        barView = (BarView)findViewById(R.id.bar_view);

    }



}
