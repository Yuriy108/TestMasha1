package com.example.testmasha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class Main1Activity extends AppCompatActivity {
    Button full, topic, wrNo,oeu,mz,pref,apostr;
    ViewGroup toContainer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        full = findViewById(R.id.full);
        apostr = findViewById(R.id.apostr);
        topic = findViewById(R.id.topic);
        wrNo = findViewById(R.id.writingNo);
        oeu = findViewById(R.id.oeu);
        mz = findViewById(R.id.mz);
        pref = findViewById(R.id.pref);
        toContainer = findViewById(R.id.transitionContainer);
        topic.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                wrNo.setVisibility(View.VISIBLE);
                apostr.setVisibility(View.VISIBLE);
                pref.setVisibility(View.VISIBLE);
                mz.setVisibility(View.VISIBLE);
                oeu.setVisibility(View.VISIBLE);
            }
        });
        full.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("Quntity", 50);
                intent.putExtra("Start", 0);
                startActivity(intent);

            }
        });
        wrNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("Start", 0);
                intent.putExtra("Quntity", 10);
                startActivity(intent);


            }
        });
        pref.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("Start", 40);
                intent.putExtra("Quntity", 10);
                startActivity(intent);


            }
        });
        mz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("Quntity", 10);
                intent.putExtra("Start", 20);
                startActivity(intent);


            }
        });
        apostr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("Start", 10);
                intent.putExtra("Quntity", 10);
                startActivity(intent);


            }
        });
        oeu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("Quntity", 10);
                intent.putExtra("Start", 30);
                startActivity(intent);


            }
        });


    }


}


