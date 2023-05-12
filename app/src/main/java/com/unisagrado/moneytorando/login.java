package com.unisagrado.moneytorando;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class login extends AppCompatActivity {

    private EditText editUsuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        
        editTextUsuario = findViewById(R.id.editTextUsuario);
        editTextSenha = findViewById(R.id.editTextSenha);
        buttonAvancar = findViewById(R.id.buttonAvancar);

        buttonAvancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario = editTextUsuario.getText().toString();
                String senha = editTextSenha.getText().toString();
                Intent intent = new Intent(Creditos.this, MainActivity.class);
                intent.putExtra("usuario", usuario);
                intent.putExtra("senha", senha);
                startActivity(intent);

    }
}
