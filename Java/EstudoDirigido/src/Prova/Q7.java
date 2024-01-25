
package Prova;

/**
 Escreva um programa Java contendo um ArrayList de inteiros chamado valores. Peça para o usuário
informar 5 valores inteiros e adicione-os individualmente no ArrayList. Em seguida imprima os elementos
do ArrayList, de forma individual, usando o laço for.
 */
import java.util.*;
public class Q7 {


    public static void main(String[] args) {
        ArrayList <Integer> valores = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        
        for(int i=0;i<5;i++){
            System.out.println("Digite um valor: ");
            int num = sc.nextInt();
            valores.add(num);
        }
        
        for(int x: valores){
            System.out.println(x);
        }
    }
    
}
