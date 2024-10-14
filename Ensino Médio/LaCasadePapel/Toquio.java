/**
* Arquivo: Alicia
* Descrição: Programa para praticar o uso de herança, polimorfismo e encapsulamento
* PROO - Laboratório 5
**/

package LaCasadePapel; 
public class Toquio extends Professor{

	@SuppressWarnings("unused")
	private char sexo;
	@SuppressWarnings("unused")
	private boolean temArma;
	@SuppressWarnings("unused")
	private String apelido;
	
	public void rouba() {
		System.out.println("Roubado com sucesso.");
	}
	public boolean segueOPlano() {
		return false;
	}
	public void ameacaRefem() {
		System.out.println("Ameaças.");
	}
	public void tentaEscapar() {
		System.out.println("Não consegue.");
	}
	public Toquio(String apelido, char sexo, boolean persuasao, boolean temArma) {
		super(apelido, sexo, persuasao);
		this.temArma = temArma;
	}
}
