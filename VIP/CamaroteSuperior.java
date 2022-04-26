package VIP;
public class CamaroteSuperior extends VIP {
	
	public CamaroteSuperior(double ingresso, int acressimoVIP) {
		super(ingresso, acressimoVIP);
	}
	@Override
	public double imprimeValor() {
		return super.imprimeValor() + (0.01 * acressimoVIP);
	}
}
