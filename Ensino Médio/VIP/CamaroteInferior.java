package VIP;
public class CamaroteInferior extends VIP{
	private String localizacao;
	
	public CamaroteInferior(double ingresso, int acressimoVIP, String localizacao) {
		super(ingresso, acressimoVIP);
		this.localizacao = localizacao;
	}
	
	public double imprimeValor() {
		return super.imprimeValor();
	}
	
	public String localizacao () {
		return localizacao;
	}
}
