/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex04;

import java.util.Scanner;

/**
 *
 * @author GeorgetonJr
 */
public class Ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String op = null;
        float maior, menor, meio = 0;
        Scanner l = new Scanner(System.in);
        System.out.print("Digite a 1º número: ");
        float n1 = l.nextFloat();
        maior = n1;
        menor = n1;
        System.out.print("Digite a 2º número: ");
        float n2 = l.nextFloat();
        if (n2 > maior) {
            maior = n2;
        } else if (n2 < menor) {
            menor = n2;
        } else {
            meio = n2;
        }
        System.out.print("Digite a 3º número: ");
        float n3 = l.nextFloat();
        if (n3 > maior) {
            maior = n3;
        } else if (n3 < menor) {
            menor = n3;
        } else {
            meio = n3;
        }
        System.out.printf(" Para exibir os numeros em ordem crescente digite c \n Para exibir os numeros em ordem decrescente digite d\n");
        op = l.next();
        switch (op) {
            case "d":
                System.out.printf("O maior número é %.0f\n O número do meio é %.0f\n O menor número é %.0f\n",maior,meio,menor);
                break;
            case "c":
                System.out.printf("O menor número é %.0f\n O número do meio é %.0f\n O maior número é %.0f\n",menor,meio,maior);
                break;
                
        }
    }

}
