package Produto;

public class Produto {
	public String nome;
	public int codigo;
	private double precoCusto;
	private double precoVenda;
	protected String categoria;
	
	public void setPrecoCusto (double custo) {
		if(custo > 0) {
			precoCusto = custo;
		}
		else {
			System.out.println("Inválido, valor menor que 0!");
		}
	}
	public double getPrecoCusto() {
		return precoCusto;
	}
	public void setPrecoVenda (double venda) {
		if(venda > precoCusto) {
			precoVenda = venda;
		}
		else {
			System.out.println("Inválido, valor de venda menor que o valor de custo!");
		}
	}
	public double getPrecoVenda() {
		return precoVenda;
	}
	
}
