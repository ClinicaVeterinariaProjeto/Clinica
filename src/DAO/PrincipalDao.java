/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;
import Persistencia.Conexao;
import Modelo.ModeloCliente;
import java.sql.SQLException;

/**
 *
 * @author Alex
 */
public class PrincipalDao {
    public static void main (String Args []) throws SQLException, ClassNotFoundException, Exception{
    
        ModeloCliente cliente = new ModeloCliente();
        cliente.setNome("William");
        cliente.setSobrenome("mendonça");
        cliente.setEmail("teste@test");
        cliente.setDataNascimento("10/01/16");
        cliente.setTelefone("91189052");
        cliente.setCpf("1542121545");
        cliente.setSexo("M");
        cliente.setIdCliente(1);
        cliente.setBairro("teste");
        cliente.setCidade("citytest");
        cliente.setNumeroCasa(665);
        cliente.setCidade("CP");
        ClienteDAO cd = new ClienteDAO();
        //cd.inserirClienteNoBanco(cliente);
        String cpf = ("1542121545");
        
        
        cliente = cd.pesquisaClienteNoBanco(cpf);
        System.out.print(cliente);
}
}