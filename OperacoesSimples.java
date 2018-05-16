/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora01;

/**
 *
 * @author web38
 */
public class OperacoesSimples {
    int n1=0;
    int n2=0;
    int soma= n1+n2;
    float sub=(float)n1-n2;
    float div=(float)n1/n2;
    int mult=n1*n2;
    
    public void setn1(int n1){        
        this.n1=n1;
    }  
    public void setn2(int n2){        
        this.n2=n2;
    }     
    public void getResultsoma(){
        System.out.printf("O resultado da soma é %d\n",this.soma=this.n1+this.n2);         
    }
    public void getResultsub(){
        System.out.printf("O resultado da subtração é %.0f\n",this.sub=this.n1-this.n2);        
    }
     public void getResultdiv(){
         if (n1==0) {
             System.out.println("Impossivel dividir");
         }else {
            System.out.printf("O resultado da divisão é %.2f\n",this.div=this.n1/this.n2); 
         }                   
    }
      public void getResultmult(){
        System.out.printf("O resultado da multiplicação é %d\n",this.mult=this.n1*this.n2);        
    }
    
}
