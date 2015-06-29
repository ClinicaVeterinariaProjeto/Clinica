/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.ModeloEstoque;
import Persistencia.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author William
 */
public class EstoqueDAO {
    private Connection conexao;
    public boolean adicionarProduto(ModeloEstoque estoque) throws ClassNotFoundException{
    this.conexao = new Conexao().getConexao();
        try{              
            String query = "INSERT INTO Estoque(NomeProduto,QuantidadeProduto,ValorProduto) VALUES (?,?,?)"; 
            PreparedStatement pstmt = conexao.prepareStatement(query);
            pstmt.setString(1,estoque.getNomeProduto());
            pstmt.setInt(2,estoque.getQuantidadeProduto());
            pstmt.setFloat(3,estoque.getValorProduto());
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
    
    public ModeloEstoque pesquisarProduto(String nomeProduto) throws ClassNotFoundException{
        this.conexao = new Conexao().getConexao();
        ResultSet rs = null;
        ModeloEstoque estoque = new ModeloEstoque();
        try{
            String sql ="Select NomeProduto,QuantidadeProduto,ValorProduto from estoque where NomeProduto = ?";
            PreparedStatement pstmt = conexao.prepareStatement(sql); 
            pstmt.setString(1,nomeProduto );
            rs = pstmt.executeQuery();
            while (rs.next()){ 
                ModeloEstoque temp = new ModeloEstoque();
                temp.setNomeProduto(rs.getString("NomeProduto"));
                temp.setQuantidadeProduto(rs.getInt("QuantidadeProduto"));
                temp.setValorProduto(rs.getFloat("ValorProduto"));
                estoque=temp;
            }
            return estoque;
        }
        catch (SQLException sqlException) { 
            sqlException.printStackTrace();
            System.out.println("Erro ao buscar produto");
            return null;
        }
    }
    
    public boolean retirarProduto(String nomeProduto,int quantidade) throws ClassNotFoundException, SQLException{
        ModeloEstoque estoque = new ModeloEstoque();
        estoque=pesquisarProduto(nomeProduto);
        // as verificações abaixo vao impedir de retirar quantidades a mais de que
        //existem no estoque
        this.conexao = new Conexao().getConexao();
        if(estoque.getQuantidadeProduto()>quantidade){
            //Se o estoque for maior a quantidade será alterada
            try{
                String sql ="UPDATE CLIENTE SET QuantidadeProduto = (QuantidadeProduto-?) where NomeProduto = ?";
                PreparedStatement pstmt = conexao.prepareStatement(sql);
                pstmt.setInt(1, quantidade);
                pstmt.setString(2,nomeProduto);
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
        else if(estoque.getQuantidadeProduto()==quantidade){
            //se o estoque for igual o produto ira acabar, logo sera removido
            try{
                String sql ="DELETE FROM Estoque WHERE NomeProduto = ?";
                PreparedStatement pstmt = conexao.prepareStatement(sql);
                pstmt.setString(1,nomeProduto);
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
        else if(estoque.getQuantidadeProduto()<quantidade){
            //não pode retirar           
        }
        return false;   
    }
}
