/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prova;

/*
 Leia um conjunto de salários, sendo que para terminar a entrada será fornecido o valor -1. Após toda a
entrada ter sido realizada, leia o valor de um reajuste. Em seguida exiba todos os salários já reajustados.
 */
import java.util.*;
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> sala = new ArrayList<>();
        List<Double> rea = new ArrayList<>();
        double s = 0;
        int j = 0;
        do{
            
                System.out.println("Digite o valor do salario");
                s = sc.nextDouble();
                sala.add(s);
                j++;
            
        }while(s !=-1);
        
        sala.remove((sala.size()-1));
        
        System.out.println("Digite o valor do reajuste: ");
        double valor = sc.nextDouble();
        
        for(int i=0; i<sala.size(); i++){
            rea.add(sala.get(i)+valor);
        }
        for(double x: rea){
            System.out.println("Salario com reajuste: " + x);
        }
        
        
    }
    
}
