package com.example.makoto.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        float value = intent.getFloatExtra("Value",0);

        TextView textView = (TextView) findViewById(R.id.output);
        textView.setText(String.valueOf(value));

    }
}
