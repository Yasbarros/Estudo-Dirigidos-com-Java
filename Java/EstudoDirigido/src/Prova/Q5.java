/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prova;

import java.util.Scanner;

/**
 Faça um programa que preencha uma matriz 20x10 com numeros inteiros, e some cada uma das
colunas, armazenando o resultado da soma em um vetor. A seguir o programa deverar multiplicar cada
elemento da matriz pela soma da coluna e mostrar a matriz resultante.
 */
public class Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int [] [] matriz = new int[3][3];
        int [] [] maNova = new int[3][3];
        int soma [] = new int[1];
        
        int sum = 0;
        for(int i=0; i<matriz.length;i++){
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Valor: "+i+","+j);
                int valor = sc.nextInt();
                matriz[i][j] = valor;
                sum+= valor;
                
            }
            
        }
   
        soma[0] = sum;
        System.out.println("Soma: "+sum);
        
        for(int i=0; i<maNova.length;i++){
            for (int j = 0; j < maNova[i].length; j++) {
                maNova[i][j] = matriz[i][j] * sum;
            }
            
        }
        for(int i=0; i<maNova.length;i++){
            for (int j = 0; j < maNova[i].length; j++) {
                System.out.println(maNova[i][j]);
            }
            
        }
        

    }
    
}
