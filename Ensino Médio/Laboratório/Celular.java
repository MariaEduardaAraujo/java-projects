package Laboratório;
/**
 * Arquivo: Celular
 * Descrição: Programa para praticar o uso de classes e objetos
 * PROO - Laboratório 3
 */

public class Celular {
	boolean ligado, ligacao;
	String modelo;
	
	void ligar() {
		if(ligado == true) {
			System.out.println("Tela ligada");
		}else {
			System.out.println("Tela desligada");
		}
	}
	void chamada() {
		if(ligacao == true) {
			System.out.println("Chamada iniciada...");
		}else {
			System.out.println("Modo ocioso");
		}
	}
	public static void main(String[] args) {
		Celular celular1 = new Celular();
		celular1.modelo = "Samsung Galaxy S10";
		celular1.ligado = true;
		celular1.ligacao = false;
		
		celular1.ligar();
		celular1.chamada();
	}
}
