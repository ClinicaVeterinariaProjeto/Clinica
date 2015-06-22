/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.ModeloFuncionario;
import Persistencia.Banco;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author William
 */
public class FuncionarioDAO {
    
    
    public void inserirFuncionarioNoBanco(ModeloFuncionario funcionario) throws ClassNotFoundException, SQLException{
    Banco con = new Banco();
        try{
            con.Conecta();
            String sql = "INSERT INTO funcionario(Nome, Sobrenome, email, Telefone, CPF, DataNascimento, Sexo, idFuncionario, senhaFuncionario) VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,funcionario.getNome());
            stmt.setString(2,funcionario.getSobrenome());
            stmt.setString(3,funcionario.getEmail());
            stmt.setString(4,funcionario.getTelefone());
            stmt.setString(5,funcionario.getCpf());
            stmt.setString(6,funcionario.getDataNascimento());
            stmt.setString(7,funcionario.getSexo());
            stmt.setInt(8,funcionario.getIdFuncionario());
            stmt.setInt(9,funcionario.getSenhaFuncionario());
            //endereço
            stmt.setString(9,funcionario.getRua());
            stmt.setInt(10,funcionario.getNumeroCasa());
            stmt.setString(11,funcionario.getBairro());
            stmt.setString(12,funcionario.getCidade());
            
            stmt.execute();
            con.Desconecta();
        } 
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
    
    public void pesquisaFuncionarioNoBanco (String cpf) throws ClassNotFoundException, SQLException{
        Banco con = new Banco();
        con.Conecta();
        Statement stmt = null;
        ResultSet rs = null;
      
        
        rs = stmt.executeQuery("SELECT * FROM Funcionario ");
        ResultSetMetaData metaData = rs.getMetaData();
        
        while((rs.next())) {
            if(metaData.getColumnName(5).equals(cpf))
                break; 
        }       
    }
    
    public void alterarFuncionarioNoBanco (String cpf,ModeloFuncionario funcionario) throws ClassNotFoundException, SQLException{
        Banco con = new Banco();
        try{
            con.Conecta();
            String sql ="UPDATE FUNCIONARIO SET Nome = ?, Sobrenome = ?, email = ?, Telefone = ?,"
            + " DataNascimento = ?, Sexo = ? WHERE CPF=?" ;
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,funcionario.getNome());
            stmt.setString(2,funcionario.getSobrenome());
            stmt.setString(3,funcionario.getEmail());
            stmt.setString(4,funcionario.getTelefone());            
            stmt.setString(5,funcionario.getDataNascimento());
            stmt.setString(6,funcionario.getSexo());
            stmt.setString(7,cpf);
            //endereço
            stmt.setString(9,funcionario.getRua());
            stmt.setInt(10,funcionario.getNumeroCasa());
            stmt.setString(11,funcionario.getBairro());
            stmt.setString(12,funcionario.getCidade());
            
            stmt.execute();
            con.Desconecta();
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
    
    public void excluirFuncionarioNoBanco (String cpf) throws ClassNotFoundException, SQLException{
        Banco con = new Banco();
    
        try{
            con.Conecta();
            String sql ="DELETE FROM Funcionario WHERE CPF = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,cpf);  
            stmt.execute();
            con.Desconecta();
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
    
    
    public void agendarConsulta (){
    
    }
    public void alterarDataConsulta(){
    }
}
