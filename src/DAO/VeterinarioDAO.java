/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.ModeloVeterinario;
import Persistencia.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author William
 */

public class VeterinarioDAO {
    public void inserirVeterinarioNoBanco(ModeloVeterinario funcionario) throws ClassNotFoundException, SQLException{
        Conexao con = new Conexao();
        try{
            con.Conecta();
            String sql = "INSERT INTO veterinario(Nome, Sobrenome, email, Telefone, CPF, DataNascimento, Sexo, idVeterinario, senhaVeterinario) VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,funcionario.getNome());
            stmt.setString(2,funcionario.getSobrenome());
            stmt.setString(3,funcionario.getEmail());
            stmt.setString(4,funcionario.getTelefone());
            stmt.setString(5,funcionario.getCpf());
            stmt.setString(6,funcionario.getDataNascimento());
            stmt.setString(7,funcionario.getSexo());
            stmt.setInt(8,funcionario.getIdVeterinario());
            stmt.setInt(9,funcionario.getSenhaVeterinario());
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
    
    public void pesquisarVeterinarioNoBanco (String cpf) throws ClassNotFoundException, SQLException{
        Conexao con = new Conexao();
        con.Conecta();
        Statement stmt = null;
        ResultSet rs = null;
      
        
        rs = stmt.executeQuery("SELECT * FROM Veterinario ");
        ResultSetMetaData metaData = rs.getMetaData();
        
        while((rs.next())) {
            if(metaData.getColumnName(5).equals(cpf))
                break; 
        }       
    }
    
    public void alterarVeterinarioNoBanco (String cpf,ModeloVeterinario veterinario) throws ClassNotFoundException, SQLException{
        Conexao con = new Conexao();
        try{
            con.Conecta();
            String sql ="UPDATE Veterinario SET Nome = ?, Sobrenome = ?, email = ?, Telefone = ?,"
            + " DataNascimento = ?, Sexo = ? WHERE CPF=?" ;
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,veterinario.getNome());
            stmt.setString(2,veterinario.getSobrenome());
            stmt.setString(3,veterinario.getEmail());
            stmt.setString(4,veterinario.getTelefone());            
            stmt.setString(5,veterinario.getDataNascimento());
            stmt.setString(6,veterinario.getSexo());
            stmt.setString(7,cpf);
            //endereço
            stmt.setString(9,veterinario.getRua());
            stmt.setInt(10,veterinario.getNumeroCasa());
            stmt.setString(11,veterinario.getBairro());
            stmt.setString(12,veterinario.getCidade());
            
            stmt.execute();
            con.Desconecta();
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
    
    public void excluirVeterinarioNoBanco (String cpf) throws ClassNotFoundException, SQLException{
        Conexao con = new Conexao();
    
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
}
