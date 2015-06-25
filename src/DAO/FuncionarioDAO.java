/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.ModeloFuncionario;
import Modelo.ModeloGerente;
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
public class FuncionarioDAO {
    private Connection conexao;
    
    public void inserirFuncionarioNoBanco(ModeloFuncionario funcionario) throws ClassNotFoundException, SQLException{
     this.conexao = new Conexao().getConexao();
     int idGerente;
     ModeloGerente gerente = new ModeloGerente();
     GerenteDAO gr = new GerenteDAO();
        idGerente = gr.pesquisaGerenteNoBanco(gerente.getCpf());
        try{
              
            
            
            String query = "INSERT INTO funcionario(Nome, Sobrenome, email, Telefone, CPF, DataNascimento, Sexo, idFuncionario, senhaFuncionario, Rua, NumeroCasa, Bairro, Cidade, idGerente) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
 
            PreparedStatement pstmt = conexao.prepareStatement(query);
            pstmt.setString(1, funcionario.getNome());
            pstmt.setString(2, funcionario.getSobrenome());
            pstmt.setString(3, funcionario.getEmail());
            pstmt.setString(4,  funcionario.getTelefone());
            pstmt.setString(5, funcionario.getCpf());
            pstmt.setString(6, funcionario.getDataNascimento());
            pstmt.setString(7, funcionario.getSexo());
            pstmt.setInt(8, funcionario.getIdFuncionario());
            pstmt.setString(9, funcionario.getSenhaFuncionario());
            pstmt.setString(10, funcionario.getRua());
            pstmt.setInt(11, funcionario.getNumeroCasa());
            pstmt.setString(12, funcionario.getBairro());
            pstmt.setString(13,funcionario.getCidade());
            pstmt.setInt(idGerente, gerente.getIdGerente());
            pstmt.executeUpdate();
            pstmt.close();
            conexao.close();
        } 
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
    
    public void pesquisaFuncionarioNoBanco (String cpf) throws ClassNotFoundException, SQLException{
        Conexao con = new Conexao();
        con.Conecta();
        Statement stmt = null;
        ResultSet rs = null;
      
        
        rs = stmt.executeQuery("SELECT * FROM Funcionario ");
        ResultSetMetaData metaData = rs.getMetaData();
        
        while((rs.next())) {
            if(metaData.getColumnName(5).equals(cpf))
                break; 
        }       
    }
    
    public void alterarFuncionarioNoBanco (String cpf,ModeloFuncionario funcionario) throws ClassNotFoundException, SQLException{
        Conexao con = new Conexao();
        try{
            con.Conecta();
            String sql ="UPDATE FUNCIONARIO SET Nome = ?, Sobrenome = ?, email = ?, Telefone = ?,"
            + " DataNascimento = ?, Sexo = ? WHERE CPF=?" ;
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,funcionario.getNome());
            stmt.setString(2,funcionario.getSobrenome());
            stmt.setString(3,funcionario.getEmail());
            stmt.setString(4,funcionario.getTelefone());            
            stmt.setString(5,funcionario.getDataNascimento());
            stmt.setString(6,funcionario.getSexo());
            stmt.setString(7,cpf);
            //endereço
            stmt.setString(9,funcionario.getRua());
            stmt.setInt(10,funcionario.getNumeroCasa());
            stmt.setString(11,funcionario.getBairro());
            stmt.setString(12,funcionario.getCidade());
            
            stmt.execute();
            con.Desconecta();
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
    
    public void excluirFuncionarioNoBanco (String cpf) throws ClassNotFoundException, SQLException{
        Conexao con = new Conexao();
    
        try{
            con.Conecta();
            String sql ="DELETE FROM Funcionario WHERE CPF = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,cpf);  
            stmt.execute();
            con.Desconecta();
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
    
    
    public void agendarConsulta (){
    
    }
    public void alterarDataConsulta(){
    }
}
