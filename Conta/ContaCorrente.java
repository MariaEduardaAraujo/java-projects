package Conta;

public class ContaCorrente extends ContaBancária implements Imprimivel{
	private double taxaDeOperação;

	@Override
	public double sacar(double sacar) {
		System.out.println("Saque realizado! Valor: " + sacar);
		return sacar;
	}

	@Override
	public void imprimirDados() {
		System.out.println("Número da conta: " + numConta + ", " + "Saldo: " + saldo + ", " + "Taxa de operação: " + taxaDeOperação);
	}
	
	public ContaCorrente(double numConta, double saldo, double taxaDeOperação) {
		super(numConta, saldo);
		this.taxaDeOperação = taxaDeOperação;
	}

}
