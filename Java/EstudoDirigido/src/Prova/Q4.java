/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prova;

import java.util.*;

/**
 Escreva um programa Java que declara e constrói uma matriz de 10 elementos do tipo int. Em seguida use
um laço for para inicializar os elementos com os valores de 1 até 10. Para finalizar exiba os valores dos
elementos da matriz na vertical. Seu programa deverá exibir a seguinte saída:
1
2
3
4
5
6
7
8
9
10
 */
public class Q4 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] matriz = new int[10];
       
        for(int i=0; i<matriz.length;i++){
            matriz[i] = i+1;
        }
        
        for(int i=0; i<matriz.length;i++){
            System.out.println(matriz[i]);
        }
    }
    
}
