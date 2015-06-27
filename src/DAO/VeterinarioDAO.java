/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.ModeloVeterinario;
import Persistencia.Conexao;
import com.mysql.jdbc.Connection;
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
    private Connection conexao;
    public void inserirVeterinarioNoBanco(ModeloVeterinario veterinario, int idGerente) throws ClassNotFoundException, SQLException{
        this.conexao = new Conexao().getConexao();
        try{
           
            String query = "INSERT INTO Veterinario(Nome, Sobrenome, email, Telefone, CPF, DataNascimento, Sexo, idVeterinario, senhaVeterinario, Rua, NumeroCasa, Bairro, Cidade, idGerente) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
 
            PreparedStatement pstmt = conexao.prepareStatement(query);
            pstmt.setString(1, veterinario.getNome());
            pstmt.setString(2, veterinario.getSobrenome());
            pstmt.setString(3, veterinario.getEmail());
            pstmt.setString(4,  veterinario.getTelefone());
            pstmt.setString(5, veterinario.getCpf());
            pstmt.setString(6, veterinario.getDataNascimento());
            pstmt.setString(7, veterinario.getSexo());
            pstmt.setInt(8, veterinario.getIdVeterinario());
            pstmt.setString(9, veterinario.getSenhaVeterinario());
            pstmt.setString(10, veterinario.getRua());
            pstmt.setInt(11, veterinario.getNumeroCasa());
            pstmt.setString(12, veterinario.getBairro());
            pstmt.setString(13,veterinario.getCidade());
            pstmt.setInt(14, idGerente);
            pstmt.executeUpdate();
            pstmt.close();
            conexao.close();
        } 
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
    
    public ModeloVeterinario pesquisarVeterinarioNoBanco (String cpf) throws ClassNotFoundException, SQLException{
        this.conexao = new Conexao().getConexao();
        ModeloVeterinario dadosVeterinario = new ModeloVeterinario();
        ResultSet rs = null;
        try{
            String sql ="Select cpf, nome, sobrenome, email, telefone, DataNascimento, sexo, idVeterinario,senhaVeterinario, rua, numeroCasa, bairro, cidade  FROM VETERINARIO WHERE CPF = ?";
            PreparedStatement pstmt = conexao.prepareStatement(sql); 
            pstmt.setString(1, cpf);
            rs = pstmt.executeQuery();
        while (rs.next()){
             
              ModeloVeterinario temp = new ModeloVeterinario();
              temp.setCpf(rs.getString("cpf"));
              temp.setNome(rs.getString("nome"));
              temp.setSobrenome(rs.getString("sobrenome"));
              temp.setEmail(rs.getString("email"));
              temp.setTelefone(rs.getString("telefone"));
              temp.setDataNascimento(rs.getString("datanascimento"));
              temp.setSexo(rs.getString("sexo"));
              temp.setIdVeterinario(rs.getInt("idVeterinario"));
              temp.setSenhaVeterinario(rs.getString("senhaVeterinario"));
              temp.setRua(rs.getString("rua"));
              temp.setNumeroCasa(rs.getInt("numeroCasa"));
              temp.setBairro(rs.getString("bairro"));
              temp.setCidade(rs.getString("cidade"));
              dadosVeterinario=temp;              
            }
          rs.close();
          pstmt.close();
          conexao.close();
         
          return dadosVeterinario;
        }
        catch (SQLException e) { 
          System.out.println("Erro ao buscar pessoa");
          return null;
        }    
        
              
    }
    
    public void alterarVeterinarioNoBanco (String cpf,ModeloVeterinario veterinario) throws ClassNotFoundException, SQLException{
         this.conexao = new Conexao().getConexao();
        try{
            String sql ="UPDATE Veterinario SET Nome = ?, Sobrenome = ?, email = ?, Telefone = ?,"
            + " Rua = ?, NumeroCasa = ?, Bairro = ?, Cidade = ? WHERE CPF=?" ;
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1,veterinario.getNome());
            stmt.setString(2,veterinario.getSobrenome());
            stmt.setString(3,veterinario.getEmail());
            stmt.setString(4,veterinario.getTelefone());            
            stmt.setString(5,veterinario.getRua());
            stmt.setInt(6,veterinario.getNumeroCasa());
            stmt.setString(7,veterinario.getBairro());
            stmt.setString(8,veterinario.getCidade());
            stmt.setString(9,cpf);
            stmt.execute();
            stmt.close();
            conexao.close();
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
    
    public void excluirVeterinarioNoBanco (String cpf) throws ClassNotFoundException, SQLException{
        this.conexao = new Conexao().getConexao();
    
        try{
            String sql ="DELETE FROM Veterinario WHERE CPF = ?";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1,cpf);  
            stmt.execute();
            stmt.close();
            conexao.close();
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}
