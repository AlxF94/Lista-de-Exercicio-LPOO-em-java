/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex05;

/**
 *
 * @author web38
 */
public class Data {
    int dia;
    int mes;
    int ano;

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
public void an(){
    System.out.printf("Data: %d/%d/%d \n",dia,mes,ano);
}    
    
}
