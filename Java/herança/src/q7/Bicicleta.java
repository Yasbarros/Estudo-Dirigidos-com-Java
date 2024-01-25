/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q7;

/**
 *
 * @author User
 */
public class Bicicleta extends Veiculo{
    Override
    public float acelerar(float velocidade) {
        System.out.println("Bicicleta acelerando a " + velocidade + " km/h");
        return velocidade;
    }

    @Override
    public void parar() {
        System.out.println("Bicicleta parando");
    }
}
