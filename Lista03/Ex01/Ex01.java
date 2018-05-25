package Ex01;

import java.util.Scanner;

/**
 *
 * @author GeorgetonJr
 */
public class Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner l = new Scanner(System.in);
        System.out.println("Digite 15 números ");
        int c = 1;
        float m = 1f;
        float maior = 0f;
        float menor = 0f;
        System.out.printf("Número %dº : ", c);
        float n = l.nextFloat();
        maior = n;
        menor = n;
        for (c = 2; c <= 15; c++) {
            n=0;
            System.out.printf("Número %dº : ", c);
            n = l.nextFloat();
            if (n > maior) {
                maior = n;
            } else if (n < menor) {
                menor = n;
            }
        }
        System.out.printf("O menor número digitado foi %.0f e o maior foi %.0f\n", menor, menor);
    }

}
