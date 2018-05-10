/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex03;

import java.util.Scanner;

/**
 *
 * @author GeorgetonJr
 */
public class Ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float maior,media;
        Scanner l = new Scanner(System.in);
        System.out.print("Digite a 1º nota: ");
        float n1 = l.nextFloat();
        maior = n1;
        System.out.print("Digite a 2º nota: ");
        float n2 = l.nextFloat();
        if (n2>maior) {
            maior=n2;
        }
        System.out.print("Digite a 3º nota: ");
        float n3 = l.nextFloat();
        if (n3>maior) {
            maior=n2;
        }
        media = (n1+n2+n3)/3;
        System.out.printf("A media das nota é %.2f e a maior nota é %.2f",media,maior);
        
    }
    
}
