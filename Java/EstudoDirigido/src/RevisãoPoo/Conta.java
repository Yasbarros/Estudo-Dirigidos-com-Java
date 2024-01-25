/*
 Um banco mantém contas de clientes armazenando o número da conta, o nome do cliente e o saldo
atual da conta. Os clientes podem depositar o quanto quiserem nas contas, mas podem sacar somente
enquanto a conta possuir saldo positivo. Crie esses métodos de deposito e saque na classe conta e na classe
banco que será a principal instancie um objeto da classe conta e realize as possíveis operações.
 */
package RevisãoPoo;




public class Conta {
    public String conta;
    public String nome;
    public double saldo;
    
    public Conta(){
        
    }
    
    public Conta(String conta, String nome, double saldo){
        this.conta = conta;
        this.nome = nome;
        this.saldo = saldo;
    }
    
    public double saque(double num){
        saldo -= num;
        return saldo;
    }
    public double deposito(double valor){
        saldo+= valor;
        return saldo;
    }

    @Override
    public String toString() {
        return "Conta: " + conta+"\nTitular: "+nome+"\nSaldo: "+saldo;
    }
    
   
    
    
}

