/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista01ex01;

import java.util.Scanner;

/**
 *
 * @author GeorgetonJr
 */
public class Lista01Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner l = new Scanner(System.in);              
        System.out.println("-----------------------------------");
        System.out.print("Digite um número: ");
        int n1= l.nextInt();
        System.out.print("Digite outro número: ");
        int n2= l.nextInt();
        int soma = n1+n2;
        int produto = n1*n2;
        float media = (n1+n2)/2;
        float dif= n1-n2;
        System.out.printf("A soma dos número é %d\n",soma);
        System.out.printf("O produto dos números é %d\n", produto);
        System.out.printf("A media dos números é %.2f\n",media);
        System.out.printf("A diferença dos número é %.2f", dif);
    }
    
}
