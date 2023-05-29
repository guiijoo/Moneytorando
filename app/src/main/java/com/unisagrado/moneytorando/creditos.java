package com.unisagrado.moneytorando;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class creditos extends AppCompatActivity {

    private Button btReturnCred;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creditos);

        btReturnCred = findViewById(R.id.btRetornarCred);

        btReturnCred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_incial,menu);
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
            case R.id.goDocumentos:
                Intent intent4 = new Intent(this,documentos.class);

        }
        return super.onOptionsItemSelected(item);
    }
}