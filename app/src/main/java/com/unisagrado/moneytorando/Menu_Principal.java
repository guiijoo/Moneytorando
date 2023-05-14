package com.unisagrado.moneytorando;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.security.Principal;



public class Menu_Principal extends AppCompatActivity {
    //private Button button;
    private TextView nome_usuario_coletado;
    private TextView dinheiro_usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        String nome_usuario = getIntent().getStringExtra("nome_usuario");
        nome_usuario_coletado = findViewById(R.id.nome_usuario_principal_txt);
        nome_usuario_coletado.setText("Seja Bem-vindo "+nome_usuario+"!");

        /////////////////////
        dinheiro_usuario = findViewById(R.id.dinheiro_atual_principal_txt);
        String dinheiro_atualS = dinheiro_usuario.getText().toString();
        float dinheiro_atualF = Float.parseFloat(dinheiro_atualS);
        dinheiro_atualF = 1000.00f;
        Locale ptBr = new Locale("pt", "BR");
        Currency brlCurrency = Currency.getInstance("BRL");
        NumberFormat format = NumberFormat.getCurrencyInstance(ptBr);
        format.setCurrency(brlCurrency);
        String Formatado = format.format(dinheiro_atualF);
        dinheiro_usuario.setText(Formatado);
        //////////////////////



      /* Irei arrumar depois com o tempo, em resumo estou fazendo um menuzinho para escolher as opções das "abas", qualquer informação eu aviso melhor
      button = findViewById(R.id.menu_configurar_principal);
        button.setOnClickListener(new View.OnClickListener() {
          @Override
            public void onClick(View view) {
              exibiropcoes_principal();
            }
        });
      */

    }
    public void BotaoAjuda_principal(View view){
        androidx.appcompat.app.AlertDialog.Builder explicar = new AlertDialog.Builder(Menu_Principal.this);
        explicar.setTitle("Explicação !");
        explicar.setMessage("Aqui Tem todos os seus dados senhor(a) "+nome_usuario_coletado+", embaixo terá seu historico de transações e pagamentos...para fechar clique fora do bloco!");
        explicar.create().show();
    }

    /*Irei arrumar depois com o tempo, em resumo estou fazendo um menuzinho para escolher as opções das "abas", qualquer informação eu aviso melhor
    private void exibiropcoes_principal(View view) {
        CharSequence[] opcoes = {"Opção 1", "Opção 2", "Opção 3","Opção 4"};
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Escolha uma opção");
        builder.setItems(opcoes, new DialogInterface.OnClickListener() {
           @Override
            public void onClick(DialogInterface dialog, int which) {
                //Lógica para lidar com a opção selecionada
              String opcaoSelecionada = opcoes[which].toString();
                Toast.makeText(Menu_Principal.this, "Opção selecionada: " + opcaoSelecionada, Toast.LENGTH_SHORT).show();
            }
       });
        builder.show();
    }
    */
    }




