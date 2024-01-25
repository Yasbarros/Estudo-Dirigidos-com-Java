/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q8;

/**
 *
 * @author User
 */
public class TesteMotor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Motor motor1 = new Motor(); // Usando o construtor sem argumentos
        motor1.print(); // Imprimindo os dados inicializados com zeros

        System.out.println();

        Motor motor2 = new Motor(6, 200); // Usando o construtor com argumentos
        motor2.print(); // Imprimindo os dados inicializados com valores fornecidos

        System.out.println();

        Motor motor3 = new Motor();
        motor3.get(); // Solicitando a entrada de dados do usuário
        motor3.print(); // Imprimindo os dados inseridos pelo usuário
    }
    
}
