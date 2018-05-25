package Ex09;

import java.util.Scanner;

/**
 *
 * @author GeorgetonJr
 */
public class Ex09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner l = new Scanner(System.in);
        int n, nd = 0;
        System.out.println("-----------------");
        System.out.println("-Números Primos-");
        System.out.println("-----------------");
        System.out.println("");
        System.out.print("Digite um número: ");
        n = l.nextInt();
        if (n > 0) {
            for (int c = 1; c < n; c++) {
                if (n % c == 0) {
                    nd = nd++;
                }
            }
            if (nd == 2) {
                System.out.printf("O número %d é primo", n);
            } else {
                System.out.println("O número informado não é primo");
            }

        }else   {
            System.out.println("Número Invalido!!! *_*");
        }

    }

}
