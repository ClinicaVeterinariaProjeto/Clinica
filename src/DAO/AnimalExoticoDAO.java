/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.ModeloAnimalExotico;
import Persistencia.Conexao;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author William
 */
public class AnimalExoticoDAO {
    // pesquisar o id do cliente apartir do cpf para referenciar no animal
    private Connection conexao;
    public void inserirAnimalNoBanco(ModeloAnimalExotico animalExotico) throws ClassNotFoundException, SQLException, ParseException{
           this.conexao = new Conexao().getConexao();

        try{
            
            String query_animal = "INSERT INTO Animal(idAnimal, idCliente) VALUES (?,?)";
            
            PreparedStatement stmt1 = conexao.prepareStatement(query_animal);
            stmt1.setInt(1,animalExotico.getIdAnimal());
            stmt1.setInt(2,animalExotico.getIdDono());
            stmt1.execute();
            stmt1.close();
            conexao.close();
          /*  String query_exotico = "INSERT INTO Exotico(Raca, Nome, AnoNascimento, Peso, Data_vasc,idAnimal,idCliente)VALUES(?,?,?,?,?,?,?)";
            
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
            conexao.close();*/
        } 
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }    
    }
    
   // public void inserir
    public void alterarAnimalNoBanco(ModeloAnimalExotico animalExotico) throws ClassNotFoundException, SQLException, ParseException{
        this.conexao = new Conexao().getConexao();
        try{
            
            String sql ="UPDATE Exotico SET Raca = ?, Nome = ?, Peso = ?,"
            + " Data_vasc = ? WHERE idAnimal = ? and idCliente = ?" ;
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1,animalExotico.getRaca());
            stmt.setString(2,animalExotico.getNome());
            stmt.setInt(3,animalExotico.getAnoNascimento());
            stmt.setFloat(4,animalExotico.getPeso());            
            stmt.setInt(5,animalExotico.getIdAnimal());
            stmt.setInt(6,animalExotico.getIdDono());
            stmt.executeUpdate();
            stmt.close();
            conexao.close();
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
    public ModeloAnimalExotico pesquisarAnimalNoBanco(String cpf) throws ClassNotFoundException, SQLException{
        this.conexao = new Conexao().getConexao();
        ModeloAnimalExotico animalExotico = new ModeloAnimalExotico();
        ResultSet rs = null;
        try{
            String sql ="SELECT Raca, Nome, AnoNascimento, Peso, Data_vasc,idAnimal,idDono FROM EXOTICO WHERE  = ?";
            PreparedStatement pstmt = conexao.prepareStatement(sql); 
          //  pstmt.setString(1, );
            rs = pstmt.executeQuery();
            while (rs.next()){ 
                ModeloAnimalExotico temp = new ModeloAnimalExotico();
                temp.setRaca(rs.getString("Raca"));
                temp.setNome(rs.getString("Nome"));
                temp.setAnoNascimento(rs.getInt("AnoNascimento"));
                temp.setPeso(rs.getFloat("Peso"));
                temp.setUltimaVascina(rs.getString("telefone"));
                temp.setIdAnimal(rs.getInt("idAnimal"));
                temp.setIdDono(rs.getInt("idDono"));
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
    public void excluirAnimalNoBanco () throws ClassNotFoundException, SQLException{
        this.conexao = new Conexao().getConexao();
    
        try{
            
            String sql ="DELETE FROM Exotico WHERE  = ?";
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
