/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora01;

import java.util.Scanner;

/**
 *
 * @author web38
 */
public class Calculadora01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        OperacoesSimples op01;
        op01 = new OperacoesSimples();
        System.out.print("Digite o 1º número: ");
        op01.setn1(leia.nextInt());
        System.out.print("Digite o 2º número: ");
        op01.setn2(leia.nextInt());
        op01.getResultdiv();
        op01.getResultmult();
        op01.getResultsoma();
        op01.getResultsub();
    }
    
}
