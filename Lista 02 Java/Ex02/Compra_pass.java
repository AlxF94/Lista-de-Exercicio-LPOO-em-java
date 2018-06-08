/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex02;

/**
 *
 * @author web38
 */
public class Compra_pass {
    String nome;//nome do usuaio
                  private String porii;//pais de origem
                  private String pdes;// pais de destino
                  private String dataida;//data de ida
                  private String datavolta;//data de volta 
                  private String CPF;//numero do cpf
                  private String ncard;//numero do cartao
                  private String cseg; //codigo de segurança
                  private String val;//validade do cartão
                  double valor=1500.00f;

    public void Compra_pass(String nome, String porii, String pdes, String dataida, String datavolta, String CPF, String ncard, String cseg, String val) {
        this.nome = nome;
        this.porii = porii;
        this.pdes = pdes;
        this.dataida = dataida;
        this.datavolta = datavolta;
        this.CPF = CPF;
        this.ncard = ncard;
        this.cseg = cseg;
        this.val = val;
    }
                  

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setPorii(String porii) {
        this.porii = porii;
    }

    public void setPdes(String pdes) {
        this.pdes = pdes;
    }

    public void setDataida(String dataida) {
        this.dataida = dataida;
    }

    public void setDatavolta(String datavolta) {
        this.datavolta = datavolta;
    }

    public void setNcard(String ncard) {
        this.ncard = ncard;
    }

    public void setCseg(String cseg) {
        this.cseg = cseg;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void  Status() {
        System.out.printf("Obrigado por escolher a nossa agência aérea\n "
                + "Origem: %s                        Destino: %s\n"
                + "Valor: %.2f\n"
                + "Nome do passageiro: %s\n"
                + "CPF: %s\n"
                + "Data de ida: %s               Data de volta: %s\n"
                + "Desejamos a todos um otimo vôo!!! *_*\n\n",porii,pdes,valor,nome,CPF,dataida,datavolta,ncard);
        
    }
    
    
    
    
                  
                  
    
}
