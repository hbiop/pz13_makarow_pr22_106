package com.example.pz13_makarow_pr22_106;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Profile extends AppCompatActivity implements View.OnClickListener {
ImageButton pic;
ImageButton player;
ImageView acca;
Intent in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        pic = findViewById(R.id.imageButton4);
        pic.setOnClickListener(this);
        player = (ImageButton) findViewById(R.id.imageButton8);
        player.setOnClickListener(this);
        acca = (ImageView) findViewById(R.id.imageView18);
        acca.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.imageButton4:
                in = new Intent(this, gallery.class);
                startActivity(in);
                break;
            case R.id.imageButton8:
                in = new Intent(this, player.class);
                startActivity(in);
                break;
            case R.id.imageView18:
                in = new Intent(this, acca.class);
                startActivity(in);
                break;
        }
    }
}