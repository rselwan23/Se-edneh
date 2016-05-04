package com.example.roger.seedneh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Roger on 4/25/2016.
 */
public class Todolist extends MainActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todolist);

    }
    public void onClickSetAddtolist(View view){
        Intent intent = new Intent(Todolist.this,Addtolist.class);
        startActivity(intent);
    }
}
