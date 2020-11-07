package com.example.helpvest;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;

public class EstudoSemana1Activity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estudo_semana1);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
}