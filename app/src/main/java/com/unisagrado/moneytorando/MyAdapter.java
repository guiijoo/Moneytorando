package com.unisagrado.moneytorando;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewFolder> {

    Context context;
    List<item> items;

    public MyAdapter(Context context, List<item> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewFolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewFolder(LayoutInflater.from(context).inflate(R.layout.item_view,parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewFolder holder, int position) {
        holder.tipoConta.setText(items.get(position).getTipo());
        holder.valorConta.setText(items.get(position).getValor());
        holder.imageView.setImageResource(items.get(position).getImagem());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

}
