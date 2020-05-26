package com.example.helpvest;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.widget.Toolbar;
public class BibliotecaActivity extends AppCompatActivity {

    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biblioteca);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button btnBibliotecaUnicamp = findViewById(R.id.btnBibliotecaUnicamp);
        btnBibliotecaUnicamp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(BibliotecaActivity.this, UnicampBibliotecaActivity.class);
                startActivity(mIntent);
            }
        });
        Button btnBiliotecaFuvest = findViewById(R.id.btnBibliotecaFuvest);
        btnBiliotecaFuvest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(BibliotecaActivity.this, FuvestBibliotecaActivity.class);
                startActivity(mIntent);
            }
        });
    }
    public void EntrarBibliotecaUnicamp(View view){

        Intent intent1 = new Intent(getApplicationContext(),UnicampBibliotecaActivity.class);
        startActivity(intent1);
    }
    public void EntrarBibliotecaFuvest(View view){

        Intent intent1 = new Intent(getApplicationContext(),FuvestBibliotecaActivity.class);
        startActivity(intent1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

}
