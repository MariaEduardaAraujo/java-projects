public class Casa {
	private boolean limpa; 
	@SuppressWarnings("unused")
	private String cor;
	@SuppressWarnings("unused")
	private double tamanho;
	@SuppressWarnings("unused")
	private int numero, moradores;
	
	public Casa (boolean limpa, String cor, double tamanho, int numero, int moradores) {
		this.limpa= limpa;
		this.cor = cor;
		this.moradores = moradores;
		this.numero = numero;
		this.tamanho = tamanho;
	}
	public void setLimpeza(boolean l) {
		if(l == true) {
			System.out.println("Casa limpa");
		}else {
			System.out.println("Casa suja");
		}
		limpa = l;
	} 
	public boolean getLimpeza() {
		return limpa;
	}
	public void setNumMoradores(int qtd) {
		if(qtd > 0) {
			System.out.println("Casa habitada");
		}else {
			System.out.println("Sem moradores no momento");
		}
		moradores = qtd;
	}
	public int getNumMoradores() {
		return moradores;
	}
	public static void main(String[] args) {
		Casa casa1 = new Casa (true, "Vermelha", 30.5, 10, 2);
		Casa casa2 = new Casa(true, "Azul", 50.5, 888, 2);
		
		System.out.println(casa1.getLimpeza());
		System.out.println(casa2.getNumMoradores());

	}
}
