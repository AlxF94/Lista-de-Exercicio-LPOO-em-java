/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex03;

import java.util.Scanner;

/**
 *
 * @author Georgetonjr
 */
public class Ex03 {
      public static void main(String[] args) {
        // TODO code application logic here
        Scanner l = new Scanner(System.in);       
        Fatura c1 = new Fatura();
        
        c1.setNumero(l.next());
        c1.setDescricao(l.next());
        c1.setPreco(l.nextDouble());
        c1.setQtd(l.nextInt());
        
        c1.valorfatura();
        
        
      
    }
}
