package BombaEquipamento; 
public class Equipamento {
	protected String nome;
	protected String fabricante;
	protected double custo;
	
	public Equipamento(String nome, String fabricante, double custo) {
		this.nome = nome;
		this.fabricante = fabricante;
		this.custo = custo;
	}
	public void ligar() {
		System.out.println("Ligado");
	}
}
