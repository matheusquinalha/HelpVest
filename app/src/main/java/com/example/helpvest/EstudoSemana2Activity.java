package com.example.helpvest;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class EstudoSemana2Activity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estudo_semana2);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
}