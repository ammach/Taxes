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

import bean.User;
import config.Configuration;

/**
 * Created by ammach on 7/22/2016.
 */
public class SendUserTask extends AsyncTask<User,Void,String> {
    @Override
    protected String doInBackground(User... params) {

        JSONObject jsonUser = new JSONObject();

        try {
            jsonUser.put("login", params[0].getLogin());
            jsonUser.put("password", params[0].getPassword());
        } catch (JSONException e) {
            e.printStackTrace();
        }


        String msg = jsonUser.toString();


        HttpClient client= new DefaultHttpClient();
        HttpPost post=new HttpPost("http://"+ Configuration.add_ip+":28075/taxe3_new/webresources/user/login");
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
