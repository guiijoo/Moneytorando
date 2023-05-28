package com.unisagrado.moneytorando;

public class item {
    String tipo;
    String valor;
    int imagem;

    public item(String tipo, String valor, int imagem) {
        this.tipo = tipo;
        this.valor = valor;
        this.imagem = imagem;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
