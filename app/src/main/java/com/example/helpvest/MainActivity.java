package com.example.helpvest;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
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
    public void EntrarEstudo(View view){
        Intent intent1 = new Intent(getApplicationContext(),EstudoActivity.class);
        startActivity(intent1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

}
