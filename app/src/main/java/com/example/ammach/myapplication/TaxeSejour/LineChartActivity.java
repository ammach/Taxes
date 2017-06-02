package com.example.ammach.myapplication.TaxeSejour;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.ammach.myapplication.R;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.utils.Utils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

import config.Configuration;
import helpers.ReadTask;
import utils.MathUtil;

public class LineChartActivity extends AppCompatActivity {

    private LineChart mChart;
    ArrayList<Entry> values1;
    ArrayList<Entry> values2;
    BigDecimal[][] res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line_chart);

        getSupportActionBar().hide();

        getValuesChart();

        initiate();

        setDataToChart();
    }

    public void getValuesChart(){
        ReadTask readTask=new ReadTask();
        readTask.execute("http://"+ Configuration.add_ip+":28075/taxe3_new/webresources/taxesejourtrimistrielle/search/2015/2016/2/2/1");

        try {
            JSONArray jsonArray=new JSONArray(readTask.get());
            values1 = new ArrayList<Entry>();
            values2 = new ArrayList<Entry>();
            res=new BigDecimal[2][4];
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject=jsonArray.getJSONObject(i);
                Toast.makeText(this,jsonObject.toString(),Toast.LENGTH_SHORT).show();
                long valTrim1=jsonObject.getLong("trimestre1");
                long valTrim2=jsonObject.getLong("trimestre2");
                long valTrim3=jsonObject.getLong("trimestre3");
                long valTrim4=jsonObject.getLong("trimestre4");
                if(i==0){
                    values1.add(new Entry(10,valTrim1));
                    values1.add(new Entry(20,valTrim2));
                    values1.add(new Entry(30,valTrim3));
                    values1.add(new Entry(40,valTrim4));

                }
                else{
                    values2.add(new Entry(0,valTrim1));
                    values2.add(new Entry(10,valTrim2));
                    values2.add(new Entry(20,valTrim3));
                    values2.add(new Entry(30,valTrim4));
                }
                for (int j = 0; j <4; j++) {
                   if(j==0){
                       res[i][j]=new BigDecimal(valTrim1);
                   }
                    else if(j==1){
                       res[i][j]=new BigDecimal(valTrim2);
                    }
                   else if(j==2){
                       res[i][j]=new BigDecimal(valTrim3);
                   }
                   else if(j==3){
                       res[i][j]=new BigDecimal(valTrim4);
                   }

                }
            }

        } catch (InterruptedException | ExecutionException | JSONException e) {
            e.printStackTrace();
        }
    }


    public void initiate(){



        mChart = (LineChart) findViewById(R.id.chart1);

        mChart.setDrawGridBackground(false);


        mChart.setDescription("statistiques des années 2015 et 2016");
        mChart.setNoDataTextDescription("You need to provide data for the chart.");


        mChart.setTouchEnabled(true);


        mChart.setDragEnabled(true);
        mChart.setScaleEnabled(true);

        mChart.setPinchZoom(true);

        LimitLine llXAxis = new LimitLine(10f, "Index 10");
        llXAxis.setLineWidth(4f);
        llXAxis.enableDashedLine(10f, 10f, 0f);
        llXAxis.setLabelPosition(LimitLine.LimitLabelPosition.RIGHT_BOTTOM);
        llXAxis.setTextSize(10f);

        XAxis xAxis = mChart.getXAxis();
        xAxis.enableGridDashedLine(10f, 10f, 0f);

        YAxis leftAxis = mChart.getAxisLeft();
        leftAxis.removeAllLimitLines(); // reset all limit lines to avoid overlapping lines
        Float max=MathUtil.calculerMax(res).multiply(new BigDecimal(1.1)).floatValue();
        leftAxis.setAxisMaxValue(max);
        leftAxis.setAxisMinValue(0f);
        leftAxis.enableGridDashedLine(10f, 10f, 0f);
        leftAxis.setDrawZeroLine(false);

        leftAxis.setDrawLimitLinesBehindData(true);

        mChart.getAxisRight().setEnabled(false);

        mChart.animateX(2500);

        Legend l = mChart.getLegend();

        l.setForm(Legend.LegendForm.LINE);
    }

    private void setDataToChart() {

        LineDataSet set1;

        if (mChart.getData() != null &&
                mChart.getData().getDataSetCount() > 0) {
            set1 = (LineDataSet)mChart.getData().getDataSetByIndex(0);
            set1.setValues(values1);
            mChart.getData().notifyDataChanged();
            mChart.notifyDataSetChanged();
        } else {
            set1 = new LineDataSet(values1, "DataSet 1");

            set1.enableDashedLine(10f, 5f, 0f);
            set1.enableDashedHighlightLine(10f, 5f, 0f);
            set1.setColor(Color.BLACK);
            set1.setCircleColor(Color.BLACK);
            set1.setLineWidth(1f);
            set1.setCircleRadius(3f);
            set1.setDrawCircleHole(false);
            set1.setValueTextSize(9f);
            set1.setDrawFilled(true);

            if (Utils.getSDKInt() >= 18) {
                Drawable drawable = ContextCompat.getDrawable(this, R.drawable.fade_red);
                set1.setFillDrawable(drawable);
            }
            else {
                set1.setFillColor(Color.BLACK);
            }

            //groupe du deuxième année
            LineDataSet set2;

            if (mChart.getData() != null &&
                    mChart.getData().getDataSetCount() > 0) {
                set2 = (LineDataSet)mChart.getData().getDataSetByIndex(0);
                set2.setValues(values2);
                mChart.getData().notifyDataChanged();
                mChart.notifyDataSetChanged();
            } else {
                set2 = new LineDataSet(values2, "DataSet 2");
                set2.enableDashedLine(10f, 5f, 0f);
                set2.enableDashedHighlightLine(10f, 5f, 0f);
                set2.setColor(Color.BLACK);
                set2.setCircleColor(Color.BLACK);
                set2.setLineWidth(1f);
                set2.setCircleRadius(3f);
                set2.setDrawCircleHole(false);
                set2.setValueTextSize(9f);
                set2.setDrawFilled(true);

                if (Utils.getSDKInt() >= 18) {
                    Drawable drawable = ContextCompat.getDrawable(this, R.drawable.fade_yellow);
                    set2.setFillDrawable(drawable);
                }
                else {
                    set2.setFillColor(Color.BLACK);
                }




            ArrayList<ILineDataSet> dataSets = new ArrayList<ILineDataSet>();
            dataSets.add(set2);

            LineData data = new LineData(dataSets);

            mChart.setData(data);
            }
        }
    }
}
