package aplicattions;

import entities.Homem;
import entities.Mulher;
import entities.PessoaIMC;
import entities.Pessoa;

import java.util.Vector;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Vector<PessoaIMC> pessoas = new Vector<>();
		
		System.out.println("Digite o número de pessoas:");
        int numPessoas = sc.nextInt();
        sc.nextLine();
        
        for(int i = 0; i < numPessoas; i++) {
        	System.out.print("\nDigite o nome da pessoa: ");
            String nome = sc.nextLine();
            
            System.out.print("Digite a data de nascimento da pessoa: ");
            String dataNascimento = sc.nextLine();
            
            System.out.print("Digite o peso da pessoa: ");
            double peso = sc.nextDouble();
            
            System.out.print("Digite a altura da pessoa: ");
            double altura = sc.nextDouble();
            sc.nextLine();
            
            System.out.print("Digite o gênero da pessoa (Homem ou Mulher): ");
            String genero = sc.nextLine();
           
            if (genero.equalsIgnoreCase("Homem")) {
                pessoas.add(new Homem(nome, dataNascimento, peso, altura));
            } else if (genero.equalsIgnoreCase("Mulher")) {
                pessoas.add(new Mulher(nome, dataNascimento, peso, altura));
            } else {
                System.out.println("Gênero inválido. Tente novamente.");
                i--;
            }
            
        }
        
		for (PessoaIMC pessoa : pessoas) {
            System.out.println(pessoa);
        }
			
	sc.close();
	
	}
}
