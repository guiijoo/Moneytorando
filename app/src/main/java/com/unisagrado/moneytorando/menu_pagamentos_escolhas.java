package com.unisagrado.moneytorando;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class menu_pagamentos_escolhas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagamentos);
    }

    public void BotaoAjuda_pagamentos(View view){
        AlertDialog.Builder explicar = new AlertDialog.Builder(menu_pagamentos_escolhas.this);
        explicar.setTitle("Explicação !");
        explicar.setMessage("Aqui você vai escolher qual pagamento deverá quitar primeiro, cada simbolo representa taxas diferentes, escolha sabiamente qual começar!...para sair clique fora desse bloco! ");
        explicar.create().show();
    }
}