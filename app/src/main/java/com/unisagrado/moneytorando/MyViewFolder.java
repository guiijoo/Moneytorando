package com.unisagrado.moneytorando;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewFolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView tipoConta;
    TextView valorConta;


    public MyViewFolder(@NonNull View itemView)
    {
        super(itemView);
        imageView = itemView.findViewById(R.id.imagem);
        tipoConta = itemView.findViewById(R.id.tipoConta);
        valorConta = itemView.findViewById(R.id.valorConta);

    }
}
