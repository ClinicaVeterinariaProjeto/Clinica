/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import Modelo.ModeloCliente;
import Modelo.ModeloConsulta;
import Persistencia.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Alex
 */
public class ConsultaDAO {
    private Connection conexao;
    
    public boolean marcarConsulta (ModeloConsulta consulta, int idCliente, int idAnimal) throws ClassNotFoundException{
        this.conexao = new Conexao().getConexao();
        try{
            String query = ("INSERT INTO consulta (dia, mes, horario, valor, idCliente, idAnimal) VALUES(?,?,?,?,?,?)");
            PreparedStatement pstmt = conexao.prepareStatement(query);
            pstmt.setInt(1,consulta.getDia());
            pstmt.setInt(2,consulta.getMes());
            pstmt.setInt(3,consulta.getHorario());
            pstmt.setFloat(4,consulta.getValor());
            pstmt.setInt(5, idCliente);
            pstmt.setInt(6, idAnimal);
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
    
    public boolean alterarConsulta(ModeloConsulta consulta, int idCliente) throws ClassNotFoundException{
        this.conexao = new Conexao().getConexao();
        try{
            
            String sql ="UPDATE consulta SET dia = ?, mes = ?, horario = ? valor = ? WHERE idCliente = ?;";
            PreparedStatement pstmt = conexao.prepareStatement(sql);
            pstmt.setInt(1,consulta.getDia()); 
            pstmt.setInt(2,consulta.getMes());
            pstmt.setInt(3,consulta.getHorario());
            pstmt.setFloat(4,consulta.getValor());
            pstmt.setInt(5, idCliente);
                        
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
//    
    
    public boolean verificarHorario (int dia,int mes,int horario) throws ClassNotFoundException, SQLException{
        this.conexao = new Conexao().getConexao();
        ResultSet rs = null;
        try{
            String sql = ("SELECT horario FROM consulta where dia = ? and mes = ? and horario = ?");
            PreparedStatement pstmt = conexao.prepareStatement(sql);
            pstmt.setInt(1,dia);
            pstmt.setInt(2,mes);
            pstmt.setInt(3,horario);
            int compara;
            rs = pstmt.executeQuery();
                while(rs.next()){
                    compara=rs.getInt("horario");
                        if(horario==compara){
                            pstmt.close();
                            conexao.close();
                            return true;
                        }else{
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

/*create table consulta(
dia integer not null,
mes integer not null,
horario  integer not null,
valor float not null,
idCliente integer not null,
idAnimal integer not null,
foreign key (idCliente) references Cliente(idCliente),
foreign key (idAnimal) references Animal(idAnimal)
);*/
