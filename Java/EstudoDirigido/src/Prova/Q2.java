
package Prova;

/*Leia um conjunto de notas, cuja quantidade seja determinada pelo usuário. Calcule a média de todas elas.
Exiba o conjunto das notas maiores do que a média calculada. Em seguida, de forma agrupada, exiba o outro
conjunto de notas menores do que a média.*/
import java.util.*;
public class Q2 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite uma quantidade de notas: ");
        int quan = sc.nextInt();
        Double [] notas = new Double[quan];
        Double [] maior = new Double[quan];
        Double [] menor = new Double[quan];
        
        double sum = 0;
        
        for(int i=0; i< quan; i++){
            System.out.println("Nota " +i+":");
            double nota = sc.nextDouble();
            sum+= nota;
            notas[i] = nota;
        }
        
        double media = sum/quan;
        System.out.println("A media é: " + media);
        
        for(int i = 0; i<quan; i++){
            if(notas[i] > media){
                maior[i]= notas[i];
            }else{
                menor[i] = notas[i];
            }
        }
        
        System.out.println("Notas acima da media: ");
        for(int i = 0; i<quan; i++){
            if(maior[i] != null){
                System.out.println(i +": " + maior[i]);
            }
        } 
        
        
        System.out.println("Notas abaixo da media: ");
        for(int j = 0; j<quan; j++){
            if(menor[j] != null){
                System.out.println(j +": " + menor[j]);
            }
        }
        
        
        
        
    }
    
}
