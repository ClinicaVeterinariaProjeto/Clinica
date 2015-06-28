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
import Modelo.ModeloAnimalExotico;
import DAO.AnimalExoticoDAO;
import java.sql.SQLException;
public class ControleAnimaisExoticos {
    AnimalExoticoDAO exotico = new AnimalExoticoDAO();
    public boolean inserirAnimalExotico(ModeloAnimalExotico animalexotico)throws SQLException, Exception{
        return exotico.inserirAnimalNoBanco(animalexotico);
    }
    
    public boolean alterarAnimalExotico(ModeloAnimalExotico animalexotico,int idDoAnimal)throws SQLException, Exception{
        return exotico.alterarAnimalNoBanco(animalexotico, idDoAnimal);
    }
    
    public ModeloAnimalExotico consultarAnimalExotico(String cpf,String nomeAnimal)throws SQLException, Exception{
        return exotico.pesquisarAnimalNoBanco(cpf, nomeAnimal);
    }
    
    public boolean excluirAnimalExotico(int idDoAnimal)throws SQLException, Exception{
        return exotico.excluirAnimalExoticoNoBanco(idDoAnimal);
    }
}
