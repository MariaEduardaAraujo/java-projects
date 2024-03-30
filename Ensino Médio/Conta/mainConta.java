package Conta;
public class mainConta {
	public static void main(String[] args) {
		ContaCorrente c1 = new ContaCorrente(1, 100.000, 0.131);
		ContaPoupança c2 = new ContaPoupança(2, 200000000, 0.13);
		
		c1.imprimirDados();
		c2.sacar(100);
	}
}
