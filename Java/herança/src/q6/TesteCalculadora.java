/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q6;

/**
 *
 * @author User
 */
public class TesteCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CalculadoraCientifica calcCientifica = new CalculadoraCientifica();

       
        System.out.println("Soma: " + calcCientifica.somar(5, 3));
        System.out.println("Subtração: " + calcCientifica.subtrair(10, 4));
        System.out.println("Multiplicação: " + calcCientifica.multiplicar(2, 6));
        System.out.println("Divisão: " + calcCientifica.dividir(8, 2));

        
        System.out.println("Raiz Quadrada: " + calcCientifica.calcularRaizQuadrada(9));
        System.out.println("Potência: " + calcCientifica.calcularPotencia(2, 3));
    
    }
    
}
