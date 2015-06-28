/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.ModeloAnimalDomestico;

import Persistencia.Conexao;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author William
 */
public class AnimalDomesticoDAO {
    // formato de data dia/mes/ano
private Connection conexao;
    public void inserirAnimalNoBanco(ModeloAnimalDomestico animalDomestico) throws ClassNotFoundException, SQLException{
           this.conexao = new Conexao().getConexao();

        try{            
            String query_animal = "INSERT INTO Animal(idAnimal, idCliente) VALUES (?,?)";            
            PreparedStatement stmt1 = conexao.prepareStatement(query_animal);
            stmt1.setInt(1,animalDomestico.getIdAnimal());
            stmt1.setInt(2,animalDomestico.getIdDono());
            stmt1.execute();
            stmt1.close();
            conexao.close();
            inserirExoticoNoBanco(animalDomestico);
        } 
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }    
    }
    
    public void inserirExoticoNoBanco(ModeloAnimalDomestico animalDomestico) throws ClassNotFoundException, SQLException{
        this.conexao = new Conexao().getConexao();

        try{
                        
            String query_exotico = "INSERT INTO Domestico(Raça, Nome, AnoNascimento, Peso, Data_vasc,idAnimal,idCliente)VALUES(?,?,?,?,?,?,?)";
            PreparedStatement stmt2 = conexao.prepareStatement(query_exotico);
            stmt2.setString(1,animalDomestico.getRaca());
            stmt2.setString(2,animalDomestico.getNome());
            stmt2.setInt(3,animalDomestico.getAnoNascimento());
            stmt2.setFloat(4,animalDomestico.getPeso());                       
            stmt2.setString(5,(animalDomestico.getUltimaVascina()));  
            stmt2.setInt(6,animalDomestico.getIdAnimal());
            stmt2.setInt(7,animalDomestico.getIdDono());            
            stmt2.executeUpdate();           
            stmt2.close();
            conexao.close();
        } 
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
    public void alterarAnimalNoBanco(ModeloAnimalDomestico animalDomestico) throws ClassNotFoundException, SQLException{
        this.conexao = new Conexao().getConexao();
        try{
            String sql ="UPDATE Domestico SET Raca = ?, Nome = ?, AnoNascimento = ?, Peso = ?,"
            + " Data_vasc = ? WHERE idAnimal = ? and idCliente = ?" ;
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1,animalDomestico.getRaca());
            stmt.setString(2,animalDomestico.getNome());
            stmt.setInt(3,animalDomestico.getAnoNascimento());
            stmt.setFloat(4,animalDomestico.getPeso());
            stmt.setString(5,animalDomestico.getUltimaVascina());
            stmt.setInt(6,animalDomestico.getIdAnimal());
            stmt.setInt(7,animalDomestico.getIdDono());
            stmt.execute();
            stmt.close();
            conexao.close();
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
    public ModeloAnimalDomestico pesquisarAnimalNoBanco(String cpf) throws ClassNotFoundException, SQLException{
        this.conexao = new Conexao().getConexao();
        ResultSet rs = null;
        ModeloAnimalDomestico animalDomestico = new ModeloAnimalDomestico();
        try{ 
            String sql = "SELECT .. ";
            PreparedStatement pstmt = conexao.prepareStatement(sql); 
           
            rs = pstmt.executeQuery();
            while (rs.next()){                
              
            }
            rs.close();
            pstmt.close();
            conexao.close();
         
            return animalDomestico;
        }
        catch (SQLException e) { 
          System.out.println("Erro ao buscar Animal");
            return null;
        } 
    
    }
    public void excluirAnimalNoBanco () throws ClassNotFoundException, SQLException{
        this.conexao = new Conexao().getConexao();
    
        try{
            
            String sql ="DELETE FROM Domestico WHERE  = ?";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1,null);  
            stmt.executeUpdate();
            conexao.close();
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}
