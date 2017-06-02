package helpers;

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
 * Created by ammach on 7/22/2016.
 */
public class SendIdTaxe38Annuel extends AsyncTask<Long,Void,String> {
    @Override
    protected String doInBackground(Long... params) {

        JSONObject jsonTask38Annuel = new JSONObject();

        try {
            jsonTask38Annuel.put("id", params[0]);
        } catch (JSONException e) {
            e.printStackTrace();
        }


        String msg = jsonTask38Annuel.toString();


        HttpClient client= new DefaultHttpClient();
        HttpPost post=new HttpPost("http://"+ Configuration.add_ip+":28075/taxe3_new/webresources/taxe38anuelle/ByAnuelle");
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
//            if(response.getStatusLine().getStatusCode()==204){
//                return  "request sent successefully";
//            }
//            else {
//                return  response.getAllHeaders().toString();
//            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
