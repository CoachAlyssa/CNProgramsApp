package com.example.android.cnprogramsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button clubsBtn = (Button) findViewById(R.id.clubs_btn);
        clubsBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ClubsActivity.class));
            }
        });
        Button bootcampsBtn = (Button) findViewById(R.id.bootcamps_btn);
        bootcampsBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, BootcampsActivity.class));
            }
        });


    }

}
