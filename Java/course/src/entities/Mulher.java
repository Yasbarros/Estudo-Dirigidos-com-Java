package entities;

public class Mulher extends PessoaIMC {

	public Mulher(String nome, String dataNascimento, double altura, double peso) {
		super(nome, dataNascimento, altura, peso);
	}

	public String resultImc() {
		double imc = calculaIMC();
        if (imc < 19.0) {
            return "Abaixo do peso ideal";
        } else if (imc < 25.8) {
            return "Peso ideal";
        } else {
            return "Acima do peso ideal";
        }
	}

	public String toString() {
		return super.toString()
				+"\nIMC: " + resultIMC();
	}
}
