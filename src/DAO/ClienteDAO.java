/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import Persistencia.Banco;
import Modelo.ModeloCliente;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;

/**
 *
 * @author Alex
 */
public class ClienteDAO {
    
 public void inserirClienteNoBanco(ModeloCliente cliente) throws ClassNotFoundException, SQLException  {  
        //String nome, String sobrenome, String email, String telefone, String cpf, Date dataNascimento, String sexo, int idCliente
        Banco con = new Banco();
        try{
            con.Conecta();
            String sql = "INSERT INTO cliente(Nome, Sobrenome, email, Telefone, CPF, DataNascimento, Sexo, idCliente) VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,cliente.getNome());
            stmt.setString(2,cliente.getSobrenome());
            stmt.setString(3,cliente.getEmail());
            stmt.setString(4,cliente.getTelefone());
            stmt.setString(5,cliente.getCpf());
            stmt.setString(6,cliente.getDataNascimento());
            stmt.setString(7,cliente.getSexo());
            stmt.setInt(8, cliente.getIdCliente());
            //endereço 
            stmt.setString(9,cliente.getRua());
            stmt.setInt(10,cliente.getNumeroCasa());
            stmt.setString(11,cliente.getBairro());
            stmt.setString(12,cliente.getCidade());
            stmt.execute();
            con.Desconecta();
        } 
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
    
    
    public void pesquisaClienteNoBanco (String cpf) throws ClassNotFoundException, SQLException{
        Banco con = new Banco();
        con.Conecta();
        Statement stmt = null;
        ResultSet rs = null;
      
        
        rs = stmt.executeQuery("SELECT * FROM Cliente ");
        ResultSetMetaData metaData = rs.getMetaData();
        
        while((rs.next())) {
            if(metaData.getColumnName(5).equals(cpf))
                break;                 
        }       
    }
    
    public void alterarClienteNoBanco (String cpf,ModeloCliente cliente) throws ClassNotFoundException, SQLException{
    Banco con = new Banco();
        try{
            con.Conecta();
            String sql ="UPDATE CLIENTE SET Nome = ?, Sobrenome = ?, email = ?, Telefone = ?,"
            + " DataNascimento = ?, Sexo = ? WHERE CPF=?" ;
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,cliente.getNome());
            stmt.setString(2,cliente.getSobrenome());
            stmt.setString(3,cliente.getEmail());
            stmt.setString(4,cliente.getTelefone());            
            stmt.setString(5,cliente.getDataNascimento());
            stmt.setString(6,cliente.getSexo());
            stmt.setString(7,cpf);
            //endereço
            stmt.setString(9,cliente.getRua());
            stmt.setInt(10,cliente.getNumeroCasa());
            stmt.setString(11,cliente.getBairro());
            stmt.setString(12,cliente.getCidade());
            
            stmt.execute();
            con.Desconecta();
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
    
    public void excluirClienteNoBanco (String cpf) throws ClassNotFoundException, SQLException{
    Banco con = new Banco();
    
        try{
            con.Conecta();
            String sql ="DELETE FROM CLIENTE WHERE CPF = ?";
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
