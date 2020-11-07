package com.example.helpvest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
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
            "Desvalorização Monetária no Brasil",
            "Privatização ou Terceirização?",
            "Saúde Nutricional",
            "O Envelhecimento e os Direitos da População Idosa",
            "Os Efeitos dos Desastres Ambientais",
            "Movimento Antivacina"
    };
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redacao);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        txtViewTema = findViewById(R.id.txtViewTema);
    }

    public void selecionarTema (View v){
        Random random = new Random();
        int value = random.nextInt(17);
        String temaSorteado = temas[value];
        txtViewTema.setText(temaSorteado);
        System.out.println(String.format("ID: %s, - %s", value, temas[value]));
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }
}
