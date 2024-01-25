/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;

import java.util.Scanner;


public class Zoo {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Escolha um animal para criar:");
        System.out.println("1. Leão");
        System.out.println("2. Cachorro");
        System.out.println("3. Gato");
        System.out.println("4. Tigre");
        System.out.println("5. Hipopótamo");

        int escolha = scanner.nextInt();

        
        Animal animal;
        switch (escolha) {
            case 1:
                animal = new Leão();
                break;
            case 2:
                animal = new Cachorro();
                break;
            case 3:
                animal = new Gato();
                break;
            case 4:
                animal = new Tigre();
                break;
            case 5:
                animal = new Hipopotamo();
                break;
            default:
                System.out.println("Escolha inválida");
                return;
        }

        
        animal.andar();
        animal.comer();
        animal.comunicar();

        scanner.close();
    }
    
}
