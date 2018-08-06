package com.example.makoto.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static java.lang.System.out;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editText1;
    EditText editText2;
    String editstr1;
    String editstr2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText) findViewById(R.id.editText1);
        editText1.setOnClickListener(this);

        editText2 = (EditText) findViewById(R.id.editText2);
        editText2.setOnClickListener(this);

        Button buttonPlus = (Button) findViewById(R.id.plus);
        buttonPlus.setOnClickListener(this);

        Button buttonMinus = (Button) findViewById(R.id.minus);
        buttonMinus.setOnClickListener(this);

        Button buttonMultiple = (Button) findViewById(R.id.multiple);
        buttonMultiple.setOnClickListener(this);

        Button buttonDevide = (Button) findViewById(R.id.devide);
        buttonDevide.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        float total = 0;
        float figure1 = 0;
        float figure2 = 0;

        String str1 = editText1.getText().toString();
        if (str1.matches("")) {
            Toast.makeText(this, "何も入力されていません。", Toast.LENGTH_SHORT).show();
        } else {
            figure1 = Float.valueOf(str1);
        }


        String str2 = editText2.getText().toString();
        if (str2.matches("")) {
            Toast.makeText(this, " 何も入力されていません。", Toast.LENGTH_SHORT).show();
        } else {
            figure2 = Float.valueOf(str2);
        }

        Intent intent = new Intent(this, Main2Activity.class);

        if (!str1.matches("") && !str2.matches("")) {

            if (v.getId() == R.id.plus) {
                total = figure1 + figure2;
                intent.putExtra("Value", total);
                startActivity(intent);
            } else if (v.getId() == R.id.minus) {
                total = figure1 - figure2;
                intent.putExtra("Value", total);
                startActivity(intent);
            } else if (v.getId() == R.id.multiple) {
                total = figure1 * figure2;
                intent.putExtra("Value", total);
                startActivity(intent);
            } else if (v.getId() == R.id.devide) {
                if (figure2 != 0) {
                    total = figure1 / figure2;
                    intent.putExtra("Value", total);
                    startActivity(intent);
                } else {
                    Toast.makeText(this, "0除算をしないでください！", Toast.LENGTH_SHORT).show();

                }
            }

        }

    }
}
