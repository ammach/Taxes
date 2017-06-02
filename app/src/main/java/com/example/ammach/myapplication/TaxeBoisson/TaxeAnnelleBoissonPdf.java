package com.example.ammach.myapplication.TaxeBoisson;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.example.ammach.myapplication.MenuActivity;
import com.example.ammach.myapplication.R;
import com.hendrix.pdfmyxml.PdfDocument;
import com.hendrix.pdfmyxml.viewRenderer.AbstractViewRenderer;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

import bean.TaxeBoisonTrimistrielle;
import helpers.PdfTaxeBoissonTask;

public class TaxeAnnelleBoissonPdf extends AppCompatActivity {


    AbstractViewRenderer page;
    TextView nomRCTxt;
    TextView adresseTxt;
    TextView cinRCTxt;
    TextView telTxt;
    TextView faxTxt;
    TextView proprietaireTxt;
    TextView sommeTxt;
    TextView sommeLettreTxt;
    TextView dateTxt;
    TextView anneeTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taxe_annelle_boisson_pdf);


        PdfTaxeBoissonTask pdfTaxeBoissonTask = new PdfTaxeBoissonTask(this);
        pdfTaxeBoissonTask.execute();


        final List<TaxeBoisonTrimistrielle> taxeBoisonTrimistrielles = new ArrayList<>();

        try {
            JSONObject jsonObject = new JSONObject(pdfTaxeBoissonTask.get());

            JSONArray jsonArray = jsonObject.getJSONArray("taxeBoisonTrimistrielles");

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject1 = (JSONObject) jsonArray.get(i);
                int numeroTrimistre = jsonObject1.getInt("NumeroTrimistre");
                BigDecimal chiffreAffaire = BigDecimal.valueOf(jsonObject1.getDouble("ChiffreAffaire"));
                BigDecimal montant = BigDecimal.valueOf(jsonObject1.getDouble("Montant"));
                BigDecimal montantRetard = BigDecimal.valueOf(jsonObject1.getDouble("MontantRetard"));
                taxeBoisonTrimistrielles.add(new TaxeBoisonTrimistrielle(numeroTrimistre, chiffreAffaire, montant, montantRetard));
            }

            final String adresse = jsonObject.getString("adresse");
            final String secteure = jsonObject.getString("secteure");
            final String tel = jsonObject.getString("tel");
            final String fax = jsonObject.getString("fax");
            final String annee = jsonObject.getString("annee");
            final String date = jsonObject.getString("date");
            final String somme = jsonObject.getString("somme");
            final String lettre = jsonObject.getString("lettre");
            final String cin = jsonObject.getString("cin");
            final String nom = jsonObject.getString("nom");
            final String exploitant = jsonObject.getString("exploitant");


            page = new AbstractViewRenderer(this, R.layout.activity_taxe_annelle_boisson_pdf) {
                private String _text;

                public void setText(String text) {
                    _text = text;
                }

                @Override
                protected void initView(View view) {

                    TableLayout tableLayout = (TableLayout) view.findViewById(R.id.tableLayout);

                    nomRCTxt = (TextView) view.findViewById(R.id.nomRC);
                    adresseTxt = (TextView) view.findViewById(R.id.adresse);
                    cinRCTxt = (TextView) view.findViewById(R.id.cinRC);
                    telTxt = (TextView) view.findViewById(R.id.tel);
                    faxTxt = (TextView) view.findViewById(R.id.fax);
                    proprietaireTxt = (TextView) view.findViewById(R.id.proprietaire);
                    sommeTxt = (TextView) view.findViewById(R.id.somme);
                    sommeLettreTxt = (TextView) view.findViewById(R.id.sommeLettre);
                    dateTxt = (TextView) view.findViewById(R.id.date);
                    anneeTxt = (TextView) view.findViewById(R.id.annee);

                    for (int i = 0; i < taxeBoisonTrimistrielles.size(); i++) {
                        TaxeBoisonTrimistrielle taxeBoisonTrimistrielle = taxeBoisonTrimistrielles.get(i);

                        TableRow row = new TableRow(TaxeAnnelleBoissonPdf.this);
                        TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT);
                        row.setLayoutParams(lp);

                        TextView numTrim = new TextView(TaxeAnnelleBoissonPdf.this);
                        numTrim.setGravity(Gravity.CENTER);
                        numTrim.setTextSize(20);
                        numTrim.setTypeface(null, Typeface.BOLD);
                        numTrim.setTextColor(Color.BLACK);
                        numTrim.setBackground(TaxeAnnelleBoissonPdf.this.getResources().getDrawable(R.drawable.rec_table));

                        TextView chiffreAffaire = new TextView(TaxeAnnelleBoissonPdf.this);
                        chiffreAffaire.setGravity(Gravity.CENTER);
                        chiffreAffaire.setTextSize(20);
                        chiffreAffaire.setTypeface(null, Typeface.BOLD);
                        chiffreAffaire.setTextColor(Color.BLACK);
                        chiffreAffaire.setBackground(TaxeAnnelleBoissonPdf.this.getResources().getDrawable(R.drawable.rec_table));

                        TextView montant = new TextView(TaxeAnnelleBoissonPdf.this);
                        montant.setGravity(Gravity.CENTER);
                        montant.setTextSize(20);
                        montant.setTypeface(null, Typeface.BOLD);
                        montant.setTextColor(Color.BLACK);
                        montant.setBackground(TaxeAnnelleBoissonPdf.this.getResources().getDrawable(R.drawable.rec_table));

                        TextView montantRetard = new TextView(TaxeAnnelleBoissonPdf.this);
                        montantRetard.setGravity(Gravity.CENTER);
                        montantRetard.setTextSize(20);
                        montantRetard.setTypeface(null, Typeface.BOLD);
                        montantRetard.setTextColor(Color.BLACK);
                        montantRetard.setBackground(TaxeAnnelleBoissonPdf.this.getResources().getDrawable(R.drawable.rec_table));

                        numTrim.setText("" + taxeBoisonTrimistrielle.getNumeroTrimistre());
                        chiffreAffaire.setText(taxeBoisonTrimistrielle.getChiffreAffaire().intValue() + "");
                        montant.setText(taxeBoisonTrimistrielle.getMontant().intValue() + "");
                        montantRetard.setText(taxeBoisonTrimistrielle.getMontantRetard().intValue() + "");

                        row.addView(numTrim);
                        row.addView(chiffreAffaire);
                        row.addView(montant);
                        row.addView(montantRetard);

                        tableLayout.addView(row);
                    }

                    nomRCTxt.setText(nom);
                    adresseTxt.setText(secteure + "\n" + adresse);
                    cinRCTxt.setText(cin);
                    telTxt.setText(tel);
                    faxTxt.setText(fax);
                    proprietaireTxt.setText(exploitant);

                    sommeTxt.setText(somme);
                    sommeLettreTxt.setText(lettre);
                    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                    try {
                        dateTxt.setText(dateFormat.format(dateFormat.parse(date)));
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    anneeTxt.setText(annee);
                }
            };

            page.setReuseBitmap(true);
            new PdfDocument.Builder(this).addPage(page).filename("test").orientation(PdfDocument.A4_MODE.PORTRAIT).renderWidth(2115).renderHeight(4500)
                    .listener(new PdfDocument.Callback() {
                        @Override
                        public void onComplete(File file) {
                            Intent target = new Intent(Intent.ACTION_VIEW);
                            target.setDataAndType(Uri.fromFile(file),"application/pdf");
                            target.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);


                            Intent intent = Intent.createChooser(target, "Open File");
                            try {
                                TaxeAnnelleBoissonPdf.this.startActivity(intent);
                            } catch (ActivityNotFoundException e) {
                                // Instruct the user to install a PDF reader here, or something
                            }
                        }

                        @Override
                        public void onError(Exception e) {
                            Log.i(PdfDocument.TAG_PDF_MY_XML, "Error");
                        }
                    }).create().createPdf(TaxeAnnelleBoissonPdf.this);

        } catch (JSONException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void onRestart() {
        super.onRestart();

        startActivity(new Intent(this, MenuActivity.class));
        finish();
    }
}
