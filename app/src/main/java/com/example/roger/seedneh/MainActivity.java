package com.example.roger.seedneh;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onClickSetCaretacker(View view){
        Intent intent = new Intent(MainActivity.this,CaretackerLogin.class);
        startActivity(intent);




    }
    public void onClickSetElderly(View view){
        Intent intent = new Intent(MainActivity.this,Register.class);
        startActivity(intent);
    }

}
