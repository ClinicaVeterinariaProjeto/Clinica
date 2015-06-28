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
    //funcionando
    public void inserirFuncionarioNoBanco(ModeloFuncionario funcionario,int idGerente) throws ClassNotFoundException, SQLException{
     this.conexao = new Conexao().getConexao();
     
    // ModeloGerente gerente = new ModeloGerente();
    // GerenteDAO gr = new GerenteDAO();
       // idGerente = gr.pesquisaGerenteNoBanco(gerente.getCpf());
        try{
              
            
            
            String query = "INSERT INTO funcionario(Nome, email, Telefone, CPF, DataNascimento, Sexo, idFuncionario, loginFuncionario,senhaFuncionario, Rua, NumeroCasa, Bairro, Cidade, idGerente) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
 
            PreparedStatement pstmt = conexao.prepareStatement(query);
            pstmt.setString(1, funcionario.getNome());
            pstmt.setString(2, funcionario.getEmail());
            pstmt.setString(3,  funcionario.getTelefone());
            pstmt.setString(4, funcionario.getCpf());
            pstmt.setString(5, funcionario.getDataNascimento());
            pstmt.setString(6, funcionario.getSexo());
            pstmt.setInt(7, funcionario.getIdFuncionario());
            pstmt.setString(8,funcionario.getLoginFuncionario());
            pstmt.setString(9, funcionario.getSenhaFuncionario());
            pstmt.setString(10, funcionario.getRua());
            pstmt.setInt(11, funcionario.getNumeroCasa());
            pstmt.setString(12, funcionario.getBairro());
            pstmt.setString(13,funcionario.getCidade());
            pstmt.setInt(14, idGerente);
            pstmt.executeUpdate();
            pstmt.close();
            conexao.close();
        } 
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
    // funcionando
    public ModeloFuncionario pesquisarFuncionarioNoBanco (String cpf) throws ClassNotFoundException, SQLException{
        this.conexao = new Conexao().getConexao();
        ModeloFuncionario dadosFuncionario = new ModeloFuncionario();
        ResultSet rs = null;
        try{
          //rs = stmt.executeQuery("select * from cliente where cpf='" +cpf+"';" );
           //PreparedStatement pstmt = this.conexao.prepareStatement("SELECT * FROM cliente WHERE cpf = ?");
          String sql ="Select cpf, nome, email, telefone, DataNascimento, sexo, idFuncionario,senhaFuncionario, rua, numeroCasa, bairro, cidade  FROM FUNCIONARIO WHERE CPF = ?";
          PreparedStatement pstmt = conexao.prepareStatement(sql); 
          pstmt.setString(1, cpf);
          rs = pstmt.executeQuery();
          while (rs.next()){
             
              ModeloFuncionario temp = new ModeloFuncionario();
              temp.setCpf(rs.getString("cpf"));
              temp.setNome(rs.getString("nome"));
              temp.setEmail(rs.getString("email"));
              temp.setTelefone(rs.getString("telefone"));
              temp.setDataNascimento(rs.getString("datanascimento"));
              temp.setSexo(rs.getString("sexo"));
              temp.setIdFuncionario(rs.getInt("idFuncionario"));
              temp.setLoginFuncionario(rs.getString("loginFuncionario"));
              temp.setSenhaFuncionario(rs.getString("senhaFuncionario"));
              temp.setRua(rs.getString("rua"));
              temp.setNumeroCasa(rs.getInt("numeroCasa"));
              temp.setBairro(rs.getString("bairro"));
              temp.setCidade(rs.getString("cidade"));
              dadosFuncionario=temp;              
            }
          rs.close();
          pstmt.close();
          conexao.close();
         
          return dadosFuncionario;
        }
        catch (SQLException e) { 
          System.out.println("Erro ao buscar pessoa");
          return null;
        }       
    }
    //funcionando
    public void alterarFuncionarioNoBanco (String cpf,ModeloFuncionario funcionario) throws ClassNotFoundException, SQLException{
        this.conexao = new Conexao().getConexao();
    
        try{
            
            String sql ="UPDATE Funcionario SET Nome = ?, email = ?, Telefone = ?,"
            + " Rua = ?, NumeroCasa = ?, Bairro = ?, Cidade = ?, senhaFuncionario = ?WHERE CPF=?" ;
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1,funcionario.getNome());
            stmt.setString(2,funcionario.getEmail());
            stmt.setString(3,funcionario.getTelefone());            
            stmt.setString(4,funcionario.getRua());
            stmt.setInt(5,funcionario.getNumeroCasa());
            stmt.setString(6,funcionario.getBairro());
            stmt.setString(7,funcionario.getCidade());
            stmt.setString(8,funcionario.getSenhaFuncionario());
            stmt.setString(9,cpf);
            stmt.execute();
            stmt.close();
            conexao.close();
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
    
    public void excluirFuncionarioNoBanco (String cpf) throws ClassNotFoundException, SQLException{
       this.conexao = new Conexao().getConexao();
    
        try{
            
            String sql ="DELETE FROM Funcionario WHERE CPF = ?";
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
    
    
    public void agendarConsulta (){
    
    }
    public void alterarDataConsulta(){
    }
}
