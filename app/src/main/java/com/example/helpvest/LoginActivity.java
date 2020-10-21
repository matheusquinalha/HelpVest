package com.example.helpvest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class LoginActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);


        Button btnCadastrar = findViewById(R.id.btnCadastrar);
        Button btnEsqueciasenha = findViewById(R.id.btnEsqueciasenha);

        btnEsqueciasenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(LoginActivity.this, EsqueceuSenhaActivity.class);
                startActivity(mIntent);
            }
        });

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(LoginActivity.this, CadastroActivity.class);
                startActivity(mIntent);
            }
        });

        mAuth = FirebaseAuth.getInstance();

        final EditText etwEmail = findViewById(R.id.etwEmail);
        final EditText etwPassword = findViewById(R.id.etwPassword);

        findViewById(R.id.btnLogin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    mAuth.signInWithEmailAndPassword(etwEmail.getText().toString(), etwPassword.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                Toast.makeText(LoginActivity.this, "Conectando", Toast.LENGTH_SHORT).show();
                                Intent intent1 = new Intent(getApplicationContext(), MainActivity.class);
                                startActivity(intent1);
                            } else {
                                Toast.makeText(LoginActivity.this, "Login ou Senha Incorreto", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });

            }
        });

    }
    public void loginCadastro(View view){

        Intent intent1 = new Intent(getApplicationContext(),CadastroActivity.class);
        startActivity(intent1);
    }
}



