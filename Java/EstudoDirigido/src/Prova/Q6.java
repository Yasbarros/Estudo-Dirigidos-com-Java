/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prova;

import java.util.Random;

/**
 Preencha uma matriz de inteiros com números aleatórios positivos menores que 100.
 */
public class Q6 {
    
    public static void main(String[] args) {
        Random random = new Random();
        int matriz[][] = new int [3][3]; 
        
        for(int i=0; i<matriz.length;i++){
            for(int j= 0; j<matriz[i].length;j++){
                int numero = random.nextInt(100);
                matriz[i][j] = numero;
            }
        }
        
        
        for(int i=0; i<matriz.length;i++){
            for(int j= 0; j<matriz[i].length;j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
        
    }
    
}
