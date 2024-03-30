package BombaEquipamento;

public class Motor extends Equipamento {
	private double velocidade;
	private int potencia;
	
	public Motor (String nome, String fabricante, double custo, double velocidade, int potencia) {
		super(nome, fabricante, custo);
		this.velocidade = velocidade;
		this.potencia = potencia;
	}
}

