/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Persistencia;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.*;
import java.sql.DriverManager;
/**
 *
 * @author Alex
 */
// teste
public class Conexao {
    private String url = "jdbc:mysql://localhost:3306/clinica";
    private String login = "root";
    private String senha = "alex123";
    private com.mysql.jdbc.Connection conexao;
    private Statement stmt;


    public void setUrl(String url) {
        this.url = url;
    }
    
    public void setLogin(String login){
        this.login = login;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    public void setConexao(com.mysql.jdbc.Connection conexao) {
        this.conexao = conexao;
    }

    public void setStmt(Statement stmt) {
        this.stmt = stmt;
    }

    public String getUrl() {
        return this.url;
    }
    
    public String getLogin(){
        return login;
    }
    
    public String getSenha() {
        return this.senha;
    }

    public com.mysql.jdbc.Connection getConexao() {
        return this.conexao;
    }

    public Statement getStmt() {
        return this.stmt;
    }


    public Conexao() throws ClassNotFoundException{
        try {
           this.conexao = (com.mysql.jdbc.Connection) DriverManager.getConnection(this.url, this.login, this.senha);
            this.stmt = (Statement) this.conexao.createStatement();
           
        }
        catch (SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
    
    }     

    public void Desconecta(){
        try
        {
        stmt.close();
        conexao.close();
        }
        catch(Exception exception)
        {
        exception.printStackTrace();
        }
    }

    public PreparedStatement prepareStatement(String sql) throws SQLException {
      stmt = (Statement) conexao.createStatement();
        return null;
    }
    //criando o banco
    public void geraDb() {
        
        try{
            this.conexao = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", this.login, this.senha);
            this.stmt = (Statement) this.conexao.createStatement();
            String sql = ("CREATE DATABASE IF NOT EXISTS clinica; ");
            stmt.executeUpdate(sql);
            
            stmt.close();
            conexao.close();
        }
        catch (SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
    }
    public void criaTabelaEstoque(){
        try{
            this.conexao = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/clinica", this.login, this.senha);
            this.stmt = (Statement) this.conexao.createStatement();
            String sql = ("CREATE TABLE IF NOT EXISTS estoque("
                    + "NomeProduto varchar(30) not null,"
                    + "Quantidade integer not null,"
                    + "ValorProduto float not null"
                    + "); ");
            stmt.executeUpdate(sql);
            
            stmt.close();
            conexao.close();
        }
        catch (SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
    }
    
    public void criaTabelaGerente(){
        try{
            this.conexao = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/clinica", this.login, this.senha);
            this.stmt = (Statement) this.conexao.createStatement();
            String sql = ("CREATE TABLE IF NOT EXISTS gerente("
                         + "Nome VARCHAR (50) not null," 
                         + " email varchar (45) not null," 
                         + " Telefone varchar (45) not null," 
                         + " CPF varchar (45) not null," 
                         + " DataNascimento date not null," 
                         + " Sexo varchar(10)  not null," 
                         + " idGerente integer not null auto_increment," 
                         + " loginGerente varchar(10) not null," 
                         + " senhaGerente varchar (20) not null," 
                         + " Rua varchar (60) not null," 
                         + " NumeroCasa integer not null," 
                         + " Bairro varchar (20) not null," 
                         + " Cidade varchar (20) not null," 
                         + " primary key (idGerente)"
                         + "); ");
            stmt.executeUpdate(sql);
            
            stmt.close();
            conexao.close();
        }
        catch (SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
    }
    
    public void criaTabelaCliente(){
        try{
            this.conexao = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/clinica", this.login, this.senha);
            this.stmt = (Statement) this.conexao.createStatement();
            String sql = ("CREATE TABLE IF NOT EXISTS cliente("
                         + " Nome VARCHAR (50) not null," 
                         + " email varchar (45) not null," 
                         + " Telefone varchar (45) not null," 
                         + " CPF varchar (45) not null," 
                         + " DataNascimento date not null," 
                         + " Sexo varchar(10)  not null," 
                         + " idCliente integer not null auto_increment," 
                         + " Rua varchar (60) not null," 
                         + " NumeroCasa integer not null," 
                         + " Bairro varchar (20) not null," 
                         + " Cidade varchar (20) not null," 
                         + " primary key (idCliente)"
                         + "); ");
            stmt.executeUpdate(sql);
            
            stmt.close();
            conexao.close();
        }
        catch (SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
    }
    
    public void criaTabelaFuncionario(){
        try{
            this.conexao = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/clinica", this.login, this.senha);
            this.stmt = (Statement) this.conexao.createStatement();
            String sql = ("CREATE TABLE IF NOT EXISTS funcionario("
                         + "Nome VARCHAR (50) not null," 
                         + " email varchar (45) not null," 
                         + " Telefone varchar (45) not null," 
                         + " CPF varchar (45) not null," 
                         + " DataNascimento date not null," 
                         + " Sexo varchar(10)  not null," 
                         + " idFuncionario integer not null auto_increment," 
                         + " loginFuncionario varchar(10) not null," 
                         + " senhaFuncionario varchar (20) not null," 
                         + " Rua varchar (60) not null," 
                         + " NumeroCasa integer not null," 
                         + " Bairro varchar (20) not null," 
                         + " Cidade varchar (20) not null," 
                         + " primary key (idFuncionario),"
                         + " idGerente integer,"
                         + " foreign key (idGerente) references Gerente (idGerente)"
                         + "); ");
            stmt.executeUpdate(sql);
            
            stmt.close();
            conexao.close();
        }
        catch (SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
    }
    
    public void criaTabelaVeterinario(){
        try{
            this.conexao = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/clinica", this.login, this.senha);
            this.stmt = (Statement) this.conexao.createStatement();
            String sql = ("CREATE TABLE IF NOT EXISTS veterinario("
                         + " Nome VARCHAR (50) not null," 
                         + " email varchar (45) not null," 
                         + " Telefone varchar (45) not null," 
                         + " CPF varchar (45) not null," 
                         + " DataNascimento date not null," 
                         + " Sexo varchar(10)  not null," 
                         + " idVeterinario integer not null auto_increment," 
                         + " loginVeterinario varchar(10) not null," 
                         + " senhaVeterinario varchar (20) not null," 
                         + " Rua varchar (60) not null," 
                         + " NumeroCasa integer not null," 
                         + " Bairro varchar (20) not null," 
                         + " Cidade varchar (20) not null," 
                         + " primary key (idVeterinario),"
                         + " idGerente integer not null,"
                         + "foreign key (idGerente) references Gerente(idGerente)"
                         + "); ");
            stmt.executeUpdate(sql);
            
            stmt.close();
            conexao.close();
        }
        catch (SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
    }
    
    public void criaTabelaAnimal(){
        try{
            this.conexao = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/clinica", this.login, this.senha);
            this.stmt = (Statement) this.conexao.createStatement();
            String sql = ("CREATE TABLE IF NOT EXISTS animal("
                         + " TipoAnimal varchar (9) not null," 
                         + " raca varchar (20) not null," 
                         + " nome varchar (30) not null," 
                         + " AnoNascimento integer not null," 
                         + " Peso float not null," 
                         + " Data_vasc date  not null," 
                         + " idAnimal integer not null auto_increment," 
                         + " idCliente integer not null," 
                         + " primary key (idAnimal)," 
                         + " foreign key (idCliente) references Cliente (idCliente)"
                         + "); ");
            stmt.executeUpdate(sql);
            
            stmt.close();
            conexao.close();
        }
        catch (SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
    }
    
    public void criaTabelaConsulta(){
        try{
            this.conexao = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/clinica", this.login, this.senha);
            this.stmt = (Statement) this.conexao.createStatement();
            String sql = ("CREATE TABLE IF NOT EXISTS consulta("
                         + " dia integer not null," 
                         + " mes integer not null," 
                         + " horario integer not null," 
                         + " valor float not null," 
                         + " idCliente integer not null," 
                         + " idAnimal integer not null," 
                         + " foreign key (idCliente) references cliente (idCliente)," 
                         + " foreign key (idAnimal) references animal (idAnimal)"
                         + "); ");
            stmt.executeUpdate(sql);
            
            stmt.close();
            conexao.close();
        }
        catch (SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
    }
    
}
