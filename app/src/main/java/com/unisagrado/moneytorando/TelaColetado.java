package com.unisagrado.moneytorando;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class TelaColetado extends AppCompatActivity {

    private TextView textColetado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_coletado);
        String coleta = getIntent().getStringExtra("coleta");

        textColetado=findViewById(R.id.textColetado);

        textColetado.setText(coleta);


    }
}