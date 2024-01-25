/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q5;

/**
 *
 * @author User
 */
public class DataTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Data data = new Data(12, 31, 2022);

        // Exibindo a data usando o método displayData
        System.out.print("Data inicial: ");
        data.displayData();

        // Alterando a data usando os métodos set
        data.setMes(1);
        data.setDia(1);
        data.setAno(2023);

        // Exibindo a data após as alterações
        System.out.print("Data após as alterações: ");
        data.displayData();
    }
    
}
