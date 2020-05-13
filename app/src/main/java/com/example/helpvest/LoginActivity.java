package com.example.helpvest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;

import java.util.Objects;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);
    }
        public void loginEntrar(View view){

            Intent intent1 = new Intent(getApplicationContext(),LoginEntrarActivity.class);
            startActivity(intent1);
        }

        public void loginCadastro(View view){

        Intent intent1 = new Intent(getApplicationContext(),CadastroActivity.class);
        startActivity(intent1);
    }
}



