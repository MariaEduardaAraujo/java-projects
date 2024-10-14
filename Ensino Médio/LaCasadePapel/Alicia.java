/**
* Arquivo: Alicia
* Descrição: Programa para praticar o uso de herança, polimorfismo e encapsulamento
* PROO - Laboratório 5
**/

package LaCasadePapel; 
public class Alicia {
	@SuppressWarnings("unused")
	private String nome;
	@SuppressWarnings("unused")
	private char sexo;
	@SuppressWarnings("unused")
	private boolean temArma;
	@SuppressWarnings("unused")
	private String numeroDistintivo;
	
	public void investiga(String suspeito) {
		System.out.println("Investigando o " + suspeito + ".");
	}
	public void prende(String suspeito) {
		System.out.println("Prendendo o " + suspeito + ".");
	}
	public void atira() {
		System.out.println("Atirando, piu piu.");
	}
	public Alicia(String nome, char sexo, boolean temArma, String numeroDistintivo) {
		this.nome = nome;
		this.sexo = sexo;
		this.temArma = temArma;
		this.numeroDistintivo = numeroDistintivo;
	}
}
