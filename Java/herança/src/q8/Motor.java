/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q8;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Motor {
    private int numCilindros;
    private int potencia;

    // Construtor sem argumentos que inicializa os dados com zeros
    public Motor() {
        this.numCilindros = 0;
        this.potencia = 0;
    }

    // Construtor que inicializa os dados com os valores recebidos como argumento
    public Motor(int numCilindros, int potencia) {
        this.numCilindros = numCilindros;
        this.potencia = potencia;
    }

    // Função para entrada de dados
    public void get() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de cilindros: ");
        this.numCilindros = scanner.nextInt();

        System.out.print("Digite a potência: ");
        this.potencia = scanner.nextInt();
    }

    // Função para imprimir os dados
    public void print() {
        System.out.println("Número de Cilindros: " + this.numCilindros);
        System.out.println("Potência: " + this.potencia + " HP");
    }
}
