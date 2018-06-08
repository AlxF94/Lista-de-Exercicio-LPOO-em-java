/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex04;

import java.util.Scanner;

/**
 *
 * @author Georgetonjr
 */
public class Ex04 {
       public static void main(String[] args) {
        // TODO code application logic here
         Scanner l = new Scanner(System.in);   
         Empregado e1 = new Empregado();
         System.out.print("Primeiro nome: ");
         e1.setPnome(l.next());
         System.out.print("Ultimo nome: ");
         e1.setUnome(l.next());
         System.out.print("Salario: ");
         e1.setSalario(l.nextDouble());
        
        
         e1.statusempregado();

        
        
      
    }
    
}
