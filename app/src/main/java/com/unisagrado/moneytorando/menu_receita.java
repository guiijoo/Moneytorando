package com.unisagrado.moneytorando;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class menu_receita extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receita);
    }

    public void BotaoAjuda_receita(View view) {
        AlertDialog.Builder explicar = new AlertDialog.Builder(menu_receita.this);
        explicar.setTitle("Explicação !");
        explicar.setMessage("Aqui será aonde você vai pagar suas faturas, abaixo será demonstrado oque esta sendo cobrado e seus valores, clique no botão para fazer o pagamento...para sair clique fora desse bloco!");
        explicar.create().show();
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