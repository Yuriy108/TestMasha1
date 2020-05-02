package com.example.testmasha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Result extends AppCompatActivity {
    TextView result;
    Button restart;
    int myresult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result1);
        Bundle bundle=getIntent().getExtras();
        myresult=bundle.getInt("Result");

        result=findViewById(R.id.result);
        restart=findViewById(R.id.restart);
        result.setText(""+myresult);
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Main1Activity.class);
                startActivity(intent);

            }
        });
    }
}
