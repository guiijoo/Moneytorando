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
import android.widget.EditText;

public class menu_receita extends AppCompatActivity {

    private Button btAjudaReceita = findViewById(R.id.btAjudaReceita);
    private Button btPagarReceita = findViewById(R.id.btPagarReceita);
    private EditText etValorReceita = findViewById(R.id.etValorReceita);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receita);

        btPagarReceita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });
        btAjudaReceita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder explicar = new AlertDialog.Builder(menu_receita.this);
                explicar.setTitle("Explicação !");
                explicar.setMessage("Aqui você ira colocar os valores de :taxas,investimentos,juros,parcerias. Agora coloque os valores de acordo com os dados da sua cidade...para sair clique fora desse bloco!");
                explicar.create().show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_incial, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
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

        }
        return super.onOptionsItemSelected(item);
    }
}