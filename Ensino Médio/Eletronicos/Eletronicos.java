package Eletronicos;
public class Eletronicos {
	protected boolean componentes;
	protected String nome;
	
	public Eletronicos(boolean componentes, String nome) {
		this.componentes = componentes;
		this.nome = nome;
	}
	
	public void componentes(boolean resp) {
		System.out.println("Esse eletrônico tem componentes? " + resp);
	}
	
}
