package entities;

public abstract class PessoaIMC extends Pessoa{
	protected double altura;
	protected double peso;

	public PessoaIMC(String nome, String dataNascimento, double altura, double peso) {
		super(nome, dataNascimento);
		this.altura = altura;
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public double getPeso() {
		return peso;
	}

	public double calculaIMC() {
		return peso * (altura*altura);
		
	}
	
	public String resultIMC() {
		return null;
	}	
	
	public String toString() {
		return super.toString() 
				+ "\nPeso: " + peso
				+ "\nAltura: " + altura;
	}
	
	
}
