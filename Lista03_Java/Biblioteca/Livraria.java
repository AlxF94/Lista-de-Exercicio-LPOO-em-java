/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;

/**
 *
 * @author Georgetonjr
 */
public class Livraria {
    public static void main(String[] args) {
        Livro so = new Livro();
        so.livr("Senhor dos aneis", "J. R. R. Tolkien", "", "2", 2000, "Literatura fantástica, Ficção de aventura", 464);
        so.setValor(42.25f);
        so.consultaLivro();
        System.out.println("Valor: " + so.getValor());
        
    }
    
}
