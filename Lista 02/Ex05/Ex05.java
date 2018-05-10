/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex05;

import java.util.Scanner;

/**
 *
 * @author GeorgetonJr
 */
public class Ex05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner l = new Scanner(System.in);
        float soma,mult,media;
        System.out.println("Informe 3 números");
        System.out.print("Informe o 1º número: ");
        float n1 = l.nextFloat();
        System.out.print("Informe o 2º número: ");
        float n2 = l.nextFloat();
        System.out.print("Informe o 3º número: ");
        float n3 = l.nextFloat();
        System.out.printf(" Para somar digite [1]\n Para multiplicar digite [2]\n Para media digite [3]\n");
        int op = l.nextInt();
        switch (op){
            case 1:
                soma = n1+n2+n3;
                System.out.printf("O resultado da soma é %.0f\n",soma);
                break;
            case 2:
                mult = n1*n2*n3;
                System.out.printf("O resultado da multiplicação %.0f\n",mult);
                break;
            case 3:
                media = (n1+n2+n3)/3;
                System.out.printf("A media dos número é %.0f\n",media);
                break;
        }
    }
    
}
