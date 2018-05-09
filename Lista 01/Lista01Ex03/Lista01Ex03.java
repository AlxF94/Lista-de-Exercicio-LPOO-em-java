/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista01ex03;

import java.util.Scanner;

/**
 *
 * @author GeorgetonJr
 */
public class Lista01Ex03 {
    private static Object math;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner l = new Scanner (System.in);
        System.out.print("Digite o raio: ");
        float raio = l.nextFloat();
        System.out.print("Digite a altura: ");
        float h = l.nextFloat(); 
        float vol = (float) (Math.PI * (raio*raio)*h) ;
        System.out.printf("O volume é %.2f", vol);
        
    }
    
}
