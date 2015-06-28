/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.ModeloAnimalExotico;
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
public class AnimalExoticoDAO {
    // pesquisar o id do cliente apartir do cpf para referenciar no animal
    private Connection conexao;
    public void inserirAnimalNoBanco(ModeloAnimalExotico animalExotico) throws ClassNotFoundException, SQLException{
           this.conexao = new Conexao().getConexao();

        try{            
            String query_animal = "INSERT INTO Animal(idAnimal, idCliente) VALUES (?,?)";            
            PreparedStatement stmt1 = conexao.prepareStatement(query_animal);
            stmt1.setInt(1,animalExotico.getIdAnimal());
            stmt1.setInt(2,animalExotico.getIdDono());
            stmt1.execute();
            stmt1.close();
            conexao.close();
            inserirExoticoNoBanco(animalExotico);
        } 
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }    
    }
    
    public void inserirExoticoNoBanco(ModeloAnimalExotico animalExotico) throws ClassNotFoundException, SQLException{
        this.conexao = new Conexao().getConexao();

        try{
                        
            String query_exotico = "INSERT INTO Exotico(Raca, Nome, AnoNascimento, Peso, Data_vasc,idAnimal,idCliente)VALUES(?,?,?,?,?,?,?)";
            PreparedStatement stmt2 = conexao.prepareStatement(query_exotico);
            stmt2.setString(1,animalExotico.getRaca());
            stmt2.setString(2,animalExotico.getNome());
            stmt2.setInt(3,animalExotico.getAnoNascimento());
            stmt2.setFloat(4,animalExotico.getPeso());                       
            stmt2.setString(5,(animalExotico.getUltimaVascina()));  
            stmt2.setInt(6,animalExotico.getIdAnimal());
            stmt2.setInt(7,animalExotico.getIdDono());            
            stmt2.executeUpdate();           
            stmt2.close();
            conexao.close();
        } 
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
    public void alterarAnimalNoBanco(ModeloAnimalExotico animalExotico,int idDoAnimal) throws ClassNotFoundException, SQLException{
        this.conexao = new Conexao().getConexao();
        try{
            
            String sql ="UPDATE Exotico SET Raca = ?, Nome = ?, Peso = ?,"
            + " Data_vasc = ? WHERE idAnimal = ?" ;
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1,animalExotico.getRaca());
            stmt.setString(2,animalExotico.getNome());
            stmt.setFloat(3,animalExotico.getPeso());
            stmt.setString(4,animalExotico.getUltimaVascina());                        
            stmt.setInt(5,idDoAnimal);
            stmt.execute();
            stmt.close();
            conexao.close();
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
    public ModeloAnimalExotico pesquisarAnimalNoBanco(String cpf,String nomeDoAnimal) throws ClassNotFoundException, SQLException{
        this.conexao = new Conexao().getConexao();
        ModeloAnimalExotico animalExotico = new ModeloAnimalExotico();
        ResultSet rs = null;
        ModeloCliente cliente = new ModeloCliente();
        ClienteDAO cl = new ClienteDAO();
        cliente=cl.pesquisaClienteNoBanco(cpf);
        try{
            
            String sql ="SELECT Raca,Nome,AnoNascimento,Peso,Data_vasc,idAnimal,idCliente "
                    + "FROM Exotico "
                    + "WHERE idCliente = ? and Nome = ? ";
                   
            PreparedStatement pstmt = conexao.prepareStatement(sql); 
            pstmt.setInt(1,cliente.getIdCliente());
            pstmt.setString(2,nomeDoAnimal);
            rs = pstmt.executeQuery();
            while (rs.next()){ 
                ModeloAnimalExotico temp = new ModeloAnimalExotico();
                temp.setRaca(rs.getString("Raca"));
                temp.setNome(rs.getString("Nome"));
                temp.setAnoNascimento(rs.getInt("AnoNascimento"));
                temp.setPeso(rs.getFloat("Peso"));
                temp.setUltimaVascina(rs.getString("Data_vasc"));
                temp.setIdAnimal(rs.getInt("idAnimal"));
                temp.setIdDono(rs.getInt("idCliente"));
                animalExotico=temp;
            }
            rs.close();
            pstmt.close();
            conexao.close();
         
            return animalExotico;
        }
        catch (SQLException e) { 
          System.out.println("Erro ao buscar Animal");
            return null;
        }   
    
    }
    public void excluirAnimalExoticoNoBanco (int idDoAnimal) throws ClassNotFoundException, SQLException{
        this.conexao = new Conexao().getConexao();    
        try{
            
            String sql ="DELETE FROM Exotico WHERE idAnimal = ?";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1,idDoAnimal);  
            stmt.executeUpdate();
            conexao.close();
            excluirAnimal(idDoAnimal);
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
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
