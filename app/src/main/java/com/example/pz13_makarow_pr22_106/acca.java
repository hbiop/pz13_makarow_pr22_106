package com.example.pz13_makarow_pr22_106;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class acca extends AppCompatActivity implements View.OnClickListener {
    ImageView menu;
    ImageButton player;
    ImageButton profile;
    Intent in;
    ImageView calm;
    ImageView relax;
    ImageView focus;
    ImageView anxious;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acca);
        menu = (ImageView) findViewById(R.id.imageView4);
        menu.setOnClickListener(this);
        player = (ImageButton) findViewById(R.id.imageButton2);
        player.setOnClickListener(this);
        profile = (ImageButton) findViewById(R.id.imageButton3);
        profile.setOnClickListener(this);
        calm = (ImageView) findViewById(R.id.imageView11);
        calm.setOnClickListener(this);
        relax = (ImageView) findViewById(R.id.imageView10);
        relax.setOnClickListener(this);
        focus = (ImageView) findViewById(R.id.imageView9);
        focus.setOnClickListener(this);
        anxious = (ImageView) findViewById(R.id.imageView8);
        anxious.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imageView4:
                in = new Intent(this, menu.class);
                startActivity(in);
                break;
            case R.id.imageButton2:
                in = new Intent(this, player.class);
                startActivity(in);
                break;
            case R.id.imageButton3:
                in = new Intent(this, Profile.class);
                startActivity(in);
                break;
            case R.id.imageView11:
                Toast.makeText(this,"спокойствие", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView10:
                Toast.makeText(this,"расслабленность", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView9:
                Toast.makeText(this,"сосредоточность", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView8:
                Toast.makeText(this,"волнение", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
