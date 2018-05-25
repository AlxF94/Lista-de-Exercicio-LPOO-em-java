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
        Scanner l = new Scanner(System.in);
        int n1 = 1;
        float soma = 0;
        for (int n2 = 1; n2 < 51; n2++) {
            soma =(float) soma + (n1 / n2);
            n1 = n1 + 2;
            System.out.printf("A soma é %.0f\n",soma);
        }

    }

}


