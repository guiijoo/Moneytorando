package com.unisagrado.moneytorando;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class receitaNova extends AppCompatActivity {
    private Button botaoReceitaNova;
    private TextView valorDescontar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receita_nova);
        valorDescontar = findViewById(R.id.edValor);
        botaoReceitaNova = findViewById(R.id.btPagarRec);

        float salario = getSharedPreferences("preferencias", MODE_PRIVATE).getFloat("salario", 000);

        botaoReceitaNova.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valor = valorDescontar.getText().toString();
                float valorDescontarF = Float.parseFloat(valor);


                Intent voltarInicial = new Intent(receitaNova.this,inicial.class);
                float subtracaoSalario = salario-valorDescontarF;
                SharedPreferences.Editor edt = getSharedPreferences("preferencias",MODE_PRIVATE).edit();
                edt.putFloat("salario", subtracaoSalario);
                edt.apply();
//                voltarInicial.putExtra("salario",subtracaoSalario);
                startActivity(voltarInicial);
            }
        });
    }
}