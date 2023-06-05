package com.example.pz13_makarow_pr22_106;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class screen_enter extends AppCompatActivity implements View.OnClickListener {
Button sw;
    Intent in;
TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_enter);
        sw = (Button) findViewById(R.id.button);
        sw.setOnClickListener(this);
        text = (TextView) findViewById(R.id.textView5);
        text.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.button:
                 in = new Intent(this,screen_signin.class);
                startActivity(in);
                break;
            case R.id.textView5:
                 in = new Intent(this,regist.class);
                startActivity(in);
                break;
        }
    }
}