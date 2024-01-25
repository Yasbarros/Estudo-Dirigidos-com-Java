/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q3;

/**
 *
 * @author User
 */
abstract class Figura {
     public abstract double calcularArea();

    
    public void mostrarArea() {
        System.out.println("Área da figura: " + calcularArea());
    }
}
