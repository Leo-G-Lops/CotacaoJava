package com.example.cotacao;

import jakarta.persistence.*;

@Entity
public class Cotacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String produto;
    private double preco;
    private int quantidade;
    private double total;
    private double imposto;
    private double valorFinal;
    private String status;

    public Long getId() {
        return id;
    }

    public String getProduto(){
        return produto;
    }
    public void setProduto(String produto){
        this.produto = produto;
    }

     public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }

     public int getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public double getTotal(){
        return total;
    }
    public void setTotal(double total){
        this.total = total;
    }

    public double getImposto(){
        return imposto;
    }
    public void setImposto(double imposto){
        this.imposto = imposto;
    }

    public double getValorFinal(){
        return valorFinal;
    }
    public void setValorFinal(double valorFinal){
        this.valorFinal = valorFinal;
    }

    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }
}
