/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Alessandro
 */
public class ModeloVeterinario extends ModeloPessoa implements InterfaceSalario{
    private int idVeterinario;
    private String senhaVeterinario;
    private String loginVeterinario;
    
    public ModeloVeterinario(){}
    
    public ModeloVeterinario(int idVeterinario, String loginVeterinario, String senhaVeterinario, String nome, String cpf, String email, String telefone, String sexo, String dataNascimento, String rua, String cidade, String bairro, int numeroCasa) {
        super(nome, cpf, email, telefone, sexo, dataNascimento, rua, cidade, bairro, numeroCasa);
        this.idVeterinario = idVeterinario;
        this.senhaVeterinario = senhaVeterinario;
        this.loginVeterinario = loginVeterinario;
    }

    public String getLoginVeterinario() {
        return loginVeterinario;
    }

    public void setLoginVeterinario(String loginVeterinario) {
        this.loginVeterinario = loginVeterinario;
    }

    public int getIdVeterinario() {
        return idVeterinario;
    }

    public String getSenhaVeterinario() {
        return senhaVeterinario;
    }

    public void setIdVeterinario(int idVeterinario) {
        this.idVeterinario = idVeterinario;
    }

    public void setSenhaVeterinario(String senhaVeterinario) {
        this.senhaVeterinario = senhaVeterinario;
    }
    
}
