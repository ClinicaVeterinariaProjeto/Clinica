/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;
import Persistencia.Conexao;
import Modelo.ModeloCliente;
import Modelo.ModeloFuncionario;
import Modelo.ModeloGerente;
import java.sql.SQLException;

/**
 *
 * @author Alex
 */
public class PrincipalDao {
    private static int id;
    public static void main (String Args []) throws SQLException, ClassNotFoundException, Exception{
    
        ModeloCliente cliente = new ModeloCliente();
        cliente.setNome("ale");
        cliente.setSobrenome("onça");
        cliente.setEmail("teste@test");
        cliente.setDataNascimento("10/01/16");
        cliente.setTelefone("91189052");
        cliente.setCpf("1542121545");
        cliente.setSexo("M");
        cliente.setIdCliente(2);
        cliente.setRua("fikb");
        cliente.setBairro("teste");
        cliente.setCidade("citytest");
        cliente.setNumeroCasa(665);
        cliente.setCidade("CP");
        ClienteDAO cd = new ClienteDAO();
        //cd.inserirClienteNoBanco(cliente);
        String cpf = ("1542121545");
        //cd.excluirClienteNoBanco(cpf);
        
        //cliente = cd.pesquisaClienteNoBanco(cpf);
        //cd.alterarClienteNoBanco(cpf, cliente);
        
        /*System.out.println(   cliente.getCpf() +cliente.getNome() + cliente.getSobrenome() 
        + cliente.getEmail() + cliente.getTelefone() + cliente.getDataNascimento() + cliente.getSexo()
        + cliente.getIdCliente() + cliente.getRua() + cliente.getNumeroCasa() + cliente.getBairro()+ cliente.getCidade());
         */
        ModeloFuncionario gerente = new ModeloFuncionario();
        gerente.setNome("ale");
        gerente.setSobrenome("onça");
        gerente.setEmail("teste@test");
        gerente.setDataNascimento("10/01/16");
        gerente.setTelefone("91189052");
        gerente.setCpf("1542121545");
        gerente.setSexo("M");
        gerente.setIdFuncionario(1);
        gerente.setRua("fikb");
        gerente.setBairro("teste");
        gerente.setCidade("citytest");
        gerente.setNumeroCasa(665);
        gerente.setCidade("CP");
        gerente.setSenhaFuncionario("123");
        
        //GerenteDAO gr = new GerenteDAO();
        //id = gr.pesquisaGerenteNoBanco(cpf);
        //System.out.print(id);
        
        FuncionarioDAO fun = new FuncionarioDAO();
        fun.inserirFuncionarioNoBanco(gerente);
}
    
}