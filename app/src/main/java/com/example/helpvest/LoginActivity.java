package com.example.helpvest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
<<<<<<< HEAD
import android.view.View;
import android.widget.Button;
=======
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;

import java.util.Objects;
>>>>>>> 9bee3d299dab3c2c46f3a0edb971f8bcce9bff05

public class LoginActivity extends AppCompatActivity {
    private Button btnCadastrar,btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);

        this.btnCadastrar = findViewById(R.id.btnCadastrar);

        this.btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(LoginActivity.this, CadastroActivity.class);
                startActivity(mIntent);
            }
        });



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



