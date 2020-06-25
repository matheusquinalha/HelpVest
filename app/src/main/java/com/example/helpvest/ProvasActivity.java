package com.example.helpvest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.content.Intent;
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

        Intent intent1 = new Intent(getApplicationContext(),UnicampProvasActivity.class);
        startActivity(intent1);
    }

    public void EntrarProvasFuvest(View view){

        Intent intent1 = new Intent(getApplicationContext(),MainActivity2.class);
        startActivity(intent1);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }
}