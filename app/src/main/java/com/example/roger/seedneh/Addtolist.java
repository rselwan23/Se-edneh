package com.example.roger.seedneh;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

/**
 * Created by Roger on 4/25/2016.
 */
public class Addtolist extends MainActivity {
TimePicker timePicker1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addtolist);
       // final TextView description =(TextView)findViewById(R.id.editTextdescription);
        timePicker1=(TimePicker)findViewById(R.id.timepicker1);
        timePicker1.setIs24HourView(true);
        Button addlist = (Button)findViewById(R.id.addlist);


    }
}
