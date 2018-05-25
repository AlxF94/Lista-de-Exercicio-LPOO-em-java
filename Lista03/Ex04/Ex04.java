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
        for (int m = 1000; m < 2000; m++) {
            if (m % 11 == 5) {
                System.out.printf("%d\n", m);
            }
        }

    }

}
