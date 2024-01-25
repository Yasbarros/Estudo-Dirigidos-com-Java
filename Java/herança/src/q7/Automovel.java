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
 class Automovel extends Veiculo {
    @Override
    public float acelerar(float velocidade) {
        System.out.println("Automóvel acelerando a " + velocidade + " km/h");
        return velocidade;
    }

    @Override
    public void parar() {
        System.out.println("Automóvel parando");
    }

    // Método específico de Automóvel
    public void mudarOleo(float litros) {
        System.out.println("Troca de óleo concluída. Litros utilizados: " + litros);
    }
}
