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
import Modelo.ModeloAnimalDomestico;
import DAO.AnimalDomesticoDAO;
import java.sql.SQLException;
public class ControleAnimaisDomesticos {
    AnimalDomesticoDAO exotico = new AnimalDomesticoDAO();
    public boolean inserirAnimalDomestico(ModeloAnimalDomestico animalexotico)throws SQLException, Exception{
        return exotico.inserirAnimalNoBanco(animalexotico);
    }    
    public boolean alterarAnimalDomestico(ModeloAnimalDomestico animalexotico,int idDoAnimal)throws SQLException, Exception{
        return exotico.alterarAnimalNoBanco(animalexotico, idDoAnimal);
    }    
    public ModeloAnimalDomestico consultarAnimalDomestico(String cpf,String nomeAnimal)throws SQLException, Exception{
        return exotico.pesquisarAnimalNoBanco(cpf, nomeAnimal);
    }    
    public boolean excluirAnimalDomestico(int idDoAnimal)throws SQLException, Exception{
        return exotico.excluirAnimalDomesticoNoBanco(idDoAnimal);
    }
}
