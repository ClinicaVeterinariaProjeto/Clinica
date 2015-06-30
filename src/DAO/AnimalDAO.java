/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.ModeloAnimal;
import Modelo.ModeloAnimalExotico;
import Modelo.ModeloCliente;
import Persistencia.Conexao;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author William
 */
public class AnimalDAO {
    private Connection conexao;
    public boolean inserirAnimal(ModeloAnimal animal) throws ClassNotFoundException, SQLException{
        this.conexao = new Conexao().getConexao();
        try{                        
            String query_exotico = "INSERT INTO Animal(TipoAnimal,Raca, Nome, AnoNascimento, Peso, Data_vasc,idAnimal,idCliente)VALUES(?,?,?,?,?,?,?,?)";
            PreparedStatement stmt2 = conexao.prepareStatement(query_exotico);
            stmt2.setString(1,animal.getTipo());
            stmt2.setString(2,animal.getRaca());
            stmt2.setString(3,animal.getNome());
            stmt2.setInt(4,animal.getAnoNascimento());
            stmt2.setFloat(5,animal.getPeso());                       
            stmt2.setString(6,(animal.getUltimaVascina()));  
            stmt2.setInt(7,animal.getIdAnimal());
            stmt2.setInt(8,animal.getIdDono());            
            stmt2.executeUpdate();           
            stmt2.close();
            conexao.close();
            return true;
        } 
        catch (SQLException e ) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir animal "+e);
            return false;
        }    
    }
    
    public ModeloAnimal pesquisarAnimal(String cpf,String nomeDoAnimal) throws ClassNotFoundException, SQLException{
        this.conexao = new Conexao().getConexao();
        ModeloAnimal animal = new ModeloAnimal();
        ResultSet rs = null;
        ModeloCliente cliente = new ModeloCliente();
        ClienteDAO cl = new ClienteDAO();
        cliente=cl.pesquisaClienteNoBanco(cpf);
        try{            
            String sql ="SELECT Raca,Nome,TipoAnimal,AnoNascimento,Peso,Data_vasc,idAnimal,idCliente "
                    + "FROM Animal "
                    + "WHERE idCliente = ? and Nome = ? ";                   
            PreparedStatement pstmt = conexao.prepareStatement(sql); 
            pstmt.setInt(1,cliente.getIdCliente());
            pstmt.setString(2,nomeDoAnimal);
            rs = pstmt.executeQuery();
            while (rs.next()){ 
                ModeloAnimal temp = new ModeloAnimal();
                temp.setRaca(rs.getString("Raca"));
                temp.setNome(rs.getString("Nome"));
                temp.setTipo(rs.getString("TipoAnimal"));
                temp.setAnoNascimento(rs.getInt("AnoNascimento"));
                temp.setPeso(rs.getFloat("Peso"));
                temp.setUltimaVascina(rs.getString("Data_vasc"));
                temp.setIdAnimal(rs.getInt("idAnimal"));
                temp.setIdDono(rs.getInt("idCliente"));
                animal=temp;
            }
            rs.close();
            pstmt.close();
            conexao.close();         
            return animal;
        }
        catch (SQLException e) { 
          JOptionPane.showMessageDialog(null,"Erro ao buscar Animal"+e);
            return null;
        } 
    }
    
    public boolean alterarAnimal(ModeloAnimal animal,int idDoAnimal) throws ClassNotFoundException, SQLException{
        this.conexao = new Conexao().getConexao();
        try{            
            String sql ="UPDATE Animal SET Raca = ?, Nome = ?, Peso = ?,"
            + " Data_vasc = ? WHERE idAnimal = ?" ;
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1,animal.getRaca());
            stmt.setString(2,animal.getNome());
            stmt.setFloat(3,animal.getPeso());
            stmt.setString(4,animal.getUltimaVascina());                        
            stmt.setInt(5,idDoAnimal);
            stmt.execute();
            stmt.close();
            conexao.close();
            return true;
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro ao alterar Animal"+e);
            return false;
        }
    }
    //exclui pelo id 
    public boolean excluirAnimal(int idDoAnimal)throws ClassNotFoundException, SQLException{
        this.conexao = new Conexao().getConexao();    
        try{            
            String sql ="DELETE FROM Animal WHERE idAnimal = ?";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1,idDoAnimal);  
            stmt.executeUpdate();
            conexao.close();
            return true;
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro ao excluir Animal"+e);
            return false;
        }
    }
    
    
        public boolean VerificaNome (String nome) throws ClassNotFoundException, SQLException{
        this.conexao = new Conexao().getConexao();
        ResultSet rs = null;
        try{
            String sql = ("SELECT Nome FROM Animal where Nome = ?");
            PreparedStatement pstmt = conexao.prepareStatement(sql);
            pstmt.setString(1, nome);
            String compara;
            rs = pstmt.executeQuery();
            while(rs.next()){
                compara=rs.getString("nome");
                    if(nome.equals(compara)){
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
