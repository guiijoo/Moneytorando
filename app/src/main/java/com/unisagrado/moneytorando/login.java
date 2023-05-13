package com.unisagrado.moneytorando;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class login extends AppCompatActivity {

    private EditText editTextUsuario;
    private EditText editTextSenha;
    private Button buttonAvancar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextUsuario = findViewById(R.id.usuario_login_txt);
        editTextSenha = findViewById(R.id.usuario_senha_txt);
        buttonAvancar = findViewById(R.id.entrar_btn);

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
}
