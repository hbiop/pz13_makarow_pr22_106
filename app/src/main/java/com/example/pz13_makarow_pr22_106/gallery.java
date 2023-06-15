package com.example.pz13_makarow_pr22_106;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gallery extends AppCompatActivity implements View.OnClickListener {
Intent in;
    Button close;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        close = (Button) findViewById(R.id.button6);
        close.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.button6:
                in = new Intent(this, Profile.class);
                startActivity(in);
                break;
        }
    }
}