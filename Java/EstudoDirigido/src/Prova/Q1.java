/*
  – Implemente em Java uma calculadora. A calculadora deve ter as operações básicas: soma, subtração,
       multiplicação e divisão e o módulo. O programa deve exibir o seguinte menu:
       Digite o número correspondente a operação desejada e aperte &lt;enter&gt;
       ********************************************************
       ********************************************************
       * 1 - Adição de dois números
       * 2 - Subtração de dois números
       * 3 - Multiplicação de dois números
       * 4 - Divisão de dois números
       * 5 - O resto da divisão(modulo) de dois números
       * 9 - Encerrar Programa
       *********************************************************
       Esse menu deve ser exibido na tela até que a opção 9 seja digitada.
 */
package Prova;
import java.util.*;
import RevisãoPoo.calculadora;


public class Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
       System.out.println("Qual operação matematica? \n" 
               + "1 - Adição de dois números \n"
               + "2 - Subtração de dois números \n"
               + "3 - Multiplicação de dois números \n"
               + "4 - Divisão de dois números \n"
               + "5 - O resto da divisão(modulo) de dois números \n"
               + "9 - Encerrar Programa");
       
        int operação = sc.nextInt();
        if(operação == 9){
            System.exit(0);
        }
        
        
        System.out.println("Digite um numero: ");
        double n1 = sc.nextDouble();
        System.out.println("Digite um numero: ");
        double n2 = sc.nextDouble();
        
        calculadora calcula = new calculadora(n1, n2);
        
        switch (operação){
            
            case 1:
                System.out.println("Resultado: " + calcula.somar());
                break;
            case 2:
                System.out.println("Resultado: " + calcula.subtrair());
                break;
            case 3:
                System.out.println("Resultado: " + calcula.multiplicar());
                break;
            case 4:
                System.out.println("Resultado: " + calcula.dividir());
                break;
            case 5:
                System.out.println("Resultado: " + calcula.resto());
                break;
            default:
                System.out.println("Numero invalido. Tente de novo: ");
     
                
        
        }
        
        sc.close();
        
    }
    
}
