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
import DAO.AnimalDAO;
import Modelo.ModeloAnimal;
import DAO.AnimalExoticoDAO;
import java.sql.SQLException;
public class ControleAnimal {
    AnimalDAO animalDAO = new AnimalDAO();
    public boolean inserirAnimal(ModeloAnimal animal)throws SQLException, Exception{
        return animalDAO.inserirAnimal(animal);
    }
    
    public boolean alterarAnimal(ModeloAnimal animal,int idDoAnimal)throws SQLException, Exception{
        return animalDAO.alterarAnimal(animal, idDoAnimal);
    }
    
    public ModeloAnimal consultarAnimal(String cpf,String nomeAnimal)throws SQLException, Exception{
        return animalDAO.pesquisarAnimal(cpf, nomeAnimal);
    }
    
    public boolean excluirAnimal(int idDoAnimal)throws SQLException, Exception{
        return animalDAO.excluirAnimal(idDoAnimal);
    }
}
