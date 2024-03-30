package VIP;

public class MainIngresso {
	public static void main(String[] args) {
		Ingresso ing1 = new Ingresso(30);
		VIP ing2 = new VIP(30, 100);
		Normal ing3 = new Normal(30);
		CamaroteInferior ing4 = new CamaroteInferior(30, 100, "A 11");
		CamaroteSuperior ing5 = new CamaroteSuperior(30, 110);
		
	}
}
