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
    private int senhaVeterinario;
    
    public ModeloVeterinario(){}
    
    public ModeloVeterinario(int idVeterinario, int senhaVeterinario, String nome, String sobrenome, String cpf, String email, String telefone, String sexo, String dataNascimento, String rua, String cidade, String bairro, int numeroCasa) {
        super(nome, sobrenome, cpf, email, telefone, sexo, dataNascimento, rua, cidade, bairro, numeroCasa);
        this.idVeterinario = idVeterinario;
        this.senhaVeterinario = senhaVeterinario;
    }

    public int getIdVeterinario() {
        return idVeterinario;
    }

    public int getSenhaVeterinario() {
        return senhaVeterinario;
    }

    public void setIdVeterinario(int idVeterinario) {
        this.idVeterinario = idVeterinario;
    }

    public void setSenhaVeterinario(int senhaVeterinario) {
        this.senhaVeterinario = senhaVeterinario;
    }
    
}
