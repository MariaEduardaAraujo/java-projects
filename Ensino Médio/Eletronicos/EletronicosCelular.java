package Eletronicos;
public class EletronicosCelular extends Eletronicos {
	private double preco;
	@SuppressWarnings("unused")
	private String geracao;
	
	public EletronicosCelular(boolean componentes, String nome, double preco, String geracao) {
		super(componentes, nome);
		this.geracao = geracao;
		this.preco = preco;
	}
	
	public void componentes(boolean resp) {
		System.out.println("Esse eletrônico tem componentes? " + resp);
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
		System.out.println("Preço: " + preco);
	}
	public static void main(String[] args) {
		EletronicosCelular c1 = new EletronicosCelular(true, "Celular", 3.000, "Z Force");
		
		c1.setPreco(3.000);
	}
}
