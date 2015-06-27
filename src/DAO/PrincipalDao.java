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
    
        ModeloGerente gerent = new ModeloGerente();
        gerent.setNome("ale");
        gerent.setSobrenome("onça");
        gerent.setEmail("teste@test");
        gerent.setDataNascimento("10/01/16");
        gerent.setTelefone("91189052");
        gerent.setCpf("1542121545");
        gerent.setSexo("M");
        gerent.setIdGerente(2);
        gerent.setSenhaGerente("admin");
        gerent.setRua("fikb");
        gerent.setBairro("teste");
        gerent.setCidade("citytest");
        gerent.setNumeroCasa(667);
        gerent.setCidade("CP");
        GerenteDAO cd = new GerenteDAO();
      //  cd.inserirGerenteNoBanco(gerent);
        
        //cd.excluirClienteNoBanco(cpf);
        
        //cliente = cd.pesquisaClienteNoBanco(cpf);
        //cd.alterarClienteNoBanco(cpf, cliente);
        
       
         
        ModeloFuncionario funcionario = new ModeloFuncionario();
        funcionario.setNome("Will");
        funcionario.setSobrenome("marques");
        funcionario.setEmail("teste@test");
        funcionario.setDataNascimento("10/01/16");
        funcionario.setTelefone("91189052");
        funcionario.setCpf("1542121545");
        funcionario.setSexo("M");
        funcionario.setIdFuncionario(1);
        funcionario.setRua("fikb");
        funcionario.setBairro("teste-new");
        funcionario.setCidade("citytest");
        funcionario.setNumeroCasa(665);
        funcionario.setCidade("CP");
        funcionario.setSenhaFuncionario("123");
       
        GerenteDAO gr = new GerenteDAO();
      //  id = gr.pesquisaGerenteNoBanco(cpf);
      //  System.out.print(id);
        String cpf = ("1542121545");
        FuncionarioDAO fun = new FuncionarioDAO();
       /* fun.inserirFuncionarioNoBanco(funcionario,gerent.getIdGerente()); //funcionando
        ModeloFuncionario func = new ModeloFuncionario();
        func=fun.pesquisarFuncionarioNoBanco(cpf);
        System.out.println(   func.getCpf() +func.getNome() + func.getSobrenome() 
        + func.getEmail() + func.getTelefone() + func.getDataNascimento() + func.getSexo()
        + func.getIdFuncionario() + func.getRua() + func.getNumeroCasa() + func.getBairro()+ func.getCidade());
       fun.alterarFuncionarioNoBanco(cpf,funcionario);  */
        fun.excluirFuncionarioNoBanco(cpf);
     
}
    
}