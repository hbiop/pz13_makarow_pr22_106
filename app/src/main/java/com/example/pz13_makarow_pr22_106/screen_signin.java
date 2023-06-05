package com.example.pz13_makarow_pr22_106;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class screen_signin extends AppCompatActivity implements View.OnClickListener {
EditText et1;
EditText et2;
Button sign;
    Button prof;
    TextView text;
Intent in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_signin);
        et1 = (EditText) findViewById(R.id.editTextTextPersonName2);
        et2 = (EditText) findViewById(R.id.editTextTextPersonName);
        sign = (Button) findViewById(R.id.button2);
        sign.setOnClickListener(this);
        prof = (Button) findViewById(R.id.button3);
        prof.setOnClickListener(this);
        text = (TextView) findViewById(R.id.textView6);
        text.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.button2:
                in = new Intent(this,acca.class);
                startActivity(in);
                break;
            case R.id.button3:
                in = new Intent(this,Profile.class);
                startActivity(in);
                break;
            case R.id.textView6:
                in = new Intent(this,regist.class);
                startActivity(in);
                break;
        }

    }
}