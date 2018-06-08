
package Ex02;
import java.util.Scanner;

/**
 *
 * @author web38
 */
public class Ex02 {
        public static void main(String[] args) {
                  Scanner l = new Scanner(System.in);
                  Compra_pass c1 = new Compra_pass();
                  System.out.print("Nome: ");
                  c1.setNome(l.next());
                  System.out.print("Cpf: ");
                  c1.setCPF(l.next());
                  System.out.print("Pais de origem: ");
                  c1.setPorii(l.next());
                  System.out.print("Pais de destino: ");
                  c1.setPdes(l.next());
                  System.out.print("Data de ida: ");
                  c1.setDataida(l.next());
                  System.out.print("Data de volta: ");
                  c1.setDatavolta(l.next());
                  System.out.print("Nº do cartão: ");
                  c1.setNcard(l.next());
                  System.out.print("Validade: ");
                  c1.setVal(l.next());
                  System.out.print("Codigo de segurança: ");
                  c1.setCseg(l.next());
                  System.out.print("Valor da passagem: ");
                  c1.setValor(l.nextDouble());
                  
                  c1.Status();
                  
                  
        
      
    }
    
}
