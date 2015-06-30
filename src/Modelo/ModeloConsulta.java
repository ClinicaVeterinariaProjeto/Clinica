/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

/**
 *
 * @author Alex
 */
public class ModeloConsulta {
    private int dia;
    private int mes;
    private int horario;
    private float valor;
    private int idCliente;
    private int idAnimal;
    
    public ModeloConsulta(){}
    
    public ModeloConsulta(int dia, int mes, int horario, float valorConsulta, int idCliente, int idAnimal) {
        this.dia = dia;
        this.mes = mes;
        this.horario = horario;
        this.valor = valorConsulta;
        this.idCliente = idCliente;
        this.idAnimal = idAnimal;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
}
