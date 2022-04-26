public class Caneta {
	String modelo, cor;
	double ponta, carga;
	boolean tampada;
	
	void escrever() {
		if(tampada == true) {
			System.out.println("Erro");
		}else {
			System.out.println("Riscando");
		}
	}
	
	void desenhar() {
		if(tampada == true) {
			System.out.println("Não desenha");
		}else {
			System.out.println("Desenha");
		}
	}
	void carga() {
		System.out.println(carga);
	}
	public static void main(String[] args) {
		Caneta caneta1 = new Caneta();
		
		caneta1.modelo = "Bic Cristal";
		caneta1.cor = "Azul";
		caneta1.ponta = 1.0;
		caneta1.carga = 30;
		caneta1.tampada = false;
		
		caneta1.escrever();
		caneta1.desenhar();
		caneta1.carga();
		Caneta caneta2 = new Caneta();
		
		caneta2.modelo = "Compactor";
		caneta2.cor = "Vermelha";
		caneta2.ponta = 1.2;
		caneta2.carga = 70;
		caneta2.tampada = true;
		
		caneta2.escrever();
		caneta2.desenhar();
		
		Caneta caneta3 = new Caneta();
		caneta3.modelo = "Bic Cristal";
		caneta3.cor = "Preta";
		caneta3.ponta = 1.0;
		caneta3.carga = 90;
		caneta3.tampada = false;
		
		caneta3.escrever();
		caneta3.desenhar();
	}
}
