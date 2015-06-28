/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Alessandro
 */
public class ModeloFuncionario extends ModeloPessoa implements InterfaceControleDados{
    private int idFuncionario;
    private String senhaFuncionario;

    public ModeloFuncionario() {
    }

    public ModeloFuncionario(int idFuncionario, String senhaFuncionario, String nome, String cpf, String email, String telefone, String sexo, String dataNascimento, String rua, String cidade, String bairro, int numeroCasa) {
        super(nome, cpf, email, telefone, sexo, dataNascimento, rua, cidade, bairro, numeroCasa);
        this.idFuncionario = idFuncionario;
        this.senhaFuncionario = senhaFuncionario;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public String getSenhaFuncionario() {
        return senhaFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public void setSenhaFuncionario(String senhaFuncionario) {
        this.senhaFuncionario = senhaFuncionario;
    }
    
}
