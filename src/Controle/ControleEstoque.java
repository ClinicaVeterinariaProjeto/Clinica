/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import DAO.EstoqueDAO;
import Modelo.ModeloEstoque;
import java.sql.SQLException;

/**
 *
 * @author William
 */
public class ControleEstoque {
    EstoqueDAO estoque = new EstoqueDAO();
    public boolean inserirProduto(ModeloEstoque estoque2)throws SQLException, Exception{
        return estoque.adicionarProduto(estoque2);
    }
    public ModeloEstoque pesquisarProduto(String nomeProduto)throws SQLException, Exception{
        return estoque.pesquisarProduto(nomeProduto);
    }
    public boolean retirarProduto(String nomeProduto,int quantidade)throws SQLException, Exception{
        return estoque.retirarProduto(nomeProduto, quantidade);
    }
}
