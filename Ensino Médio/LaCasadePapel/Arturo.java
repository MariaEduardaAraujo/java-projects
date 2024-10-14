/**
* Arquivo: Alicia
* Descrição: Programa para praticar o uso de herança, polimorfismo e encapsulamento
* PROO - Laboratório 5
**/

package LaCasadePapel; 
public class Arturo extends Alicia {
	@SuppressWarnings("unused")
	private String nome;
	@SuppressWarnings("unused")
	private char sexo;
	@SuppressWarnings("unused")
	private double valorDeResgate;
	
	public boolean roubaArma() {
		return true;
	}
	public void confrontaAssaltante(String assaltante) {
		System.out.println("Confrontou o assaltante.");
	}
	public Arturo(String nome, char sexo, boolean temArma, String numeroDistintivo, double valorDeResgate) {
		super(nome, sexo, temArma, numeroDistintivo);
		this.valorDeResgate = valorDeResgate;
	}
}
