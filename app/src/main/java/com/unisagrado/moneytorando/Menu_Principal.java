package com.unisagrado.moneytorando;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Menu_Principal extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
       //VOU REFAZER ESSA PARTE NOVAMENTE
       // button = findViewById(R.id.menu_configurar);
        //button.setOnClickListener(new View.OnClickListener() {
          //  @Override
            //public void onClick(View v) {
              //  exibirOpcoes();
            //}
        //});
    }
    //private void exibirOpcoes() {
        //CharSequence[] opcoes = {"Opção 1", "Opção 2", "Opção 3"};

        //AlertDialog.Builder builder = new AlertDialog.Builder(this);
        //builder.setTitle("Escolha uma opção");
        //builder.setItems(opcoes, new DialogInterface.OnClickListener() {
           // @Override
            //public void onClick(DialogInterface dialog, int which) {
                // Lógica para lidar com a opção selecionada
              //  String opcaoSelecionada = opcoes[which].toString();
                //Toast.makeText(Menu_Principal.this, "Opção selecionada: " + opcaoSelecionada, Toast.LENGTH_SHORT).show();
            //}
       // });
        //builder.show();
    }




