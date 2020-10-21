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
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class CadastroActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_cadastro);

        Button btnLoginRegister = findViewById(R.id.btnLoginRegister);
        final EditText etwEmailRegister = findViewById(R.id.etwEmailRegister);
        final EditText etwPasswordRegister = findViewById(R.id.etwPasswordRegister);
        mAuth = FirebaseAuth.getInstance();

        findViewById(R.id.btnRegister).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAuth.createUserWithEmailAndPassword(etwEmailRegister.getText().toString(),etwPasswordRegister.getText().toString()).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful())
                        {
                            Toast.makeText(getApplicationContext(), "Cadastrado com sucesso Sucesso", Toast.LENGTH_SHORT).show();
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "Erro ao efetuar o cadastro", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
        btnLoginRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(CadastroActivity.this, LoginActivity.class);
                startActivity(mIntent);
            }
        });
    }
    public void voltarLogin(View view){

        Intent intent1 = new Intent(getApplicationContext(),LoginActivity.class);
        startActivity(intent1);
    }
}

