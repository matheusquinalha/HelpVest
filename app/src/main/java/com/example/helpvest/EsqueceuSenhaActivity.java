package com.example.helpvest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class EsqueceuSenhaActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_esqueceu_senha);

        Button btnCancelar = findViewById(R.id.btnCancelar);

        final EditText etwEmailForget = findViewById(R.id.etwEmailForget);

        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(EsqueceuSenhaActivity.this, LoginActivity.class);
                startActivity(mIntent);
            }
        });
        mAuth = FirebaseAuth.getInstance();
        findViewById(R.id.btnRecuperar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    mAuth.sendPasswordResetEmail(etwEmailForget.getText().toString()).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if (task.isSuccessful()) {
                                Toast.makeText(getApplicationContext(), "Um e-mail de recuperação foi enviado para seu e-mail", Toast.LENGTH_SHORT).show();
                            } else {
                                Toast.makeText(getApplicationContext(), "Erro no envio do e-mail. Por favor, confirme os dados", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
            }
        });
    }
    public void voltarLogin(View view){
        Intent intent1 = new Intent(getApplicationContext(),LoginActivity.class);
        startActivity(intent1);
    }
}