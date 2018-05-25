package Ex10;

import java.util.Scanner;

/**
 *
 * @author GeorgetonJr
 */
public class Ex10 {

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
            for (int co = 1; co < n; co++ ) {
                for (int c = 1; c < co; c++) {
                    if (co % c == 0) {
                        nd = nd++;
                    }
                }
                if (nd == 2) {
                    System.out.printf("O número %d é primo", co);
                }
                nd=0;
            }

        } else {
            System.out.println("Número Invalido!!! *_*");
        }

    }

}
