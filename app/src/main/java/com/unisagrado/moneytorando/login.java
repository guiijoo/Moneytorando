package com.unisagrado.moneytorando;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class login extends AppCompatActivity {

    private EditText editTextUsuario;
    private EditText editTextSenha;
    private Button buttonAvancar,buttonAjuda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        buttonAjuda = findViewById(R.id.ajuda_login_btn);
        editTextUsuario = findViewById(R.id.usuario_login_txt);
        editTextSenha = findViewById(R.id.usuario_senha_txt);
        buttonAvancar = findViewById(R.id.entrar_login_btn);


        buttonAvancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario = editTextUsuario.getText().toString();
                String senha = editTextSenha.getText().toString();
                Intent intent = new Intent(login.this, Creditos.class);
                intent.putExtra("usuario", usuario);
                intent.putExtra("senha", senha);
                startActivity(intent);

            }
        });

    }

    public void BotaoAjuda_login(View view){
        AlertDialog.Builder explicar = new AlertDialog.Builder(login.this);
        explicar.setTitle("Explicação !");
        explicar.setMessage("Aqui será feito seu login do usuario, coloquei sua senha e nome de usuario para conseguir acessar sua conta, qualquer duvida entre em contato com os desenvolvedores para saber melhor as funções...para sair clique para fora dele dialogo!");
        explicar.create().show();
    }
}
