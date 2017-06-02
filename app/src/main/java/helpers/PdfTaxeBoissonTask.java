package helpers;

import android.content.Context;
import android.os.AsyncTask;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import config.Configuration;

/**
 * Created by ammach on 8/28/2016.
 */
public class PdfTaxeBoissonTask extends AsyncTask<Void,Void,String> {

    Context context;


    public PdfTaxeBoissonTask(Context context) {
        this.context = context;
    }

    @Override
    protected String doInBackground(Void... params) {
        JSONObject jsonUser = new JSONObject();

        try {
            jsonUser.put("id", 2);
        } catch (JSONException e) {
            e.printStackTrace();
        }


        String msg = jsonUser.toString();


        HttpClient client= new DefaultHttpClient();
        HttpPost post=new HttpPost("http://"+ Configuration.add_ip+":28075/taxe3_new/webresources/taxeboisonanuelle/taxeBoissonPdf");
        post.setHeader("content-type","application/json");

        try {
            StringEntity entity=new StringEntity(msg, "UTF8");
            post.setEntity(entity);

            HttpResponse response=client.execute(post);
            BufferedReader rd = new BufferedReader (new InputStreamReader(response.getEntity().getContent()));
            String line = "";
            String result="";
            while ((line = rd.readLine()) != null) {
                result+=line;
            }
            return result;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
