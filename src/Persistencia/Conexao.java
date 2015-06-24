/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Persistencia;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.*;
import java.sql.DriverManager;
/**
 *
 * @author Alex
 */
public class Conexao {
    private String url = "jdbc:mysql://localhost:3306/clinica";
    private String login = "root";
    private String senha = "alex123";
    private com.mysql.jdbc.Connection conexao;
    private Statement stmt;


    public void setUrl(String url) {
        this.url = url;
    }
    
    public void setLogin(String login){
        this.login = login;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    public void setConexao(com.mysql.jdbc.Connection conexao) {
        this.conexao = conexao;
    }

    public void setStmt(Statement stmt) {
        this.stmt = stmt;
    }

    public String getUrl() {
        return this.url;
    }
    
    public String getLogin(){
        return login;
    }
    
    public String getSenha() {
        return this.senha;
    }

    public com.mysql.jdbc.Connection getConexao() {
        return this.conexao;
    }

    public Statement getStmt() {
        return this.stmt;
    }


    public Conexao() throws ClassNotFoundException{
        try {
           this.conexao = (com.mysql.jdbc.Connection) DriverManager.getConnection(this.url, this.login, this.senha);
            this.stmt = (Statement) this.conexao.createStatement();
           
        }
        catch (SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
    
    }     

    public void Desconecta(){
        try
        {
        stmt.close();
        conexao.close();
        }
        catch(Exception exception)
        {
        exception.printStackTrace();
        }
    }

    public PreparedStatement prepareStatement(String sql) throws SQLException {
      stmt = (Statement) conexao.createStatement();
        return null;
    }

}
