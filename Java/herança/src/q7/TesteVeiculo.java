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
public class TesteVeiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Veiculo bicicleta = new Bicicleta();
        bicicleta.acelerar(15.0f);
        bicicleta.parar();

        
        Veiculo automovel = new Automovel();
        automovel.acelerar(60.0f);
        automovel.parar();

        
        ((Automovel) automovel).mudarOleo(4.0f);
    
    }
    
}
