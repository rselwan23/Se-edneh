package com.example.roger.seedneh;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.sql.SQLException;

/**
 * Created by Roger on 4/16/2016.
 */
public class CaretackerRegister extends MainActivity {
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;


    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caretackeregister);

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();

        Spinner dropdown = (Spinner) findViewById(R.id.spinner1);
        String[] relatedto = new String[]{"Selected", "Husband", "Wife", "Son", "Daughter", "Brother", "Sister", "Carecenter"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, relatedto);
        dropdown.setAdapter(adapter1);


    }
    public void onClickSetNext(View view) {

        Intent intent = new Intent(CaretackerRegister.this,RegisterCare.class);
        startActivity(intent);
    }
}