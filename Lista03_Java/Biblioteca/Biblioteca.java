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
public class Biblioteca {
    public static void main(String[] args) {
        Livro sda = new Livro();
        sda.livr("Senhor dos aneis", "J. R. R. Tolkien", "", "2", 2000, "Literatura fantástica, Ficção de aventura", 464);
        sda.consultaLivro();
        Usuario u1 = new Usuario();
        u1.Us("Paulo de souza", "12365485241", "SBS Q3 LT 19/20", "9 9874-5612");
        u1.consultaUsuario();
        u1.setLemprestado(2);
        u1.getLemprestado();
        
    }
    
}
