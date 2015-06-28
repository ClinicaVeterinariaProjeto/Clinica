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
public class ModeloAnimal {
    private String nome;
    private String raca;
    private String tipo;
    private float peso;
    private String ultimaVascina;
    private int anoNascimento;
    private int idAnimal;
    private int idDono;
    private int idFuncionario;
    private int idVeterinario;
    
    public ModeloAnimal(){}

    public ModeloAnimal(String nome, String raca, String tipo, float peso, String ultimaVascina, int anoNascimento, int idAnimal, int idDono, int idVeterinario) {
        this.nome = nome;
        this.raca = raca;
        this.tipo = tipo;
        this.peso = peso;
        this.ultimaVascina = ultimaVascina;
        this.anoNascimento = anoNascimento;
        this.idAnimal = idAnimal;
        this.idDono = idDono;
        this.idVeterinario = idVeterinario;
    }
        

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public String getTipo() {
        return tipo;
    }

    public float getPeso() {
        return peso;
    }

    public String getUltimaVascina() {
        return ultimaVascina;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public int getIdDono() {
        return idDono;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public int getIdVeterinario() {
        return idVeterinario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setUltimaVascina(String ultimaVascina) {
        this.ultimaVascina = ultimaVascina;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public void setIdDono(int idDono) {
        this.idDono = idDono;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public void setIdVeterinario(int idVeterinario) {
        this.idVeterinario = idVeterinario;
    }

    
    
    
}
