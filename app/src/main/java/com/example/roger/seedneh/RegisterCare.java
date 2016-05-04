package com.example.roger.seedneh;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

/**
 * Created by Roger on 4/16/2016.
 */
public class RegisterCare extends MainActivity {
    private GoogleApiClient client;

 @Override

    protected void onCreate(Bundle savedInstanceState) {

     super.onCreate(savedInstanceState);
     setContentView(R.layout.activity_registercare);

     // ATTENTION: This was auto-generated to implement the App Indexing API.
     // See https://g.co/AppIndexing/AndroidStudio for more information.
     client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();

 }
}
