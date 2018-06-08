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
public class Usuario {
    String Unome;
    String Ucpf;
    String Uendereco;
    String Utelefone;
    int Lemprestado;

    public void Us(String Unome, String Ucpf, String Uendereco, String Utelefone) {
        this.Unome = Unome;
        this.Ucpf = Ucpf;
        this.Uendereco = Uendereco;
        this.Utelefone = Utelefone;
    }

    public String getUnome() {
        return Unome;
    }

    public String getUcpf() {
        return Ucpf;
    }

    public String getUendereco() {
        return Uendereco;
    }

    public String getUtelefone() {
        return Utelefone;
    }

    public void setUcpf(String Ucpf) {
        this.Ucpf = Ucpf;
    }

    public void setUendereco(String Uendereco) {
        this.Uendereco = Uendereco;
    }

    public void setUnome(String Unome) {
        this.Unome = Unome;
    }

    public void setUtelefone(String Utelefone) {
        this.Utelefone = Utelefone;
    }
    public void consultaUsuario(){
        System.out.printf("Nome: %s\n"
                        + " Cpf: %s\n"
                        + " Endereço: %s\n"
                        + " Telefone: %s\n",Unome,Ucpf,Uendereco,Utelefone);
    }

    public int getLemprestado() {
        System.out.printf(" Livros emprestados: %d\n",Lemprestado);
        return Lemprestado;
    }

    public void setLemprestado(int Lemprestado) {
        this.Lemprestado = Lemprestado;
    }
    
    
    
    
}
