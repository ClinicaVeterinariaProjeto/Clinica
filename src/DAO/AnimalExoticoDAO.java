/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.ModeloAnimalExotico;
import Persistencia.Conexao;
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
    // formato de data dia/mes/ano
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); 
    public void inserirAnimalNoBanco(ModeloAnimalExotico animalExotico) throws ClassNotFoundException, SQLException, ParseException{
        Conexao con = new Conexao();
        try{
            con.Conecta();
            String sql1 = "INSERT INTO Animal(idAnimal, idCliente) VALUES (?,?)";
            PreparedStatement stmt1 = con.prepareStatement(sql1);
            stmt1.setInt(1,animalExotico.getIdAnimal());
            stmt1.setInt(2,animalExotico.getIdDono());
            String sql2 = "INSERT INTO Exotico(Raca, Nome, AnoNascimento, Peso, Data_vasc,idAnimal,idCliente)VALUES(?,?,?,?,?,?,?)";
            
            PreparedStatement stmt2 = con.prepareStatement(sql2);
            stmt2.setString(1,animalExotico.getRaca());
            stmt2.setString(2,animalExotico.getNome());
            stmt2.setInt(3,animalExotico.getAnoNascimento());
            stmt2.setFloat(4,animalExotico.getPeso());
            
            // convertendo a string data para o tipo Date            
            stmt2.setDate(5, (java.sql.Date) (java.util.Date)formatter.parse(animalExotico.getUltimaVascina()));  
            stmt2.setInt(6,animalExotico.getIdAnimal());
            stmt2.setInt(7,animalExotico.getIdDono());
           
            stmt1.execute();
            stmt2.execute();
            con.Desconecta();
        } 
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    
    }
    public void alterarAnimalNoBanco(ModeloAnimalExotico animalExotico) throws ClassNotFoundException, SQLException, ParseException{
        Conexao con = new Conexao();
        try{
            con.Conecta();
            String sql ="UPDATE Exotico SET Raca = ?, Nome = ?, AnoNascimento = ?, Peso = ?,"
            + " Data_vasc = ? WHERE idAnimal = ? and idCliente = ?" ;
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,animalExotico.getRaca());
            stmt.setString(2,animalExotico.getNome());
            stmt.setInt(3,animalExotico.getAnoNascimento());
            stmt.setFloat(4,animalExotico.getPeso());
            stmt.setDate(5, (java.sql.Date) (java.util.Date)formatter.parse(animalExotico.getUltimaVascina()));
            stmt.setInt(6,animalExotico.getIdAnimal());
            stmt.setInt(7,animalExotico.getIdDono());
            stmt.execute();
            con.Desconecta();
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
    public void pesquisarAnimalNoBanco(String cpf) throws ClassNotFoundException, SQLException{
        Conexao con = new Conexao();
        con.Conecta();
        Statement stmt = null;
        ResultSet rs = null;     
        
        rs = stmt.executeQuery("SELECT * FROM Exotico ");
        ResultSetMetaData metaData = rs.getMetaData();
        
        while((rs.next())) {
         //   if(metaData.getColumnName().equals(cpf))
                break;                 
        }
    
    }
    public void excluirAnimalNoBanco () throws ClassNotFoundException, SQLException{
        Conexao con = new Conexao();
    
        try{
            con.Conecta();
            String sql ="DELETE FROM Exotico WHERE  = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,null);  
            stmt.execute();
            con.Desconecta();
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}
