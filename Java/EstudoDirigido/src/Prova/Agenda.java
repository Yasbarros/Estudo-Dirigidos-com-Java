/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prova;
import RevisãoPoo.Pessoa;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Agenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Pessoa p1 =new Pessoa();
        Pessoa p2 = new Pessoa();
       
        System.out.println("Contato 1:");
        System.out.print("Digite seu nome");
        p1.nome = sc.next();
        System.out.print("Digite seu numero");
        p1.numero = sc.nextInt();
        System.out.print("Digite seu email");
        p1.email = sc.next();
        System.out.print("Digite seu endereço");
        p1.endereco = sc.next();
        
        
        
        
        System.out.println("Contato 2:");
        System.out.print("Digite seu nome");
        p2.nome = sc.next();
        System.out.print("Digite seu numero");
        p2.numero = sc.nextInt();
        System.out.print("Digite seu email");
        p2.email = sc.next();
        System.out.print("Digite seu endereço");
        p2.endereco = sc.next();
        
        System.out.println("");
        System.out.println("");
        System.out.println("----------------------------------");
        System.out.println(p1.toString());
        System.out.println("----------------------------------");
        System.out.println(p2.toString());
    }
    
}
