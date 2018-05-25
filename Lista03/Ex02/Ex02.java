package Ex02;

import java.util.Scanner;

/**
 *
 * @author GeorgetonJr
 */
public class Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner l = new Scanner(System.in);
        int r = 0;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d X %d = %d\n",i,j,r=i*j);
            }

        }

    }

}
