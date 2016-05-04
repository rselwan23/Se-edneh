package com.example.roger.seedneh;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.sql.SQLException;

/**
 * Created by Roger on 4/16/2016.
 */
public class CaretackerLogin extends MainActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caretackerlogin);
    }

    public void onClickSetRegister(View view){
        Intent intent = new Intent(CaretackerLogin.this,CaretackerRegister.class);
        startActivity(intent);
    }
}
