public class Cidade {
	
	private boolean capital;
	private double pib;
	private String nome;
	private int idade, qhabitantes;
	
	public Cidade (boolean capital, double pib, int qhabitantes) {
		this.capital = capital;
		this.pib = pib;
		this.qhabitantes = qhabitantes;
	}
	public void setCidade(boolean c) {
		if(c == true) {
			System.out.println("A Cidade é uma capital.");
		}else {
			System.out.println("A Cidade é um município ou metrópole.");
		}
		capital = c;
	}
	public boolean getCidade() {
		return capital;
	}
	public void setHabitavel(int qtd) {
		if(qtd > 0) {
			System.out.println("A Cidade tem habitantes.");
		}else {
			System.out.println("A cidade não tem habitantes.");
		}
		qhabitantes = qtd;
	}
	public int getHabitavel() {
		return qhabitantes;
	}
	
	public static void main(String[] args) {
		Cidade cidade1 = new Cidade(true, 100.000, 13900);
		
		cidade1.setCidade(true);
		cidade1.setHabitavel(13900);
		
		Cidade cidade2 = new Cidade(false, 80.000, 150000);
		
		cidade2.setCidade(false);
		cidade2.setHabitavel(0);
	}
}