/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex04;

/**
 *
 * @author web38
 */
public class Empregado {
    String pnome;
    String unome;
    double salario;

    public void setPnome(String pnome) {
        this.pnome = pnome;
    }

    public void setUnome(String unome) {
        this.unome = unome;
    }

    public void setSalario(double salario) {
        if (salario<0) {
            this.salario = 0.0;
            
        }else{
        this.salario = salario;
        }
    }

    public String getPnome() {
        return pnome;
    }

    public String getUnome() {
        return unome;
    }

    public double getSalario() {
        return salario;
    }
    public void statusempregado(){
        System.out.printf("Nome: %s %s\n"
                + "Salario: R$%.2f\n",pnome,unome,salario);
    }
    
    
}
