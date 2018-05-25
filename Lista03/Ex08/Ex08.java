package Ex08;

import java.util.Scanner;

/**
 *
 * @author GeorgetonJr
 */
public class Ex08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner l = new Scanner(System.in);
        int c = 1;
        float md = 0, maior = 0, menor = 0, ma = 0;
        while (md > 0) {
            System.out.print("Digite a media do aluno: ");
            md = l.nextFloat();
            if (md > maior) {
                maior = md;
            } else if (md < menor) {
                menor = md;
            }
            c++;
            ma = ma + md;
        }
        ma = ma / c;
        System.out.printf("A maior nota foi %.0f\n", maior);
        System.out.printf("A menor nota foi %.0f\n", menor);
        System.out.printf("A media geral foi %.0f\n", ma);

    }

}
