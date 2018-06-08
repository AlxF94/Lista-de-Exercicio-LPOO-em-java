/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex05;

import java.util.Scanner;

/**
 *
 * @author Georgetonjr
 */
public class Ex05 {
       public static void main(String[] args) {
        // TODO code application logic here
         Scanner l = new Scanner(System.in);               
         Data d1 = new Data();
         d1.setDia(l.nextInt());
         d1.setMes(l.nextInt());
         d1.setAno(l.nextInt());
         
         d1.an();
         }
    
}
