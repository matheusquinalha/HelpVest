package com.example.helpvest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

public class ProvasActivity extends AppCompatActivity {

    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provas);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
    public void EntrarProvasUnicamp(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://helpvesttcc.000webhostapp.com/ProvaUnicamp.html"));
        startActivity(intent);
    }


    public void EntrarProvasEnem(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://helpvesttcc.000webhostapp.com/ProvaEnem.html"));
        startActivity(intent);
    }

    public void EntrarProvasFuvest(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://helpvesttcc.000webhostapp.com/ProvaEnem.html"));
        startActivity(intent);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }
}