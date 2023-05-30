package com.unisagrado.moneytorando;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.ClipData;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class menu_pagamentos_escolhas extends AppCompatActivity {
    private ImageView agua_image;
    private ImageView energia_image;
    private ImageView gas_image;
    private ImageView shopping_image;
    private ImageView telefone_image;
    private ImageView cartao_image;
    private ImageView seguranca_image;
    private ImageView moradia_image;
    private ImageView outros_image;
    private Button ajudaPagamentos;

    private TextView salarioAtual;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagamentos);
        agua_image = findViewById(R.id.agua_image);
        energia_image = findViewById(R.id.energia_image);
        gas_image = findViewById(R.id.gas_image);
        shopping_image = findViewById(R.id.shopping_image);
        telefone_image = findViewById(R.id.telefone_image);
        cartao_image = findViewById(R.id.cartao_image);
        seguranca_image = findViewById(R.id.seguranca_image);
        moradia_image = findViewById(R.id.moradia_image);
        outros_image = findViewById(R.id.outros_image);
        ajudaPagamentos = findViewById(R.id.ajuda_pagamento_btn);
        salarioAtual = findViewById(R.id.dinheiro_usuario_txt);

        float salario = Float.parseFloat(salarioAtual.toString());



        //////////////////////////////////////////////////////////////
        Locale ptBr = new Locale("pt", "BR");
        Currency brlCurrency = Currency.getInstance("BRL");
        NumberFormat format = NumberFormat.getCurrencyInstance(ptBr);
        format.setCurrency(brlCurrency);
        String valorFormatado = format.format(salario);
        salarioAtual.setText(valorFormatado);
        ///////////////////////////////////////////////////////////////

        agua_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentAgua = new Intent(menu_pagamentos_escolhas.this, receitaNova.class);
                startActivity(intentAgua);



                ///////////////////////////////////////////////////////////////////////
                float salario = Float.parseFloat(salarioAtual.getText().toString());
                Bundle pagamentos = new Bundle();
                pagamentos.putFloat("salarioReceita",salario);
                ///////////////////////////////////////////////////////////////////////

            }
        });
        ajudaPagamentos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder explicar = new AlertDialog.Builder(menu_pagamentos_escolhas.this);
                explicar.setTitle("Explicação !");
                explicar.setMessage("Aqui você vai escolher qual pagamento deverá quitar primeiro, cada simbolo representa taxas diferentes, escolha sabiamente qual começar!...para sair clique fora desse bloco! ");
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
    public boolean onOptionsItemSelected(@NonNull MenuItem escolha) {
        switch (escolha.getItemId()) {
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

    public void processarImagemViewClicada(int id_escolha){
        switch(id_escolha){
            case R.id.gas_image:
                AlertDialog.Builder explicar_gas = new AlertDialog.Builder(menu_pagamentos_escolhas.this);
                explicar_gas.setTitle("Escolheu gas !");
                explicar_gas.setMessage("teste gas ");
                explicar_gas.create().show();
                break;
            case R.id.energia_image:
                AlertDialog.Builder explicar_energia = new AlertDialog.Builder(menu_pagamentos_escolhas.this);
                explicar_energia.setTitle("Escolheu energia !");
                explicar_energia.setMessage("teste energia ");
                explicar_energia.create().show();
                break;
            case R.id.outros_image:
                AlertDialog.Builder explicar_outros = new AlertDialog.Builder(menu_pagamentos_escolhas.this);
                explicar_outros.setTitle("Escolheu outros !");
                explicar_outros.setMessage("teste outros ");
                explicar_outros.create().show();
                break;
            case R.id.telefone_image:
                AlertDialog.Builder explicar_telefone = new AlertDialog.Builder(menu_pagamentos_escolhas.this);
                explicar_telefone.setTitle("Escolheu telefone !");
                explicar_telefone.setMessage("teste telefone ");
                explicar_telefone.create().show();
                break;
            case R.id.seguranca_image:
                AlertDialog.Builder explicar_seguranca = new AlertDialog.Builder(menu_pagamentos_escolhas.this);
                explicar_seguranca.setTitle("Escolheu segurança !");
                explicar_seguranca.setMessage("teste segurança ");
                explicar_seguranca.create().show();
                break;
            case R.id.cartao_image:
                AlertDialog.Builder explicar_cartao = new AlertDialog.Builder(menu_pagamentos_escolhas.this);
                explicar_cartao.setTitle("Escolheu cartao !");
                explicar_cartao.setMessage("teste cartao ");
                explicar_cartao.create().show();
                break;
            case R.id.shopping_image:
                AlertDialog.Builder explicar_shopping = new AlertDialog.Builder(menu_pagamentos_escolhas.this);
                explicar_shopping.setTitle("Escolheu shopping !");
                explicar_shopping.setMessage("teste shopping ");
                explicar_shopping.create().show();
                break;
            case R.id.moradia_image:
                AlertDialog.Builder explicar_moradia = new AlertDialog.Builder(menu_pagamentos_escolhas.this);
                explicar_moradia.setTitle("Escolheu moradia !");
                explicar_moradia.setMessage("teste moradia ");
                explicar_moradia.create().show();
                break;
        }
    }

    public void escolha_pagamento(View view){
        int id_escolha = view.getId();
        processarImagemViewClicada(id_escolha);
    }
}
