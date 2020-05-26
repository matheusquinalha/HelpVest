package com.example.helpvest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProvasActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provas);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button btnProvasUnicamp = findViewById(R.id.btnProvasUnicamp);
        btnProvasUnicamp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(ProvasActivity.this, UnicampProvasActivity.class);
                startActivity(mIntent);
            }
        });


        Button btnProvasFuvest = findViewById(R.id.btnProvasFuvest);
        btnProvasFuvest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(ProvasActivity.this, FuvestProvasActivity.class);
                startActivity(mIntent);
            }
        });
    }
    public void EntrarProvasUnicamp(View view){

        Intent intent1 = new Intent(getApplicationContext(),UnicampProvasActivity.class);
        startActivity(intent1);
    }

    public void EntrarProvasFuvest(View view){

        Intent intent1 = new Intent(getApplicationContext(),FuvestProvasActivity.class);
        startActivity(intent1);
    }
}