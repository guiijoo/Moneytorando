package com.unisagrado.moneytorando;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class inicial extends AppCompatActivity {


    private Button btAjudaInicial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicial);
        TextView dinheiro_usuario = findViewById(R.id.dinheiroUsuarioAtual);

        TextView nomeUsuarioColetado = findViewById(R.id.nomeUsuarioInicial);
        String usuario;
        float salario;

        Bundle index = getIntent().getExtras();
//        if(index !=null)
//        {
//            if()
//        }

            usuario = index.getString("nome");
            salario = index.getFloat("salario");
            nomeUsuarioColetado.setText("Seja bem-vindo(a)," + usuario + "!");
            dinheiro_usuario.setText(String.valueOf(salario));



        Locale ptBr = new Locale("pt", "BR");
        Currency brlCurrency = Currency.getInstance("BRL");
        NumberFormat format = NumberFormat.getCurrencyInstance(ptBr);
        format.setCurrency(brlCurrency);

        String valorFormatado = format.format(salario);
        dinheiro_usuario.setText(valorFormatado);

        //////////////////////
        btAjudaInicial= findViewById(R.id.btAjudaInicial);
        btAjudaInicial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    AlertDialog.Builder explicar = new AlertDialog.Builder(inicial.this);
                    explicar.setTitle("Explicação !");
                    explicar.setMessage("Aqui Tem todos os seus dados senhor(a), embaixo terá seu historico de transações e pagamentos...para sair clique fora desse bloco!");
                    explicar.create().show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_incial,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem escolha) {
        switch (escolha.getItemId())
        {
            case R.id.goCreditos:
                Intent intent = new Intent(this, creditos.class);
                startActivity(intent);
                return true;

            case R.id.goPagamentos:
                Bundle index = getIntent().getExtras();
                float salario = index.getFloat("salario");
                Intent intent1 = new Intent(this, menu_pagamentos_escolhas.class);
                Bundle bundle = new Bundle();
                bundle.putFloat("salario", salario);
                intent1.putExtras(bundle);
                startActivity(intent1);
                return true;

            case R.id.goInicial:
                Intent intent2 = new Intent(this, inicial.class);
                startActivity(intent2);
                return true;

            case R.id.goReceita:
                Intent intent3 = new Intent(this, receitaNova.class);
                startActivity(intent3);
                return true;
            case R.id.goDocumentos:
                Intent intent4 = new Intent(this,documentos.class);
                startActivity(intent4);
                return true;

        }
        return super.onOptionsItemSelected(escolha);
    }


}


