/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author William
 */
public class ModeloGerente extends ModeloPessoa {
    
    private int idGerente;
    private String senhaGerente;

    public ModeloGerente() {
    }

    public ModeloGerente(int idGerente, String senhaGerente, String nome, String sobrenome, String cpf, String email, String telefone, String sexo, String dataNascimento, String rua, String cidade, String bairro, int numeroCasa) {
        super(nome, sobrenome, cpf, email, telefone, sexo, dataNascimento, rua, cidade, bairro, numeroCasa);
        this.idGerente = idGerente;
        this.senhaGerente = senhaGerente;
    }

    public int getIdGerente() {
        return idGerente;
    }

    public String getSenhaGerente() {
        return senhaGerente;
    }

    public void setIdGerente(int idGerente) {
        this.idGerente = idGerente;
    }

    public void setSenhaGerente(String senhaGerente) {
        this.senhaGerente = senhaGerente;
    }
 
}
