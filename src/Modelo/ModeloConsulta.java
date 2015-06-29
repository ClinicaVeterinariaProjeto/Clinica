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
    private float valorConsulta;
    
    public ModeloConsulta(){}
    
    public ModeloConsulta(int dia, int mes, int horario, float valorConsulta) {
        this.dia = dia;
        this.mes = mes;
        this.horario = horario;
        this.valorConsulta = valorConsulta;
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

    public float getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(float valorConsulta) {
        this.valorConsulta = valorConsulta;
    }
    
}
