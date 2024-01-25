/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q3;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class CalculadoraAreaFiguras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exemplo de uso para o círculo
        System.out.print("Digite o raio do círculo: ");
        double raioCirculo = scanner.nextDouble();
        Circulo circulo = new Circulo(raioCirculo);
        circulo.mostrarArea();

        // Exemplo de uso para o quadrado
        System.out.print("Digite o lado do quadrado: ");
        double ladoQuadrado = scanner.nextDouble();
        Quadrado quadrado = new Quadrado(ladoQuadrado);
        quadrado.mostrarArea();

        // Exemplo de uso para o triângulo
        System.out.print("Digite a base do triângulo: ");
        double baseTriangulo = scanner.nextDouble();
        System.out.print("Digite a altura do triângulo: ");
        double alturaTriangulo = scanner.nextDouble();
        Triangulo triangulo = new Triangulo(baseTriangulo, alturaTriangulo);
        triangulo.mostrarArea();

        scanner.close();
    }
    
}
