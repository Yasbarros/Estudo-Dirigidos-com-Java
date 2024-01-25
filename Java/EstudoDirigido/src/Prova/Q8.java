/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prova;

import RevisãoPoo.Conta;
import java.util.Scanner;

/**
 Um banco mantém contas de clientes armazenando o número da conta, o nome do cliente e o saldo
atual da conta. Os clientes podem depositar o quanto quiserem nas contas, mas podem sacar somente
enquanto a conta possuir saldo positivo. Crie esses métodos de deposito e saque na classe conta e na classe
banco que será a principal instancie um objeto da classe conta e realize as possíveis operações.
 */
public class Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta pessoa1 = new Conta();
        
        System.out.println("Digite sua conta: ");
        pessoa1.conta = sc.next();
        System.out.println("Digite seu nome: ");
        pessoa1.nome = sc.next();
        System.out.println("Digite seu saldo: ");
        pessoa1.saldo = sc.nextDouble();
                
        System.out.println("Qual procedimento deseja fazer? \n" //acrescentar loop
                + "1 - Deposito\n"
                + "2 - Saque ");
        int p = sc.nextInt();
        
        if(p == 1){
            System.out.println("Digite o valor para deposito: ");
            double depo = sc.nextDouble();
            pessoa1.deposito(depo);
            System.out.println("Saldo atual: " + pessoa1.saldo);
        }
        else if(p == 2){
            if(pessoa1.saldo!= 0){
                System.out.println("Saldo atual: R$" + pessoa1.saldo);
                System.out.println("Digite o valor para saque: ");
                double saque = sc.nextDouble();
                pessoa1.saque(saque);
                System.out.println("Saldo atual: " + pessoa1.saldo);
            }else{
                System.out.println("Você esta sem saldo.");
            }
        }
        
        System.out.println(pessoa1);
                
    }
    
}
