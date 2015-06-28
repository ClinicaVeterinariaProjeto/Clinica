/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;
import Modelo.ModeloAnimalExotico;
import Persistencia.Conexao;
import Modelo.ModeloCliente;
import Modelo.ModeloFuncionario;
import Modelo.ModeloGerente;
import Modelo.ModeloVeterinario;
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
        gerent.setEmail("teste@test");
        gerent.setDataNascimento("10/01/16");
        gerent.setTelefone("91189052");
        gerent.setCpf("1542121545");
        gerent.setSexo("M");
        gerent.setIdGerente(2);
        gerent.setLoginGerente("admin");
        gerent.setSenhaGerente("admin");
        gerent.setRua("fikb");
        gerent.setBairro("teste");
        gerent.setCidade("citytest");
        gerent.setNumeroCasa(667);
        GerenteDAO cd = new GerenteDAO();
      //  cd.inserirGerenteNoBanco(gerent);
        
        //cd.excluirClienteNoBanco(cpf);
        
        //cliente = cd.pesquisaClienteNoBanco(cpf);
        //cd.alterarClienteNoBanco(cpf, cliente);
        
       
         
       ModeloFuncionario funcionario = new ModeloFuncionario();
        funcionario.setNome("Will");
        funcionario.setLoginFuncionario("marques");
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
      // String cpf = ("1542121545");
        //GerenteDAO gr = new GerenteDAO();
        //id = gr.pesquisaGerenteNoBanco(cpf);
        //System.out.print(id);
        //String cpf = ("1542121545");
        FuncionarioDAO fun = new FuncionarioDAO();
        fun.inserirFuncionarioNoBanco(funcionario,gerent.getIdGerente()); //funcionando
       // ModeloFuncionario func = new ModeloFuncionario();
       // func=fun.pesquisarFuncionarioNoBanco(cpf);
        /*System.out.println(   func.getCpf() +func.getNome() + func.getSobrenome() 
        + func.getEmail() + func.getTelefone() + func.getDataNascimento() + func.getSexo()
        + func.getIdFuncionario() + func.getRua() + func.getNumeroCasa() + func.getBairro()+ func.getCidade());
       fun.alterarFuncionarioNoBanco(cpf,funcionario);  
        fun.excluirFuncionarioNoBanco(cpf);*/
        
        // testando veterinario 
       ModeloVeterinario veterinario = new ModeloVeterinario();
        veterinario.setNome("NEW-ALTERAÇÃO");
        veterinario.setLoginVeterinario("testeALTE");
        veterinario.setEmail("teste@test");
        veterinario.setDataNascimento("10/01/16");
        veterinario.setTelefone("91189052");
        veterinario.setCpf("1542121545");
        veterinario.setSexo("M");
        veterinario.setIdVeterinario(2);
        veterinario.setRua("fikb");
        veterinario.setBairro("teste-new");
        veterinario.setCidade("citytest");
        veterinario.setNumeroCasa(665);
        veterinario.setCidade("CP");
        veterinario.setSenhaVeterinario("naruto");
        
      VeterinarioDAO vet = new VeterinarioDAO();
       // ModeloVeterinario func = new ModeloVeterinario();
     //  vet.inserirVeterinarioNoBanco(veterinario,gerent.getIdGerente() );
        //func=vet.pesquisarVeterinarioNoBanco(cpf);
       // System.out.println(   func.getCpf() +func.getNome() + func.getSobrenome() 
       // + func.getEmail() + func.getTelefone() + func.getDataNascimento() + func.getSexo()
       // + func.getIdVeterinario() + func.getRua() + func.getNumeroCasa() + func.getBairro()+ func.getCidade());
       // vet.alterarVeterinarioNoBanco(cpf, veterinario);
      //  vet.excluirVeterinarioNoBanco(cpf);
        
        
        //teste animal
      /*  ModeloCliente cliente = new ModeloCliente();
        cliente.setNome("ale");
        cliente.setSobrenome("onça");
        cliente.setEmail("teste@test");
        cliente.setDataNascimento("10/01/16");
        cliente.setTelefone("91189052");
        cliente.setCpf("1542121545");
        cliente.setSexo("M");
        cliente.setIdCliente(8);
        cliente.setRua("Rua do Teste");
        cliente.setBairro("Testolandia");
        cliente.setCidade("Teste City");
        cliente.setNumeroCasa(888);
        
        ClienteDAO cl = new ClienteDAO();
       // cl.inserirClienteNoBanco(cliente);
        
        ModeloAnimalExotico exotic = new ModeloAnimalExotico();
        exotic.setNome("Bob Esponja");
        exotic.setRaca("Esponja"); 
        exotic.setAnoNascimento(1994);
        exotic.setIdAnimal(1);
        exotic.setIdDono(8);
        exotic.setIdAnimal(4);
        exotic.setPeso(5);
        exotic.setUltimaVascina("2000-12-12");
        AnimalExoticoDAO ex = new AnimalExoticoDAO();
        ex.inserirAnimalNoBanco(exotic);
}*/
    
}
}
