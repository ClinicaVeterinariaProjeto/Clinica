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
    
    public boolean inserirGerenteNoBanco(ModeloGerente gerente) throws ClassNotFoundException, SQLException{
           
       this.conexao = new Conexao().getConexao();

        
        try{
              
            String query = "INSERT INTO gerente(Nome, email, Telefone, CPF, DataNascimento, Sexo, idGerente, loginGerente, senhaGerente, Rua, NumeroCasa, Bairro, Cidade) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
 
            PreparedStatement pstmt = conexao.prepareStatement(query);
            pstmt.setString(1, gerente.getNome());
            pstmt.setString(2, gerente.getEmail());
            pstmt.setString(3,  gerente.getTelefone());
            pstmt.setString(4, gerente.getCpf());
            pstmt.setString(5, gerente.getDataNascimento());
            pstmt.setString(6, gerente.getSexo());
            pstmt.setInt(7, gerente.getIdGerente());
            pstmt.setString(8, gerente.getLoginGerente());
            pstmt.setString(9, gerente.getSenhaGerente());
            pstmt.setString(10, gerente.getRua());
            pstmt.setInt(11, gerente.getNumeroCasa());
            pstmt.setString(12, gerente.getBairro());
            pstmt.setString(13,gerente.getCidade());
            pstmt.executeUpdate();
            pstmt.close();
            conexao.close();
            return true;
        } 
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
            return false;
        }
    }
    
    
    public boolean alterarGerenteNoBanco (String cpf,ModeloGerente gerente) throws ClassNotFoundException, SQLException{
         this.conexao = new Conexao().getConexao();
    
        try{
            
            String sql ="UPDATE gerente SET Nome = ?, email = ?, Telefone = ?,"
            + " Rua = ?, NumeroCasa = ?, Bairro = ?, Cidade = ?, senhaGerente =? WHERE CPF=?" ;
            PreparedStatement pstmt = conexao.prepareStatement(sql);
            pstmt.setString(1,gerente.getNome());
            pstmt.setString(2,gerente.getEmail());
            pstmt.setString(3,gerente.getTelefone());            
            pstmt.setString(4,gerente.getRua());
            pstmt.setInt(5,gerente.getNumeroCasa());
            pstmt.setString(6,gerente.getBairro());
            pstmt.setString(7,gerente.getCidade());
            pstmt.setString(8,gerente.getSenhaGerente());
            pstmt.setString(9,cpf);
            
            pstmt.execute();
            pstmt.close();
            conexao.close();
            return true;
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
            return false;
        }
    }
    
    public boolean excluirGerenteNoBanco (String cpf) throws ClassNotFoundException, SQLException{
        this.conexao = new Conexao().getConexao();
    
        try{
            
            String sql ="DELETE FROM GERENTE WHERE CPF = ?";
            PreparedStatement pstmt = conexao.prepareStatement(sql);
            pstmt.setString(1,cpf);  
            pstmt.execute();
            pstmt.close();
            conexao.close();
            return true;
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
            return false;
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
    
    
    public boolean VerificaCpf (String cpf) throws ClassNotFoundException, SQLException{
        this.conexao = new Conexao().getConexao();
        ResultSet rs = null;
        try{
            String sql = ("SELECT cpf FROM gerente where cpf = ?");
            PreparedStatement pstmt = conexao.prepareStatement(sql);
            pstmt.setString(1, cpf);
            String compara;
            rs = pstmt.executeQuery();
            while(rs.next()){
                compara=rs.getString("cpf");
                    if(cpf.equals(compara)){
                        pstmt.close();
                        conexao.close();
                        return true;
                        }
                    else{
                        pstmt.close();
                        conexao.close();
                        return false;
                    }
                }
            }
            catch (SQLException e) { 
             return false;
            }
            return false;        
    }
    
    
    
        public boolean VerificaLogin (String loginGerente) throws ClassNotFoundException, SQLException{
        this.conexao = new Conexao().getConexao();
        ResultSet rs = null;
        try{
            String sql = ("SELECT loginGerente FROM gerente where loginGerente = ?");
            PreparedStatement pstmt = conexao.prepareStatement(sql);
            pstmt.setString(1, loginGerente);
            String compara;
            rs = pstmt.executeQuery();
            while(rs.next()){
                compara=rs.getString("loginGerente");
                    if(loginGerente.equals(compara)){
                        pstmt.close();
                        conexao.close();
                        return true;
                        }
                    else{
                        pstmt.close();
                        conexao.close();
                        return false;
                    }
                }
            }
            catch (SQLException e) { 
             return false;
            }
            return false;        
    }
}
