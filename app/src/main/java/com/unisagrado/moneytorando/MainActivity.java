package com.unisagrado.moneytorando;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editColeta;
    private Button bt_continuar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editColeta = findViewById(R.id.editColeta);
        bt_continuar = findViewById(R.id.bt_continuar);

        bt_continuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                String coleta = editColeta.getText().toString();
                Intent intent = new Intent(MainActivity.this, TelaColetado.class);
                intent.putExtra("coleta", coleta);
                startActivity(intent);
            }
        });

    }
}