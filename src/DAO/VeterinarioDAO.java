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
//opa
public class VeterinarioDAO {
    private Connection conexao;
    public boolean inserirVeterinarioNoBanco(ModeloVeterinario veterinario, int idGerente) throws ClassNotFoundException, SQLException{
        this.conexao = new Conexao().getConexao();
        try{
           
            String query = "INSERT INTO Veterinario(Nome, email, Telefone, CPF, DataNascimento, Sexo, idVeterinario, loginVeterinario, senhaVeterinario, Rua, NumeroCasa, Bairro, Cidade, idGerente) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
 
            PreparedStatement pstmt = conexao.prepareStatement(query);
            pstmt.setString(1, veterinario.getNome());
            pstmt.setString(2, veterinario.getEmail());
            pstmt.setString(3,  veterinario.getTelefone());
            pstmt.setString(4, veterinario.getCpf());
            pstmt.setString(5, veterinario.getDataNascimento());
            pstmt.setString(6, veterinario.getSexo());
            pstmt.setInt(7, veterinario.getIdVeterinario());
            pstmt.setString(8,veterinario.getLoginVeterinario());
            pstmt.setString(9, veterinario.getSenhaVeterinario());
            pstmt.setString(10, veterinario.getRua());
            pstmt.setInt(11, veterinario.getNumeroCasa());
            pstmt.setString(12, veterinario.getBairro());
            pstmt.setString(13,veterinario.getCidade());
            pstmt.setInt(14, idGerente);
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
    
    public ModeloVeterinario pesquisarVeterinarioNoBanco (String cpf) throws ClassNotFoundException, SQLException{
        this.conexao = new Conexao().getConexao();
        ModeloVeterinario dadosVeterinario = new ModeloVeterinario();
        ResultSet rs = null;
        try{
            String sql ="Select cpf, nome, email, telefone, DataNascimento, sexo, idVeterinario, loginVeterinario, senhaVeterinario, rua, numeroCasa, bairro, cidade  FROM VETERINARIO WHERE CPF = ?";
            PreparedStatement pstmt = conexao.prepareStatement(sql); 
            pstmt.setString(1, cpf);
            rs = pstmt.executeQuery();
        while (rs.next()){
             
              ModeloVeterinario temp = new ModeloVeterinario();
              temp.setCpf(rs.getString("cpf"));
              temp.setNome(rs.getString("nome"));
              temp.setEmail(rs.getString("email"));
              temp.setTelefone(rs.getString("telefone"));
              temp.setDataNascimento(rs.getString("datanascimento"));
              temp.setSexo(rs.getString("sexo"));
              temp.setIdVeterinario(rs.getInt("idVeterinario"));
              temp.setLoginVeterinario(rs.getString("idVeterinario"));
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
    
    public boolean alterarVeterinarioNoBanco (String cpf,ModeloVeterinario veterinario) throws ClassNotFoundException, SQLException{
         this.conexao = new Conexao().getConexao();
        try{
            String sql ="UPDATE Veterinario SET Nome = ?, email = ?, Telefone = ?,"
            + " Rua = ?, NumeroCasa = ?, Bairro = ?, Cidade = ?, senhaVeterinario = ? WHERE CPF=?" ;
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1,veterinario.getNome());
            stmt.setString(2,veterinario.getEmail());
            stmt.setString(3,veterinario.getTelefone());            
            stmt.setString(4,veterinario.getRua());
            stmt.setInt(5,veterinario.getNumeroCasa());
            stmt.setString(6,veterinario.getBairro());
            stmt.setString(7,veterinario.getCidade());
            stmt.setString(8,veterinario.getSenhaVeterinario());
            stmt.setString(9,cpf);
            stmt.execute();
            stmt.close();
            conexao.close();
            return true;
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
            return false;
        }
    }
    
    public boolean excluirVeterinarioNoBanco (String cpf) throws ClassNotFoundException, SQLException{
        this.conexao = new Conexao().getConexao();
    
        try{
            String sql ="DELETE FROM Veterinario WHERE CPF = ?";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1,cpf);  
            stmt.execute();
            stmt.close();
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
            String sql = ("SELECT cpf FROM veterinario where cpf = ?");
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
