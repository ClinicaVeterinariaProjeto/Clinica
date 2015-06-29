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
    
    public boolean marcarConsulta (ModeloConsulta consulta) throws ClassNotFoundException{
        this.conexao = new Conexao().getConexao();
        try{
            String query = ("INSERT INTO dia, mes, horarios,idCliente, idAnimal valorConsulta FROM consulta VALUES(?,?,?,?,?,?);");
            PreparedStatement pstmt = conexao.prepareStatement(query);
            pstmt.setInt(1,consulta.getDia());
            pstmt.setInt(2,consulta.getMes());
            pstmt.setInt(3,consulta.getHorario());
            pstmt.setFloat(4,consulta.getValorConsulta());
            pstmt.setInt(5, consulta.getIdCliente());
            pstmt.setInt(6, consulta.getIdAnimal());
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
            
            String sql ="UPDATE consulta SET dia = ?, mes = ?, horario = ? valorConsulta = ? WHERE idCliente = ?;";
            PreparedStatement pstmt = conexao.prepareStatement(sql);
            pstmt.setInt(1,consulta.getDia()); 
            pstmt.setInt(2,consulta.getMes());
            pstmt.setInt(3,consulta.getHorario());
            pstmt.setFloat(4,consulta.getValorConsulta());
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
