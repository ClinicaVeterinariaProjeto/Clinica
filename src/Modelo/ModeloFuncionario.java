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
    private String loginFuncionario;

    public ModeloFuncionario() {
    }

    public ModeloFuncionario(int idFuncionario, String loginFuncionario,String senhaFuncionario, String nome, String cpf, String email, String telefone, String sexo, String dataNascimento, String rua, String cidade, String bairro, int numeroCasa) {
        super(nome, cpf, email, telefone, sexo, dataNascimento, rua, cidade, bairro, numeroCasa);
        this.idFuncionario = idFuncionario;
        this.senhaFuncionario = senhaFuncionario;
        this.loginFuncionario = loginFuncionario;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public String getLoginFuncionario() {
        return loginFuncionario;
    }

    public void setLoginFuncionario(String loginFuncionario) {
        this.loginFuncionario = loginFuncionario;
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
