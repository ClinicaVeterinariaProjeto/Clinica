/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.ModeloAnimalDomestico;
import Modelo.ModeloCliente;

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
    public boolean inserirAnimalNoBanco(ModeloAnimalDomestico animalDomestico) throws ClassNotFoundException, SQLException{
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
            return true;
        } 
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
            return false;
        }    
    }
    
    public void inserirExoticoNoBanco(ModeloAnimalDomestico animalDomestico) throws ClassNotFoundException, SQLException{
        this.conexao = new Conexao().getConexao();

        try{
                        
            String query_exotico = "INSERT INTO Domestico(Raca, Nome, AnoNascimento, Peso, Data_vasc,idAnimal,idCliente)VALUES(?,?,?,?,?,?,?)";
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
     public boolean alterarAnimalNoBanco(ModeloAnimalDomestico animalDomestico,int idDoAnimal) throws ClassNotFoundException, SQLException{
        this.conexao = new Conexao().getConexao();
        try{
            
            String sql ="UPDATE Domestico SET Raca = ?, Nome = ?, Peso = ?,"
            + " Data_vasc = ? WHERE idAnimal = ?" ;
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1,animalDomestico.getRaca());
            stmt.setString(2,animalDomestico.getNome());
            stmt.setFloat(3,animalDomestico.getPeso());
            stmt.setString(4,animalDomestico.getUltimaVascina());                        
            stmt.setInt(5,idDoAnimal);
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
    public ModeloAnimalDomestico pesquisarAnimalNoBanco(String cpf,String nomeDoAnimal) throws ClassNotFoundException, SQLException{
        this.conexao = new Conexao().getConexao();
        ResultSet rs = null;
        ModeloAnimalDomestico animalDomestico = new ModeloAnimalDomestico();
        ModeloCliente cliente = new ModeloCliente();
        ClienteDAO cl = new ClienteDAO();
        cliente=cl.pesquisaClienteNoBanco(cpf);
        try{ 
            
            String sql ="SELECT Raca,Nome,AnoNascimento,Peso,Data_vasc,idAnimal,idCliente "
                    + "FROM Domestico "
                    + "WHERE idCliente = ? and Nome = ? ";
                   
            PreparedStatement pstmt = conexao.prepareStatement(sql); 
            pstmt.setInt(1,cliente.getIdCliente());
            pstmt.setString(2,nomeDoAnimal);
            rs = pstmt.executeQuery();
            while (rs.next()){ 
                ModeloAnimalDomestico temp = new ModeloAnimalDomestico();
                temp.setRaca(rs.getString("Raca"));
                temp.setNome(rs.getString("Nome"));
                temp.setAnoNascimento(rs.getInt("AnoNascimento"));
                temp.setPeso(rs.getFloat("Peso"));
                temp.setUltimaVascina(rs.getString("Data_vasc"));
                temp.setIdAnimal(rs.getInt("idAnimal"));
                temp.setIdDono(rs.getInt("idCliente"));
                animalDomestico=temp;
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
    public boolean excluirAnimalNoBanco (int idDoAnimal) throws ClassNotFoundException, SQLException{
        this.conexao = new Conexao().getConexao();    
        try{
            
            String sql ="DELETE FROM domestico WHERE idAnimal = ?";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1,idDoAnimal);  
            stmt.executeUpdate();
            conexao.close();
            excluirAnimal(idDoAnimal);
            return true;
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
            return false;
        }
    }
    public void excluirAnimal(int idDoAnimal)throws ClassNotFoundException, SQLException{
        this.conexao = new Conexao().getConexao();    
        try{            
            String sql ="DELETE FROM Animal WHERE idAnimal = ?";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1,idDoAnimal);  
            stmt.executeUpdate();
            conexao.close();
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}
