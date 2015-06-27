/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Persistencia.Conexao;
import Modelo.ModeloGerente;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;


/**
 *
 * @author William
 */
public class GerenteDAO {
    private Connection conexao;    
    
    public void inserirGerenteNoBanco(ModeloGerente gerente) throws ClassNotFoundException, SQLException{
           
       this.conexao = new Conexao().getConexao();

        
        try{
              
            String query = "INSERT INTO gerente(Nome, Sobrenome, email, Telefone, CPF, DataNascimento, Sexo, idGerente, senhaGerente, Rua, NumeroCasa, Bairro, Cidade) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
 
            PreparedStatement pstmt = conexao.prepareStatement(query);
            pstmt.setString(1, gerente.getNome());
            pstmt.setString(2, gerente.getSobrenome());
            pstmt.setString(3, gerente.getEmail());
            pstmt.setString(4,  gerente.getTelefone());
            pstmt.setString(5, gerente.getCpf());
            pstmt.setString(6, gerente.getDataNascimento());
            pstmt.setString(7, gerente.getSexo());
            pstmt.setInt(8, gerente.getIdGerente());
            pstmt.setString(9, gerente.getSenhaGerente());
            pstmt.setString(10, gerente.getRua());
            pstmt.setInt(11, gerente.getNumeroCasa());
            pstmt.setString(12, gerente.getBairro());
            pstmt.setString(13,gerente.getCidade());
            pstmt.executeUpdate();
            pstmt.close();
            conexao.close();
        } 
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
    
    
    public void alterarGerenteNoBanco (String cpf,ModeloGerente gerente) throws ClassNotFoundException, SQLException{
         this.conexao = new Conexao().getConexao();
    
        try{
            
            String sql ="UPDATE gerente SET Nome = ?, Sobrenome = ?, email = ?, Telefone = ?,"
            + " Rua = ?, NumeroCasa = ?, Bairro = ?, Cidade = ?, senhaGerente =? WHERE CPF=?" ;
            PreparedStatement pstmt = conexao.prepareStatement(sql);
            pstmt.setString(1,gerente.getNome());
            pstmt.setString(2,gerente.getSobrenome());
            pstmt.setString(3,gerente.getEmail());
            pstmt.setString(4,gerente.getTelefone());            
            pstmt.setString(5,gerente.getRua());
            pstmt.setInt(6,gerente.getNumeroCasa());
            pstmt.setString(7,gerente.getBairro());
            pstmt.setString(8,gerente.getCidade());
            pstmt.setString(9,gerente.getSenhaGerente());
            pstmt.setString(10,cpf);
            
            pstmt.execute();
            pstmt.close();
            conexao.close();
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
    
    public void excluirGerenteNoBanco (String cpf) throws ClassNotFoundException, SQLException{
        this.conexao = new Conexao().getConexao();
    
        try{
            
            String sql ="DELETE FROM GERENTE WHERE CPF = ?";
            PreparedStatement pstmt = conexao.prepareStatement(sql);
            pstmt.setString(1,cpf);  
            pstmt.execute();
            pstmt.close();
            conexao.close();
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
    
    public int pesquisaGerenteNoBanco (String cpf) throws ClassNotFoundException, SQLException{
        this.conexao = new Conexao().getConexao();
        //ModeloCliente dadosCliente = new ModeloCliente(); 
        int id = 0;
        ResultSet rs = null;
      try{
          //rs = stmt.executeQuery("select * from cliente where cpf='" +cpf+"';" );
           //PreparedStatement pstmt = this.conexao.prepareStatement("SELECT * FROM cliente WHERE cpf = ?");
          String sql ="Select idGerente  FROM gerente WHERE CPF = ?";
          PreparedStatement pstmt = conexao.prepareStatement(sql); 
          pstmt.setString(1, cpf);
           rs = pstmt.executeQuery();
          while (rs.next()){
             
              //ModeloGerente temp = new ModeloGerente();
              //temp.setIdGerente(rs.getInt("idGerente"));
              
              id=rs.getInt("idGerente");
              
              }
          rs.close();
          pstmt.close();
          conexao.close();
         
          return id;
      }
          catch (SQLException e) { 
                   System.out.println("Erro ao buscar pessoa");
                  
                  }
        return 0;
      }
    
}