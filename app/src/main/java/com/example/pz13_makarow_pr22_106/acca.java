package com.example.pz13_makarow_pr22_106;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class acca extends AppCompatActivity implements View.OnClickListener {
    ImageView menu;
    ImageButton player;
    ImageButton profile;
    Intent in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acca);
        menu = (ImageView) findViewById(R.id.imageView4);
        menu.setOnClickListener(this);
        player = (ImageButton) findViewById(R.id.imageButton2);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imageView4:
                in = new Intent(this, menu.class);
                startActivity(in);
            case R.id.imageButton2:
                in = new Intent(this, player.class);
                startActivity(in);
            case R.id.imageButton3:
                in = new Intent(this, Profile.class);
                startActivity(in);
        }
    }
}
