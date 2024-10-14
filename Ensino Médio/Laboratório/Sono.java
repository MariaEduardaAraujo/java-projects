package Laboratório;
/**
 * Arquivo: Celular
 * Descrição: Programa para praticar o uso de classes e objetos
 * PROO - Laboratório 3
 */

public class Sono {
	boolean provas, cafe, materiaAcumulada;
	
	void materias() {
		if(materiaAcumulada == true) {
			System.out.println("Estudar");
		}else {
			System.out.println("Dormir");
		}
	}
	public static void main(String[] args) {
		Sono soninho = new Sono();
		
		soninho.materiaAcumulada = true;
		soninho.provas = true;
		soninho.cafe = false;
		
		soninho.materias();
	}
}
