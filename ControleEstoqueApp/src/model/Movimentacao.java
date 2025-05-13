package model;

import java.time.LocalDate;

public class Movimentacao {
    private String tipo; // Entrada ou Saída
    private int quantidade;
    private Produto produto;
    private LocalDate data;

    public Movimentacao(String tipo, int quantidade, Produto produto) {
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.produto = produto;
        this.data = LocalDate.now();
    }

    public String getTipo() { return tipo; }
    public int getQuantidade() { return quantidade; }
    public Produto getProduto() { return produto; }
    public LocalDate getData() { return data; }
}
