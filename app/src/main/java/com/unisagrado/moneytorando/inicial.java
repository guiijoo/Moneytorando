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

    private TextView nome_usuario_coletado;
    private TextView dinheiro_usuario;
    private Button btAjudaInicial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicial);

            nome_usuario_coletado = findViewById(R.id.nome_usuario_inicial_txt);
            dinheiro_usuario = findViewById(R.id.dinheiro_usuario_inicial);
        String usuario;
        double salario;

            Bundle index = getIntent().getExtras();

//            if(index != null)
//            {
                usuario = index.getString("nome");
                salario = index.getDouble("salario");
                nome_usuario_coletado.setText("Seja bem-vindo(a)," + usuario + "!");




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
                Intent intent1 = new Intent(this, menu_pagamentos_escolhas.class);
                startActivity(intent1);
                return true;

            case R.id.goInicial:
                Intent intent2 = new Intent(this, inicial.class);
                startActivity(intent2);
                return true;

            case R.id.goReceita:
                Intent intent3 = new Intent(this, menu_receita.class);
                startActivity(intent3);
                return true;
            case R.id.goDocumentos:
                Intent intent4 = new Intent(this,documentos.class);
                return true;

        }
        return super.onOptionsItemSelected(escolha);
    }


}


