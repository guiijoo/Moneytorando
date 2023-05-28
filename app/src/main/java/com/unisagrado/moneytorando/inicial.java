package com.unisagrado.moneytorando;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import java.util.Locale;

public class inicial extends AppCompatActivity {

    private TextView nome_usuario_coletado;
    private TextView dados_historico_inicial_TextView;
    private TextView dinheiro_usuario;
    private String nome_usuarioS;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicial);


            SharedPreferences prefs = getSharedPreferences("preferencias", Context.MODE_PRIVATE);
            String nome_usuario = prefs.getString("usuario", "usuario" );

            nome_usuario_coletado = findViewById(R.id.nome_usuario_inicial_txt);
            nome_usuario_coletado.setText("Seja bem-vindo(a), " + nome_usuario + "!");



        /////////////////////



        TextView dinheiro_usuario = findViewById(R.id.dinheiro_usuario_inicial);
        double dinheiro_atualF = Double.parseDouble(prefs.getString("salario", "salario"));

        Locale ptBr = new Locale("pt", "BR");
        Currency brlCurrency = Currency.getInstance("BRL");
        NumberFormat format = NumberFormat.getCurrencyInstance(ptBr);
        format.setCurrency(brlCurrency);

        String valorFormatado = format.format(dinheiro_atualF);
        dinheiro_usuario.setText(valorFormatado);
        //////////////////////

        //Historico de Transações:

        RecyclerView recyclerView = findViewById(R.id.cashHistory);
        List<item> items = new ArrayList<item>();

//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        recyclerView.setAdapter(new MyAdapter(getApplicationContext(), items));


    }

    public void BotaoAjuda_principal(View view){
       AlertDialog.Builder explicar = new AlertDialog.Builder(inicial.this);
        explicar.setTitle("Explicação !");
        explicar.setMessage("Aqui Tem todos os seus dados senhor(a) "+nome_usuario_coletado+", embaixo terá seu historico de transações e pagamentos...para sair clique fora desse bloco!");
        explicar.create().show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_incial,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
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
//                Intent intent2 = new Intent(this, inicial.class);
//                startActivity(intent2);
                return true;

            case R.id.goReceita:
                Intent intent3 = new Intent(this, menu_receita.class);
                startActivity(intent3);
                return true;

        }
        return super.onOptionsItemSelected(item);
    }



//        RecyclerView recyclerView = findViewById(R.id.cashHistory);
//        List<item> items = new ArrayList<item>();
//        items.add(new item(nome, valor, id));
////        items.add(new item());
//    }

}


