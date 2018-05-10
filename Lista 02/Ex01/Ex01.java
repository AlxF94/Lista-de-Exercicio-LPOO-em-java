
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
        int n;
        System.out.print("Digite um número: ");
        n = l.nextInt();
        
        if( n%2==0) {
            System.out.println("O número é PAR!!!!");            
        }else   {
            System.out.println("O número é IMPAR!!!!");
        }
        if (n>0) {         
             System.out.println("O número é positivo!!!");
        }else{
            System.out.println("O número é negativo!!!");
        }
     
             
    }
    
}
