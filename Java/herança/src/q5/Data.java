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
public class Data {
    private int mes;
    private int dia;
    private int ano;

    // Construtor que inicializa as variáveis
    public Data(int mes, int dia, int ano) {
        setMes(mes);
        setDia(dia);
        setAno(ano);
    }

    // Métodos get e set para o mês
    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        } else {
            System.out.println("Mês inválido. Deve estar entre 1 e 12.");
        }
    }

    // Métodos get e set para o dia
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (dia >= 1 && dia <= 31) {
            this.dia = dia;
        } else {
            System.out.println("Dia inválido. Deve estar entre 1 e 31.");
        }
    }

    // Métodos get e set para o ano
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano > 0) {
            this.ano = ano;
        } else {
            System.out.println("Ano inválido. Deve ser maior que zero.");
        }
    }

    // Método para exibir a data no formato dia/mês/ano
    public void displayData() {
        System.out.printf("%02d/%02d/%04d%n", dia, mes, ano);
    }
}
