package Biblioteca;

import java.io.PrintStream;

/**
 *
 * @author Georgetonjr
 */
public class Livro {
    String Lnome;
    String Lautor;
    String Leditora;
    String Ledicao;
    int Lano;
    String Lcategoria;
    int lnpag;
    float valor;
    //Para usar com livraria ou biblioteca
    public void livr(String Lnome, String Lautor, String Leditora, String Ledicao, int Lano, String Lcategoria,int lnpag) {
        this.Lnome = Lnome;
        this.Lautor = Lautor;
        this.Leditora = Leditora;
        this.Ledicao = Ledicao;
        this.Lano = Lano;
        this.Lcategoria = Lcategoria; 
        this.lnpag = lnpag;
    }
    //Para usar com a livraria
    public void setValor(float valor) {
        this.valor = valor;
    }
    //Para usar com a livraria
    public float getValor() {
        return valor;
    }
    //Para usar com livraria ou biblioteca
    public void consultaLivro(){
        System.out.printf(" Nome: %s\n"
                        + " Autor: %s \n"
                        + " Categoria: %s\n"
                        + " Ano: %d\n"
                        + " Edição: %s\n"
                        + " Editora: %s\n\n\n\n ",Lnome,Lautor,Lcategoria,Lano,Ledicao,Leditora);
        
    }

    
    
    
}
