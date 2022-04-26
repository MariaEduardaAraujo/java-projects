package VIP;
public class VIP extends Ingresso{
	public int acressimoVIP = 100;
	
	public VIP(double ingresso, int acressimoVIP) {
		super(ingresso);
		this.acressimoVIP = acressimoVIP;
	}
	@Override
	public double imprimeValor() {
		return super.imprimeValor() + acressimoVIP;
	}
}
