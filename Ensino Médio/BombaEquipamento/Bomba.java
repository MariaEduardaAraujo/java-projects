package BombaEquipamento; 
public class Bomba extends Equipamento {
	@SuppressWarnings("unused")
	private double pressaoSuccao;
	@SuppressWarnings("unused")
	private double pressaoDescarga;
	@SuppressWarnings("unused")
	private int taxaFluxo;
	
	public Bomba (String nome, String fabricante, double custo, double pressaoSuccao, double pressaoDescarga, int taxaFluxo){
		super(nome, fabricante, custo);
		this.pressaoSuccao = pressaoSuccao;
		this.pressaoDescarga = pressaoDescarga;
		this.taxaFluxo = taxaFluxo;
	}
	public static void main(String[] args) {
		Bomba bomba = new Bomba("Equipamento", "Fabricante A", 250, 500, 500, 500);
		bomba.ligar();
	}
}
