package Instrumentos;

public class InstrumentoMusical {
	protected String som;
	protected String material;
	protected double preco;
	
	public InstrumentoMusical(String som, String material, double preco) {
		this.som = som;
		this.material = material;
		this.preco = preco;
	}
	
	public void som(String som) {
		System.out.println(som);
		
	}
}
