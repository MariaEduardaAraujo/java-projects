
public class Laboratorio {
	String nome;
	int mesas;
	int cadeiras;
	int computadores;
	
	Computador computador;
	
	void nome() {
		System.out.println("Nome do laboratório: " + nome);
	}
	void mesas(){
		System.out.println("Número de mesas: " + mesas);
	}
	void cadeiras() {
		System.out.println("Número de cadeiras: " + cadeiras);
	}
	public static void main(String[] args) {
		Laboratorio lab = new Laboratorio();
		lab.nome = "Lab 2";
		lab.mesas = 20;
		lab.cadeiras = 20;
		
		Computador computador = new Computador();
		computador.monitor = true;
		computador.gabinete = true;
		computador.preco = 2500;
		
		lab.computador = computador;
		
		lab.nome();
		lab.mesas();
		lab.cadeiras();
		computador.monitor();
		computador.ganinete();
		computador.preco();
	}
}