/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex01;

/**
 *
 * @author aluno
 */
public class Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float aluguel=550;
        //valor do aluguel * 0.1
        for (int ano = 1; ano<=4; ) {
            for (int mes=1; mes <=12; mes++){
                System.out.printf("O valor do aluguel do mês %d do %dº ano é %.2f \n",mes,ano,aluguel);                 
            }
            aluguel= (float) ((aluguel*0.1)+aluguel);
            ano++;
        }
        
    }
    
}
