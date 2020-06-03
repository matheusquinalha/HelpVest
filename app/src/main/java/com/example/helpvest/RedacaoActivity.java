package com.example.helpvest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class RedacaoActivity extends AppCompatActivity {

    TextView txtViewTema;
    String[] temas = {
            "COVID-19",
            "Quarentena",
            "Valorização do SUS",
            "Os Impactos das FakeNews no Brasil",
            "Saude Mental",
            "Importâncias e Desafios da Educação Financeira",
            "Homeschooling (Estudo em Casa)",
            "A exploração trabalhista na sociedade morderna",
            "Cibercondria: A doença da Era Digital",
            "Racismo e Discriminação Social",
            "Expectativa de Vida",
            "Redução da Maioridade Penal",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redacao);

        txtViewTema = findViewById(R.id.txtViewTema);
    }

    public void selecionarTema (View v){
        Random random = new Random();
        int value = random.nextInt(7);
        String temaSorteado = temas[value];
        txtViewTema.setText(temaSorteado);
        System.out.println(String.format("ID: %s, - %s", value, temas[value]));
    }
}
