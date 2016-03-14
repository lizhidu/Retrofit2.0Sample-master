package com.iayon.retrofit20tutorial;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import models.GitResult;
import models.Item;
import models.NewsResult;
import rest.Params;
import rest.RestClient;
import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;

public class MainActivity extends AppCompatActivity {

    private UserAdapter adapter;
    List<Item> Users;
    private static final String KEY = "9e1432111c23ce5c1a5cb8ebdc5a9c84";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView listView = (ListView) findViewById(R.id.listView);
        Users = new ArrayList<Item>();


        final ProgressDialog dialog = ProgressDialog.show(this, "", "loading...");


        RestClient.GitApiInterface service = RestClient.getClient();
//        Call<com.squareup.okhttp.Response> call = service.getRes("两会","9e1432111c23ce5c1a5cb8ebdc5a9c84","");
//
//
//        call.enqueue(new Callback<com.squareup.okhttp.Response>() {
//            @Override
//            public void onResponse(Response<com.squareup.okhttp.Response> response) {
//               System.err.println(response);
//
//            }
//
//            @Override
//            public void onFailure(Throwable t) {
//
//            }
//        });
        Params params = new Params("两会","");
        params.setQ("两会");
        params.setDtype("");
        Call<NewsResult> newsResultCall = service.getNews("9e1432111c23ce5c1a5cb8ebdc5a9c84","两会","");
        newsResultCall.enqueue(new Callback<NewsResult>() {
            @Override
            public void onResponse(Response<NewsResult> response) {
                NewsResult result = response.body();
                Log.d("Main", "error_code======" + result.getError_code());
                ArrayList<NewsResult.ResultEntity> mData = new ArrayList<NewsResult.ResultEntity>();
                if (result != null) {
                    for (NewsResult.ResultEntity bean : result.getResult()) {
                        mData.add(bean);
                    }
                    Log.d("Main", "mData.size======" + mData.size());
                } else {
                    return;
                }
            }

            @Override
            public void onFailure(Throwable t) {

            }
        });


        Call<GitResult> call = service.getUsersNamedTom("tom");
        call.enqueue(new Callback<GitResult>() {
            @Override
            public void onResponse(Response<GitResult> response) {
                dialog.dismiss();
                Log.d("MainActivity", "Status Code = " + response.code());
                if (response.isSuccess()) {
                    // request successful (status code 200, 201)
                    GitResult result = response.body();
                    Log.d("MainActivity", "response = " + new Gson().toJson(result));
                    Users = result.getItems();
                    Log.d("MainActivity", "Items = " + Users.size());
                    adapter = new UserAdapter(MainActivity.this, Users);
                    listView.setAdapter(adapter);
                } else {
                    // response received but request not successful (like 400,401,403 etc)
                    //Handle errors

                }
            }

            @Override
            public void onFailure(Throwable t) {
                dialog.dismiss();
            }
        });
    }
}
