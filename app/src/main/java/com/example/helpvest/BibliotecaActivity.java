package com.example.helpvest;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
public class BibliotecaActivity extends AppCompatActivity {

    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biblioteca);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void entrarBibliotecaUnicamp(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://helpvesttcc.000webhostapp.com/Unicamp.html"));
        startActivity(intent);
    }
    public void EntrarBibliotecaFuvest(View view){
        Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://helpvesttcc.000webhostapp.com/Fuvest.html"));
        startActivity(intent1);
    }
    public void EntrarBibliotecaUnesp(View view){
        Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://helpvesttcc.000webhostapp.com/Unesp.html"));
        startActivity(intent2);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }
}