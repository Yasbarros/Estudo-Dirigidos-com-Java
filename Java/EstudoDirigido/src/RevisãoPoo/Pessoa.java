/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RevisãoPoo;

/**
 *
 * @author User
 */
public class Pessoa {
    public String nome;
    public int numero;
    public String email;
    public String endereco;

    public Pessoa() {
    }
    
    
    
    public Pessoa(String nome, int numero, String email, String endereco){
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Nome: " + nome+"\nTel: "+numero+"\nEmail: "+email+"\nEndereço: "+endereco; 
    }
    
    
    
}
