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
public abstract class ModeloPessoa {
    
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private String sexo;
    private String dataNascimento;
    // endereço 
    private String rua;
    private String cidade;
    private String bairro;
    private int numeroCasa;

    
    public ModeloPessoa() {
    }
 
    public ModeloPessoa(String nome, String cpf, String email, String telefone, String sexo, String dataNascimento, String rua, String cidade, String bairro, int numeroCasa) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setEmail(email);
        this.setTelefone(telefone);
        this.setSexo(sexo);
        this.setDataNascimento(dataNascimento);
        this.setRua(rua);
        this.setCidade(cidade);
        this.setBairro(bairro);
        this.setNumeroCasa(numeroCasa);
    }

    public String getNome() {
        return nome;
    }


    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getSexo() {
        return sexo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getRua() {
        return rua;
    }

    public String getCidade() {
        return cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    @Override
    public String toString() {
        return "ModeloPessoa{" + "nome=" + this.getNome() + "cpf=" + this.getCpf() + ", email=" 
                + this.getEmail() + ", sexo=" + this.getSexo() + ", dataNascimento="
                + this.getDataNascimento() + ", rua=" 
                + this.getRua() + ", cidade=" + this.getCidade() + ", bairro=" 
                + this.getBairro() + ", numeroCasa=" + this.getNumeroCasa() + '}';
    }

}
