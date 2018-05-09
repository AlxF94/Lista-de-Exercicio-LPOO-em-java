package lista01ex05;

import java.util.Scanner;

/**
 *
 * @author GeorgetonJr
 */
public class Lista01Ex05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner l = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = l.nextInt();
        int q = n*n;
        System.out.printf("O quadrado do número %d é %d\n",n,q);

    }

}
