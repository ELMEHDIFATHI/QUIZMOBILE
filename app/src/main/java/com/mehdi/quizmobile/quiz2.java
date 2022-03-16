package com.mehdi.quizmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class quiz2 extends AppCompatActivity {

    Button bnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);

        bnext = (Button) findViewById(R.id.bnext);

        bnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(quiz2.this,quiz3.class));
            }
        });
    }
}