/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.ModeloAnimal;
import Modelo.ModeloAnimalExotico;
import Modelo.ModeloCliente;
import Persistencia.Conexao;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author William
 */
public class AnimalDAO {
    private Connection conexao;
    public boolean inserirAnimal(ModeloAnimal animal) throws ClassNotFoundException, SQLException{
        this.conexao = new Conexao().getConexao();
        try{                        
            String query_exotico = "INSERT INTO Animal(TipoAnimal,Raca, Nome, AnoNascimento, Peso, Data_vasc,idAnimal,idCliente)VALUES(?,?,?,?,?,?,?,?)";
            PreparedStatement stmt2 = conexao.prepareStatement(query_exotico);
            stmt2.setString(1,animal.getTipo());
            stmt2.setString(2,animal.getRaca());
            stmt2.setString(3,animal.getNome());
            stmt2.setInt(4,animal.getAnoNascimento());
            stmt2.setFloat(5,animal.getPeso());                       
            stmt2.setString(6,(animal.getUltimaVascina()));  
            stmt2.setInt(7,animal.getIdAnimal());
            stmt2.setInt(8,animal.getIdDono());            
            stmt2.executeUpdate();           
            stmt2.close();
            conexao.close();
            return true;
        } 
        catch (SQLException e ) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir animal "+e);
            return false;
        }    
    }
    
    public ModeloAnimal pesquisarAnimal(String cpf,String nomeDoAnimal) throws ClassNotFoundException, SQLException{
        this.conexao = new Conexao().getConexao();
        ModeloAnimal animal = new ModeloAnimal();
        ResultSet rs = null;
        ModeloCliente cliente = new ModeloCliente();
        ClienteDAO cl = new ClienteDAO();
        cliente=cl.pesquisaClienteNoBanco(cpf);
        try{            
            String sql ="SELECT Raca,Nome,TipoAnimal,AnoNascimento,Peso,Data_vasc,idAnimal,idCliente "
                    + "FROM Animal "
                    + "WHERE idCliente = ? and Nome = ? ";                   
            PreparedStatement pstmt = conexao.prepareStatement(sql); 
            pstmt.setInt(1,cliente.getIdCliente());
            pstmt.setString(2,nomeDoAnimal);
            rs = pstmt.executeQuery();
            while (rs.next()){ 
                ModeloAnimal temp = new ModeloAnimal();
                temp.setRaca(rs.getString("Raca"));
                temp.setNome(rs.getString("Nome"));
                temp.setTipo(rs.getString("TipoAnimal"));
                temp.setAnoNascimento(rs.getInt("AnoNascimento"));
                temp.setPeso(rs.getFloat("Peso"));
                temp.setUltimaVascina(rs.getString("Data_vasc"));
                temp.setIdAnimal(rs.getInt("idAnimal"));
                temp.setIdDono(rs.getInt("idCliente"));
                animal=temp;
            }
            rs.close();
            pstmt.close();
            conexao.close();         
            return animal;
        }
        catch (SQLException e) { 
          JOptionPane.showMessageDialog(null,"Erro ao buscar Animal"+e);
            return null;
        } 
    }
    
    public boolean alterarAnimal(ModeloAnimal animal,int idDoAnimal) throws ClassNotFoundException, SQLException{
        this.conexao = new Conexao().getConexao();
        try{            
            String sql ="UPDATE Animal SET Raca = ?, Nome = ?, Peso = ?,"
            + " Data_vasc = ? WHERE idAnimal = ?" ;
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1,animal.getRaca());
            stmt.setString(2,animal.getNome());
            stmt.setFloat(3,animal.getPeso());
            stmt.setString(4,animal.getUltimaVascina());                        
            stmt.setInt(5,idDoAnimal);
            stmt.execute();
            stmt.close();
            conexao.close();
            return true;
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro ao alterar Animal"+e);
            return false;
        }
    }
    //exclui pelo id 
    public boolean excluirAnimal(int idDoAnimal)throws ClassNotFoundException, SQLException{
        this.conexao = new Conexao().getConexao();    
        try{            
            String sql ="DELETE FROM Animal WHERE idAnimal = ?";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1,idDoAnimal);  
            stmt.executeUpdate();
            conexao.close();
            return true;
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro ao excluir Animal"+e);
            return false;
        }
    }
    
    /**/
    
}
/*
create table Gerente(
 Nome VARCHAR (50) not null,
 email varchar (45) not null,
 Telefone varchar (45) not null,
 CPF varchar (45) not null,
 DataNascimento date not null,
 Sexo varchar(10)  not null,
 idGerente integer not null,
 loginGerente varchar(10) not null,
 senhaGerente varchar (20) not null,
 Rua varchar (60) not null,
 NumeroCasa integer not null,
 Bairro varchar (20) not null,
 Cidade varchar (20) not null,
 primary key (idGerente)

);

create table Cliente (
 Nome VARCHAR (50) not null,
 email varchar (45) not null,
 Telefone varchar (45) not null,
 CPF varchar (45) not null,
 DataNascimento date not null,
 Sexo varchar(10) not null,
 idCliente integer auto_increment not null,
 Rua varchar (60) not null,
 NumeroCasa integer not null,
 Bairro varchar (20) not null,
 Cidade varchar (20) not null,
 primary key (idCliente)
 );



create table Funcionario(
 Nome VARCHAR (50) not null,
 email varchar (45) not null ,
 Telefone varchar (45) not null,
 CPF varchar (45) not null,
 DataNascimento date not null,
 Sexo varchar(10)  not null,
 idFuncionario integer auto_increment not null,
 loginFuncionario varchar (10) not null,
 senhaFuncionario varchar (20) not null,
 Rua varchar (60) not null,
 NumeroCasa integer not null,
 Bairro varchar (20) not null,
 Cidade varchar (20) not null,
 primary key (idFuncionario),
 idGerente integer,
 foreign key (idGerente) references Gerente(idGerente)
);



create table Veterinario(
 Nome VARCHAR (50) not null,
 email varchar (45) not null ,
 Telefone varchar (45) not null,
 CPF varchar (45) not null,
 DataNascimento date not null,
 Sexo varchar(10)  not null,
 idVeterinario integer auto_increment not null,
 loginVeterinario varchar(10) not null,
 senhaVeterinario varchar(25) not null,
 Rua varchar (60) not null,
 NumeroCasa integer not null,
 Bairro varchar (20) not null,
 Cidade varchar (20) not null,
 primary key (idVeterinario),
 idGerente integer not null,
 foreign key (idGerente) references Gerente(idGerente)
);



create table Animal (
TipoAnimal varchar (9) not null,
Raca varchar (20) not null,
Nome varchar (30) not null,
AnoNascimento integer not null,
Peso float not null,
Data_vasc date not null,
idAnimal integer auto_increment not null,
idCliente integer not null,
primary key (idAnimal),
foreign key (idCliente) references Cliente(idCliente)
);



create table Estoque(
NomeProduto varchar(30) not null,
QuantidadeProduto integer not null,
ValorProduto float not null
);

*/