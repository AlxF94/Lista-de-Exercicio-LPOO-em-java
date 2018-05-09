package lista01ex04;

import java.util.Scanner;

/**
 *
 * @author GeorgetonJr
 */
public class Lista01Ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner l = new Scanner (System.in);
        int troca;
        System.out.print("Digite um Valor para A: ");
        int a = l.nextInt();
        System.out.print("Digite um Valor para B: ");
        int b = l.nextInt();
        troca = a;
        a=b;
        b=troca; 
        System.out.printf("O valor de A agora é %d\n",a);
        System.out.printf("O valor de B agora é %d\n",b);       
        
    }
    
}
