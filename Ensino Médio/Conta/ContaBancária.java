package Conta;
public abstract class ContaBancária {
	protected double numConta;
	protected double saldo;
	
	public abstract double sacar(double sacar);
	
	public double depositar (double valorDeposito, double numConta, double numAgencia) {
		System.out.println("Deposito realizado com sucesso!" + valorDeposito);
		return numConta;
	}
	
	public ContaBancária(double numConta, double saldo) {
		this.numConta = numConta;
		this.saldo = saldo;
	}
}
