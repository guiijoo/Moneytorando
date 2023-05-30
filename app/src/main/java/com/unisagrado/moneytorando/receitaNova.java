package com.unisagrado.moneytorando;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class receitaNova extends AppCompatActivity {
    private Button botaoReceitaNova;
    private TextView salarioReceitaAtual;
    private TextView valorDescontar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receita_nova);




        ///////////////////////////////////////////////////////////////////////
        valorDescontar = findViewById(R.id.edValor);
        botaoReceitaNova = findViewById(R.id.btPagarRec);

        double valorDescontarD = Double.parseDouble(valorDescontar.toString());

        salarioReceitaAtual = findViewById(R.id.salarioAtualReceitaNova);
        double salario = Double.parseDouble(salarioReceitaAtual.toString());
        Bundle receita = getIntent().getExtras();
        salario = receita.getDouble("salarioReceita");

        Locale ptBr = new Locale("pt", "BR");
        Currency brlCurrency = Currency.getInstance("BRL");
        NumberFormat format = NumberFormat.getCurrencyInstance(ptBr);
        format.setCurrency(brlCurrency);

        String valorFormatado = format.format(salario);
        salarioReceitaAtual.setText(valorFormatado);

        double finalSalario = salario;
        botaoReceitaNova.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent voltarInicial = new Intent(receitaNova.this,inicial.class);
                double subtracaoSalario = valorDescontarD - finalSalario;
                //Double salario = Double.parseDouble(salarioReceitaAtual.getText().toString());
                Bundle receitaNova = new Bundle();
                receitaNova.putDouble("salario",subtracaoSalario);
            }
        });
        ///////////////////////////////////////////////////////////////

    }
}