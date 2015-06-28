/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Persistencia.Conexao;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author William
 */
public class ModeloRelatorios {
    private Connection conexao;
    public void relatorioCliente() throws ClassNotFoundException, SQLException, JRException{
        this.conexao = new Conexao().getConexao();
        try{
            PreparedStatement pstmt = conexao.prepareStatement("select * from Cliente");
            pstmt.execute();// result preenchido
            JRResultSetDataSource relResult = new JRResultSetDataSource(pstmt.getResultSet());
            JasperPrint jpPrint = JasperFillManager.fillReport("iReports/imgs/RelatorioDeClientes.jasper",new HashMap(),relResult);
            JasperViewer jv = new JasperViewer(jpPrint,false);
            jv.setVisible(true);
            jv.toFront();

            pstmt.close();
            conexao.close();
        }
        catch(SQLException | JRException ex){
            JOptionPane.showMessageDialog(null,"Erro ao exibir relatório"+ex);
        }
    }
}
