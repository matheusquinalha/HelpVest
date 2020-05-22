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

        Button btnUnicamp = findViewById(R.id.btnUnicamp);
        btnUnicamp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(BibliotecaActivity.this, UnicampBibliotecaActivity.class);
                startActivity(mIntent);
            }
        });
    }
    public void loginEntrarBibliotecaUnicamp(View view){

        Intent intent1 = new Intent(getApplicationContext(),UnicampBibliotecaActivity.class);
        startActivity(intent1);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

}
