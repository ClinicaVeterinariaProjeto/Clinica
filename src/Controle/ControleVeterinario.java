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
import DAO.VeterinarioDAO;
import Modelo.ModeloVeterinario;
import java.sql.SQLException;
public class ControleVeterinario {
    VeterinarioDAO vet = new VeterinarioDAO();
    public boolean inserirVeterinario(ModeloVeterinario veterinario,int idGerente)throws SQLException, Exception{
        return vet.inserirVeterinarioNoBanco(veterinario, idGerente);
    }
    
    public boolean alterarVeterinario(String cpf,ModeloVeterinario veterinario)throws SQLException, Exception{
        return vet.alterarVeterinarioNoBanco(cpf, veterinario);
    }
    
    public ModeloVeterinario consultarVeterinario(String cpf)throws SQLException, Exception{
        return vet.pesquisarVeterinarioNoBanco(cpf);
    }
    
    public boolean excluirVeterinario(String cpf)throws SQLException, Exception{
        return vet.excluirVeterinarioNoBanco(cpf);
    }
    
    public boolean verificarCPF(String cpf)throws ClassNotFoundException, SQLException{
        return vet.VerificaCpf(cpf); 
    }
}
