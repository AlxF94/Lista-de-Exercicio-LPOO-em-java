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
        int m = 0;
        int par = 0;
        int impar = 0;
        while (m < 1000) {
            System.out.print("Digite um número: ");
            m = l.nextInt();
            if (m % 2 == 0) {
                par = par + m;
            } else {
                impar = impar + m;
            }
        }
        System.out.printf("A soma dos números pares é %d\n", par);
        System.out.printf("A soma dos números impares é %d\n", impar);
    }

}
