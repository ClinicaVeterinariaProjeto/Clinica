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

import DAO.FuncionarioDAO;
import Modelo.ModeloFuncionario;
import java.sql.SQLException;
public class ControleFuncionario {
    FuncionarioDAO func =new FuncionarioDAO();
    public boolean inserirFuncionario(ModeloFuncionario funcionario,int idGerente)throws SQLException, Exception{
        return func.inserirFuncionarioNoBanco(funcionario, idGerente);
    }
    
    public boolean alterarFuncionario(ModeloFuncionario funcionario,String cpf)throws SQLException, Exception{
        return func.alterarFuncionarioNoBanco(cpf, funcionario);
    }
    
    public ModeloFuncionario consultarFuncionario(String cpf)throws SQLException, Exception{
        return func.pesquisarFuncionarioNoBanco(cpf);
    }
    
    public boolean excluirFuncionario(String cpf)throws SQLException, Exception{
        return func.excluirFuncionarioNoBanco(cpf);
    }
    
}
