package Produto;
public class MainProduto {
	public static void main(String[] args) {
		Produto produto1 = new Produto();
		Produto produto2 = new Produto();
		
		produto1.nome = "Celular";
		produto1.codigo = 0000;
		produto1.setPrecoCusto(500);
		produto1.setPrecoVenda(5000);
		System.out.println(produto1.getPrecoCusto());
		System.out.println(produto1.getPrecoVenda());
		produto1.categoria = "Eletrônico";
		
		produto2.nome = "Celular";
		produto2.codigo = 0001;
		produto2.setPrecoCusto(600);
		produto2.setPrecoVenda(2000);
		System.out.println(produto2.getPrecoCusto());
		System.out.println(produto2.getPrecoVenda());
		produto2.categoria = "Eletrônico";
	}
}
