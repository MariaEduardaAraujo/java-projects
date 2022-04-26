package Instrumentos;
public class InstrumentoCorda extends InstrumentoMusical {
	
	private String tipo;
	private String nome;
	
	public InstrumentoCorda(String som, String material, double preco, String tipo, String nome) {
		super(som, material, preco);
		this.tipo = tipo;
		this.nome = nome;
	}
	
	public void som(String som) {
		System.out.println(som);
	}
	public void tocar() {
		System.out.println(tipo);
		System.out.println(nome);
	}
	
	public String getTipo() {
		return tipo;
		
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
		System.out.println("Tipo: " + tipo);
	}
	
	public String getNome() {
		return nome;
		
	}
	
	public void setNome(String nome) {
		this.nome = nome;
		System.out.println("Nome do instrumento: " + nome);
	}
	
	public static void main(String[] args) {
		InstrumentoCorda instrumento = new InstrumentoCorda("MIIII", "Madeira", 500, " ", "Violão");
		InstrumentoCorda instrumento2 = new InstrumentoCorda("MIIII", "Madeira", 300, "Soprano", "Ukulele");
		
		instrumento.setNome("Violão");
		instrumento2.setNome("Ukulele");
		instrumento2.setTipo("Soprano");
	}
}