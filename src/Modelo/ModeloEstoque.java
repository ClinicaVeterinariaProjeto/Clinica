/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author William
 */
public class ModeloEstoque {
    private String nomeProduto;
    private int quantidadeProduto;
    private float valorProduto;

    public ModeloEstoque(){}
    
    public ModeloEstoque(String nomeProduto, int quantidadeProduto, float valorProduto) {
        this.nomeProduto = nomeProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.valorProduto = valorProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public float getValorProduto() {
        return valorProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public void setValorProduto(float valorProduto) {
        this.valorProduto = valorProduto;
    }
    
    
}
