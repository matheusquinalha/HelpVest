package com.example.helpvest;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;

public class EstudoActivity extends AppCompatActivity {

    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estudo);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button btnEstudoSemana1 = findViewById(R.id.btnEstudoSemana1);
        Button btnEstudoSemana2 = findViewById(R.id.btnEstudoSemana2);
        Button btnEstudoSemana3 = findViewById(R.id.btnEstudoSemana3);
        Button btnEstudoSemana4 = findViewById(R.id.btnEstudoSemana4);

        btnEstudoSemana1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(EstudoActivity.this, EstudoSemana1Activity.class);
                startActivity(mIntent);
            }
        });

        btnEstudoSemana2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(EstudoActivity.this, EstudoSemana2Activity.class);
                startActivity(mIntent);
            }
        });

        btnEstudoSemana3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(EstudoActivity.this, EstudoSemana3Activity.class);
                startActivity(mIntent);
            }
        });

        btnEstudoSemana4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(EstudoActivity.this, EstudoSemana4Activity.class);
                startActivity(mIntent);
            }
        });
    }

    public void EntrarEstudoSemana1(View view){
        Intent intent1 = new Intent(getApplicationContext(),EstudoSemana1Activity.class);
        startActivity(intent1);
    }
    public void EntrarEstudoSemana2(View view){
        Intent intent1 = new Intent(getApplicationContext(),EstudoSemana1Activity.class);
        startActivity(intent1);
    }
    public void EntrarEstudoSemana3(View view){
        Intent intent1 = new Intent(getApplicationContext(),EstudoSemana1Activity.class);
        startActivity(intent1);
    }
    public void EntrarEstudoSemana4(View view){
        Intent intent1 = new Intent(getApplicationContext(),EstudoSemana1Activity.class);
        startActivity(intent1);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }


}