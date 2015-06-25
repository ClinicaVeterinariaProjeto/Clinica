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
     private Connection conexao;
    
 public void inserirClienteNoBanco(ModeloCliente cliente) throws ClassNotFoundException, SQLException, Exception  {  
      /* try {     
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
           
 }*/
        
        
       this.conexao = new Conexao().getConexao();

        
        try{
              
            String query = "INSERT INTO cliente(Nome, Sobrenome, email, Telefone, CPF, DataNascimento, Sexo, idCliente, Rua, NumeroCasa, Bairro, Cidade) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
 
            PreparedStatement pstmt = conexao.prepareStatement(query);
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
            pstmt.close();
            conexao.close();
        } 
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
    
    
    public ModeloCliente pesquisaClienteNoBanco (String cpf) throws ClassNotFoundException, SQLException{
        this.conexao = new Conexao().getConexao();
        ModeloCliente dadosCliente = new ModeloCliente(); 
        
        ResultSet rs = null;
      try{
          //rs = stmt.executeQuery("select * from cliente where cpf='" +cpf+"';" );
           //PreparedStatement pstmt = this.conexao.prepareStatement("SELECT * FROM cliente WHERE cpf = ?");
          String sql ="Select cpf, nome, sobrenome, email, telefone, DataNascimento, sexo, idCliente, rua, numeroCasa, bairro, cidade  FROM CLIENTE WHERE CPF = ?";
          PreparedStatement pstmt = conexao.prepareStatement(sql); 
          pstmt.setString(1, cpf);
           rs = pstmt.executeQuery();
          while (rs.next()){
             
              ModeloCliente temp = new ModeloCliente();
              temp.setCpf(rs.getString("cpf"));
              temp.setNome(rs.getString("nome"));
              temp.setSobrenome(rs.getString("sobrenome"));
              temp.setEmail(rs.getString("email"));
              temp.setTelefone(rs.getString("telefone"));
              temp.setDataNascimento(rs.getString("datanascimento"));
              temp.setSexo(rs.getString("sexo"));
              temp.setIdCliente(rs.getInt("idCliente"));
              temp.setRua(rs.getString("rua"));
              temp.setNumeroCasa(rs.getInt("numeroCasa"));
              temp.setBairro(rs.getString("bairro"));
              temp.setCidade(rs.getString("cidade"));
              dadosCliente=temp;
              
              }
          rs.close();
          pstmt.close();
          conexao.close();
         
          return dadosCliente;
      }
          catch (SQLException e) { 
                   System.out.println("Erro ao buscar pessoa");
                   return null;
                  }
      }
        
            
    
    public void alterarClienteNoBanco (String cpf,ModeloCliente cliente) throws ClassNotFoundException, SQLException{
    this.conexao = new Conexao().getConexao();
    
        try{
            
            String sql ="UPDATE CLIENTE SET Nome = ?, Sobrenome = ?, email = ?, Telefone = ?,"
            + " Rua = ?, NumeroCasa = ?, Bairro = ?, Cidade = ? WHERE CPF=?" ;
            PreparedStatement pstmt = conexao.prepareStatement(sql);
            pstmt.setString(1,cliente.getNome());
            pstmt.setString(2,cliente.getSobrenome());
            pstmt.setString(3,cliente.getEmail());
            pstmt.setString(4,cliente.getTelefone());            
            pstmt.setString(5,cliente.getRua());
            pstmt.setInt(6,cliente.getNumeroCasa());
            pstmt.setString(7,cliente.getBairro());
            pstmt.setString(8,cliente.getCidade());
            pstmt.setString(9,cpf);
            
            pstmt.execute();
            pstmt.close();
            conexao.close();
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
    
    public void excluirClienteNoBanco (String cpf) throws ClassNotFoundException, SQLException{
    this.conexao = new Conexao().getConexao();
    
        try{
            
            String sql ="DELETE FROM CLIENTE WHERE CPF = ?";
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


}
