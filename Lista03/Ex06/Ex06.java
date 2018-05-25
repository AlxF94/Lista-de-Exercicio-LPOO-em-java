package Ex06;

import java.util.Scanner;

/**
 *
 * @author GeorgetonJr
 */
public class Ex06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        int n1 = 0, n2 = 0, n3 = 0,sm,pr;
        float media=0;
        System.out.print ("Digite três números: ");
        n1=leia.nextInt();
        n2=leia.nextInt();
        n3=leia.nextInt();
        sm=n1+n2+n3;
        pr=n1*n2*n3;
        media=sm/3;
        System.out.printf("A soma dos números é %d, o produto é %d e a media é %f\n",sm,pr,media);
    }

}
