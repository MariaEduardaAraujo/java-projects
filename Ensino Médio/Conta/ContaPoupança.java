package Conta;

public class ContaPoupança extends ContaBancária implements Imprimivel{
	private double rendimento;

	@Override
	public double sacar(double sacar) {
		System.out.println("Saque realizado! Valor: " + sacar);
		return sacar;
	}

	@Override
	public void imprimirDados() {
		System.out.println("Número da conta: " + numConta + "," + "Saldo: " + saldo + "," + 
	"Rendimento: " + rendimento);
	}
	
	public ContaPoupança(double numConta, double saldo, double rendimento) {
		super(numConta, saldo);
		this.rendimento = rendimento;
	}
	
}
