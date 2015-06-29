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
    
 public boolean inserirClienteNoBanco(ModeloCliente cliente) throws ClassNotFoundException, SQLException, Exception  {  
       this.conexao = new Conexao().getConexao();
       try{
              
            String query = "INSERT INTO cliente(Nome, email, Telefone, CPF, DataNascimento, Sexo, idCliente, Rua, NumeroCasa, Bairro, Cidade) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
 
            PreparedStatement pstmt = conexao.prepareStatement(query);
            pstmt.setString(1, cliente.getNome());
            pstmt.setString(2, cliente.getEmail());
            pstmt.setString(3,  cliente.getTelefone());
            pstmt.setString(4, cliente.getCpf());
            pstmt.setString(5, cliente.getDataNascimento());
            pstmt.setString(6, cliente.getSexo());
            pstmt.setInt(7, cliente.getIdCliente());
            pstmt.setString(8, cliente.getRua());
            pstmt.setInt(9, cliente.getNumeroCasa());
            pstmt.setString(10, cliente.getBairro());
            pstmt.setString(11,cliente.getCidade());
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
    
    
    public ModeloCliente pesquisaClienteNoBanco (String cpf) throws ClassNotFoundException, SQLException{
        this.conexao = new Conexao().getConexao();
        ModeloCliente dadosCliente = new ModeloCliente();        
        ResultSet rs = null;
        try{
            //rs = stmt.executeQuery("select * from cliente where cpf='" +cpf+"';" );
            //PreparedStatement pstmt = this.conexao.prepareStatement("SELECT * FROM cliente WHERE cpf = ?");
            String sql ="Select cpf, nome, email, telefone, DataNascimento, sexo, idCliente, rua, numeroCasa, bairro, cidade  FROM CLIENTE WHERE CPF = ?";
            PreparedStatement pstmt = conexao.prepareStatement(sql); 
            pstmt.setString(1, cpf);
            rs = pstmt.executeQuery();
            while (rs.next()){             
                ModeloCliente temp = new ModeloCliente();
                temp.setCpf(rs.getString("cpf"));
                temp.setNome(rs.getString("nome"));
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
        
            
    
    public boolean alterarClienteNoBanco (String cpf,ModeloCliente cliente) throws ClassNotFoundException, SQLException{
    this.conexao = new Conexao().getConexao();
    
        try{
            
            String sql ="UPDATE CLIENTE SET Nome = ?, email = ?, Telefone = ?,"
            + " Rua = ?, NumeroCasa = ?, Bairro = ?, Cidade = ? WHERE CPF=?" ;
            PreparedStatement pstmt = conexao.prepareStatement(sql);
            pstmt.setString(1,cliente.getNome()); 
            pstmt.setString(2,cliente.getEmail());
            pstmt.setString(3,cliente.getTelefone());            
            pstmt.setString(4,cliente.getRua());
            pstmt.setInt(5,cliente.getNumeroCasa());
            pstmt.setString(6,cliente.getBairro());
            pstmt.setString(7,cliente.getCidade());
            pstmt.setString(8,cpf);            
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
    
    public boolean excluirClienteNoBanco (String cpf) throws ClassNotFoundException, SQLException{
    this.conexao = new Conexao().getConexao();
    
        try{
            
            String sql ="DELETE FROM CLIENTE WHERE CPF = ?";
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
    
    public boolean VerificaCpf (String cpf) throws ClassNotFoundException, SQLException{
        this.conexao = new Conexao().getConexao();
        ResultSet rs = null;
        try{
            String sql = ("SELECT cpf FROM cliente where cpf = ?");
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

}    
       
      


