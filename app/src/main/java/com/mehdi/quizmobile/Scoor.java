package com.mehdi.quizmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Scoor extends AppCompatActivity {

    Button Exit,Retry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scoor);

        Exit =(Button) findViewById(R.id.Exit);
        Retry =(Button) findViewById(R.id.Retry);

        Exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Scoor.this,MainActivity.class));
            }
        });

       Retry.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               startActivity(new Intent(Scoor.this,quiz1.class));
           }
       });
    }
}