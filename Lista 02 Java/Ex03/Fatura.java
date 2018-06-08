/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex03;

/**
 *
 * @author web38
 */
public class Fatura {
    String numero;
    String descricao;
    int qtd;
    double preco;
    double vlfat;

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getNumero() {
        return numero;
    }

    public double getPreco() {
        return preco;
    }

    public int getQtd() {
        return qtd;
    }

   public void  valorfatura() {
       double fat = this.preco*this.qtd;
       System.out.printf("O valor da fatura é %.2f",fat);
       
        
    }
    
    
    
    
}
