package com.unisagrado.moneytorando;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class menu_receita extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receita);
    }
    public void BotaoAjuda_receita(View view){
        AlertDialog.Builder explicar = new AlertDialog.Builder(menu_receita.this);
        explicar.setTitle("Explicação !");
        explicar.setMessage("Aqui será aonde você vai pagar suas faturas, abaixo será demonstrado oque esta sendo cobrado e seus valores, clique no botão para fazer o pagamento...para sair clique fora desse bloco!");
        explicar.create().show();
    }
}