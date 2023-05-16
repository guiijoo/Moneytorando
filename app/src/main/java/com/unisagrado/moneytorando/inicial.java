package com.unisagrado.moneytorando;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;
import java.util.Currency;
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

        /*
        dados_historico_inicial_TextView = findViewById(R.id.dados_historico_inicial);
        if(dados_historico_inicial_TextView != null){
            dados_historico_inicial_TextView.setVisibility(View.VISIBLE);
        }else{
            dados_historico_inicial_TextView.setVisibility(View.INVISIBLE);
        }
        */

        /*button = findViewById(R.id.menu_atalho_inicial_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exibirOpcoes();
            }
        });
        */
        String nome_usuario = getIntent().getStringExtra("nome_usuario");
        nome_usuario_coletado = findViewById(R.id.nome_usuario_inicial_txt);
        nome_usuario_coletado.setText("Seja bem-vindo, "+nome_usuario+"!");
        nome_usuarioS = nome_usuario;

        /////////////////////

        TextView dinheiro_usuario = findViewById(R.id.dinheiro_usuario_inicial);
        float dinheiro_atualF = 1000.00f;

        Locale ptBr = new Locale("pt", "BR");
        Currency brlCurrency = Currency.getInstance("BRL");
        NumberFormat format = NumberFormat.getCurrencyInstance(ptBr);
        format.setCurrency(brlCurrency);

        String valorFormatado = format.format(dinheiro_atualF);
        dinheiro_usuario.setText(valorFormatado);
        //////////////////////


    }

    public void BotaoAjuda_principal(View view){
       AlertDialog.Builder explicar = new AlertDialog.Builder(inicial.this);
        explicar.setTitle("Explicação !");
        explicar.setMessage("Aqui Tem todos os seus dados senhor(a) "+nome_usuarioS+", embaixo terá seu historico de transações e pagamentos...para sair clique fora desse bloco!");
        explicar.create().show();
    }

    }
