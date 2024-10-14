/**
* Arquivo: Alicia
* Descrição: Programa para praticar o uso de herança, polimorfismo e encapsulamento
* PROO - Laboratório 5
**/

package LaCasadePapel; 
public class Professor {
	@SuppressWarnings("unused")
	private String apelido;
	@SuppressWarnings("unused")
	private char sexo;
	@SuppressWarnings("unused")
	private boolean persuasao;
	
	public void planejaRoubo() {
		System.out.println("Roubo Planejado.");
	}
	public void selecionaAssaltante(String apelido) {
		System.out.println("Assaltante: " + apelido);
	}
	public void negociaComPolicia() {
		System.out.println("Em negociação.");
	}
	public void tentaEscapar() {
		System.out.println("Escapando com sucesso.");
	}
	public Professor(String apelido, char sexo, boolean persuasao) {
		this.apelido = apelido;
		this.persuasao = persuasao;
		this.sexo = sexo;
	}
}
