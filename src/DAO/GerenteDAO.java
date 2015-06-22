/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.ModeloGerente;
import Persistencia.Banco;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 *
 * @author William
 */
public class GerenteDAO {
        
    
    public void inserirGerenteNoBanco(ModeloGerente gerente) throws ClassNotFoundException, SQLException{
    Banco con = new Banco();
        try{
            con.Conecta();
            String sql = "INSERT INTO Gerente() VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,gerente.getNome());
            stmt.setString(2,gerente.getSobrenome());
            stmt.setString(3,gerente.getEmail());
            stmt.setString(4,gerente.getTelefone());
            stmt.setString(5,gerente.getCpf());
            stmt.setString(6,gerente.getDataNascimento());
            stmt.setString(7,gerente.getSexo());
            stmt.setInt(8,gerente.getIdGerente());
            stmt.setInt(9,gerente.getSenhaGerente());
            //endereço
            stmt.setString(9,gerente.getRua());
            stmt.setInt(10,gerente.getNumeroCasa());
            stmt.setString(11,gerente.getBairro());
            stmt.setString(12,gerente.getCidade());
            
            stmt.execute();
            con.Desconecta();
        } 
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
    
    public void alterarGerenteNoBanco (String cpf,ModeloGerente gerente) throws ClassNotFoundException, SQLException{
        Banco con = new Banco();
        try{
            con.Conecta();
            String sql ="UPDATE Gerente SET Nome = ?, Sobrenome = ?, email = ?, Telefone = ?,"
            + " DataNascimento = ?, Sexo = ? WHERE CPF=?" ;
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,gerente.getNome());
            stmt.setString(2,gerente.getSobrenome());
            stmt.setString(3,gerente.getEmail());
            stmt.setString(4,gerente.getTelefone());            
            stmt.setString(5,gerente.getDataNascimento());
            stmt.setString(6,gerente.getSexo());
            stmt.setString(7,cpf);
            //endereço
            stmt.setString(9,gerente.getRua());
            stmt.setInt(10,gerente.getNumeroCasa());
            stmt.setString(11,gerente.getBairro());
            stmt.setString(12,gerente.getCidade());
            
            stmt.execute();
            con.Desconecta();
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
    
    public void excluirGerenteNoBanco (String cpf) throws ClassNotFoundException, SQLException{
        Banco con = new Banco();
    
        try{
            con.Conecta();
            String sql ="DELETE FROM Gerente WHERE CPF = ?";
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
