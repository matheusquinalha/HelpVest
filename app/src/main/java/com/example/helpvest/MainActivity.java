package com.example.helpvest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button btnBiblioteca = findViewById(R.id.btnBiblioteca);

        btnBiblioteca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(MainActivity.this, BibliotecaActivity.class);
                startActivity(mIntent);
            }
        });

        Button btnProvas = findViewById(R.id.btnProvas);

        btnProvas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(MainActivity.this, ProvasActivity.class);
                startActivity(mIntent);
            }
        });

        Button btnRedacao = findViewById(R.id.btnRedacao);

        btnRedacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(MainActivity.this, RedacaoActivity.class);
                startActivity(mIntent);
            }
        });



    }

    public void EntrarBiblioteca(View view){
        Intent intent1 = new Intent(getApplicationContext(),BibliotecaActivity.class);
        startActivity(intent1);
    }

    public void EntrarProvas(View view){
        Intent intent1 = new Intent(getApplicationContext(),ProvasActivity.class);
        startActivity(intent1);
    }

    public void EntrarRedacao(View view){
        Intent intent1 = new Intent(getApplicationContext(),RedacaoActivity.class);
        startActivity(intent1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

}
