/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

/**
 *
 * @author Alessandro
 */

import DAO.ClienteDAO;
import Modelo.ModeloCliente;
import java.sql.SQLException;

public class ControleCliente {
    ClienteDAO cl=new ClienteDAO();
    public boolean inserirCliente(ModeloCliente cliente) throws SQLException, Exception{
      return cl.inserirClienteNoBanco(cliente);
    }
    
    public boolean alterarCliente(ModeloCliente cliente,String cpf)throws SQLException, Exception{
       return cl.alterarClienteNoBanco(cpf,cliente);
    }
    
    public ModeloCliente consultarCliente(String cpf) throws ClassNotFoundException, SQLException{
        return cl.pesquisaClienteNoBanco(cpf);
    }
    
    public boolean excluirCliente(String cpf)throws ClassNotFoundException, SQLException{
        return cl.excluirClienteNoBanco(cpf);
    }
    
    public boolean verificarCPF(String cpf)throws ClassNotFoundException, SQLException{
        return cl.VerificaCpf(cpf); 
    }
}
