package com.example.roger.seedneh;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.io.File;

/**
 * Created by Roger on 4/16/2016.
 */
public class Register extends MainActivity{

    private GoogleApiClient client;
    DataBaseHelper myDb;
    EditText editFullname ,editGender , editPhone1 , editPhone2 ,editAddress;
    Button btnConfirm;

   @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_register);
       editFullname = (EditText)findViewById(R.id.Text_name);
       editGender = (EditText)findViewById(R.id.Text_gender);
       editPhone1 = (EditText)findViewById(R.id.Text_phone1);
       editPhone2 = (EditText)findViewById(R.id.Text_phone2);
       editAddress = (EditText)findViewById(R.id.Text_address);
       btnConfirm = (Button)findViewById(R.id.buttonConfirm);
       addData();

     //  DataBaseHelper dataBaseHelper=new DataBaseHelper(int id, String name,String gender, String phonenumber1,String phonenumber2, String address);

       // ATTENTION: This was auto-generated to implement the App Indexing API.
    // See https://g.co/AppIndexing/AndroidStudio for more information.
    client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
       myDb=new DataBaseHelper(this);

   }
    public void addData()
    {
        btnConfirm.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        boolean isInserted = myDb.insertData(editFullname.getText().toString(), editGender.getText().toString(), editPhone1.getText().toString(), editPhone2.getText().toString(), editAddress.getText().toString());
                        if (isInserted = true)
                            Toast.makeText(Register.this, "Registration Successfull", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(Register.this, "You are not Register", Toast.LENGTH_LONG).show();

                    }
                }
        );
    }





    }
