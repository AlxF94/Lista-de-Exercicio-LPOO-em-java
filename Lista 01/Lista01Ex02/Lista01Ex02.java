/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista01ex02;

import java.util.Scanner;

/**
 *
 * @author GeorgetonJr
 */
public class Lista01Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner l = new Scanner (System.in);
        System.out.println("-------Conversor de Temperatura-------");
        System.out.print("Digite a temperatura em celsius: ");
        float c = l.nextFloat();
        float fah =(float) (c*1.8)+32);
        System.out.printf("A temperatura em Fahrenheit é %.2f",fah);
        
    }
    
}
