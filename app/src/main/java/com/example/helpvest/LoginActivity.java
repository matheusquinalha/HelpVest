package com.example.helpvest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.view.WindowManager;

import java.util.Objects;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);

        Button btnCadastrar = findViewById(R.id.btnCadastrar);

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(LoginActivity.this, CadastroActivity.class);
                startActivity(mIntent);
            }
        });
    }
        public void loginEntrar(View view){

            Intent intent1 = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent1);
        }

        public void loginCadastro(View view){

        Intent intent1 = new Intent(getApplicationContext(),CadastroActivity.class);
        startActivity(intent1);
    }
}



