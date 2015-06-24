/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import Persistencia.Conexao;
import Modelo.ModeloCliente;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;

/**
 *
 * @author Alex
 */
public class ClienteDAO {
    
 public void inserirClienteNoBanco(ModeloCliente cliente) throws ClassNotFoundException, SQLException, Exception  {  
        try {     
        Conexao con = new Conexao();
           com.mysql.jdbc.Statement stmt = con.getStmt();
           
           
           stmt.execute("insert into cliente(Nome, Sobrenome, email, Telefone, CPF, DataNascimento, Sexo, idCliente, Rua, NumeroCasa, Bairro, Cidade)"+ 
                   "values('"+cliente.getNome()+"', '"+cliente.getSobrenome()+"','"+cliente.getEmail()+"', '"+cliente.getTelefone()+"', '"+cliente.getCpf()+"', '"+cliente.getDataNascimento()+"', '"+cliente.getSexo()+"', '"+cliente.getIdCliente()+"','"+cliente.getRua()+"', '"+cliente.getNumeroCasa()+"', '"+cliente.getBairro()+"', '"+cliente.getCidade()+"');");
            }
           catch (Exception e) {
            System.out.println("Problemas Ocorreram");
            e.printStackTrace();
            throw new Exception("Erro ao Salvar Dados!");
        }
           
 }
        
        
       /*Conexao con = new Conexao();

        
        try{
              
            //com.mysql.jdbc.Statement st = con.getStmt();
            String query = "INSERT INTO cliente(Nome, Sobrenome, email, Telefone, CPF, DataNascimento, Sexo, idCliente, Rua, NumeroCasa, Bairro, Cidade) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
 
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, cliente.getNome());
            pstmt.setString(2, cliente.getSobrenome());
            pstmt.setString(3, cliente.getEmail());
            pstmt.setString(4,  cliente.getTelefone());
            pstmt.setString(5, cliente.getCpf());
            pstmt.setString(6, cliente.getDataNascimento());
            pstmt.setString(7, cliente.getSexo());
            pstmt.setInt(8, cliente.getIdCliente());
            pstmt.setString(9, cliente.getRua());
            pstmt.setInt(10, cliente.getNumeroCasa());
            pstmt.setString(11, cliente.getBairro());
            pstmt.setString(12,cliente.getCidade());
            pstmt.executeUpdate();
            con.Desconecta();
        } 
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }*/
    
    
    public ModeloCliente pesquisaClienteNoBanco (String cpf) throws ClassNotFoundException, SQLException{
        Conexao con = new Conexao();
        ModeloCliente dadosCliente = new ModeloCliente(); 
        com.mysql.jdbc.Statement stmt = con.getStmt();
        ResultSet rs = null;
      try{
          rs = stmt.executeQuery("select * from cliente where cpf='" +cpf+"';" );
          while (rs.next()){
              ModeloCliente temp = new ModeloCliente();
              temp.setCpf(rs.getString("cpf"));
              temp.setNome(rs.getString("nome"));
              temp.setSobrenome(rs.getString("sobrenome"));
              temp.setEmail(rs.getString("email"));
              temp.setTelefone(rs.getString("telefone"));
              temp.setDataNascimento(rs.getString("datanasciemnto"));
              temp.setSexo(rs.getString("sexo"));
              temp.setIdCliente(rs.getInt("idCliente"));
              temp.setRua(rs.getString("rua"));
              temp.setNumeroCasa(rs.getInt("numerocasa"));
              temp.setBairro(rs.getString("bairro"));
              temp.setCidade(rs.getString("cidade"));
              dadosCliente=temp;
              }
         
          return dadosCliente;
      }
          catch (SQLException e) { 
                   System.out.println("Erro ao buscar pessoa");
                   return null;
                  }
      }
        
            
    
    public void alterarClienteNoBanco (String cpf,ModeloCliente cliente) throws ClassNotFoundException, SQLException{
    Conexao con = new Conexao();
        try{
            con.Conecta();
            String sql ="UPDATE CLIENTE SET Nome = ?, Sobrenome = ?, email = ?, Telefone = ?,"
            + " Rua = ?, NumeroCasa = ?, Bairro = ?, Cidade = ? WHERE CPF=?" ;
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,cliente.getNome());
            stmt.setString(2,cliente.getSobrenome());
            stmt.setString(3,cliente.getEmail());
            stmt.setString(4,cliente.getTelefone());            
            stmt.setString(5,cliente.getRua());
            stmt.setInt(6,cliente.getNumeroCasa());
            stmt.setString(7,cliente.getBairro());
            stmt.setString(8,cliente.getCidade());
            stmt.setString(9,cpf);
            
            stmt.execute();
            con.Desconecta();
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
    
    public void excluirClienteNoBanco (String cpf) throws ClassNotFoundException, SQLException{
    Conexao con = new Conexao();
    
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
