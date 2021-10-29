package org.james;

//Clase para manejar fechas (DD/MM/AAAA)
import java.util.*;
class Fecha {
 //atributos
    private int año;
    private int mes;
    private int dia;
 //constructores
    public Fecha(int dia, int mes, int año) {
    this.dia = dia;
    this.mes = mes;
    this.año = año;
    }

    public Fecha(String cadenaFecha) {
///// COMPLETAR ////////
    }

    public Fecha() {

///// COMPLETAR ////////
    }
 //métodos
    @Override
    public String toString() {
    return dia + "/" + mes + "/" + año;
    }
    public int getAño() {
    return this.año;
    }
    public void setAño(int año) {
    this.año = año;
    }
    public int getDia() {
    return this.dia;
    }
    
    public void setDia(int dia) {
    this.dia = dia;
    }

    public int getMes() {
    return this.mes;
    }

    public void setMes(int mes) {
    this.mes = mes;
    }
    
}