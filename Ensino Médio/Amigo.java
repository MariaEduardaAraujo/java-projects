public class Amigo {
	private boolean verdadeiro, gostar;
	private int idade;
	private String classe, perto; 
	
	public Amigo (boolean verdadeiro, int idade, String perto) {
		this.verdadeiro = verdadeiro;
		this.idade = idade;
		this.perto = perto;
	}
	public void setVerdade(boolean verdade) {
		if(verdade == true) {
			System.out.println("Esse amigo é verdadeiro.");
			verdadeiro = verdade;
		}else {
			System.out.println("Esse amigo é falso.");
		}
		verdadeiro = verdade;
	}
	public boolean getVerdade() {
		return verdadeiro;
	}
	public void setGosta(boolean gosta) {
		if(gosta == true) {
			System.out.println("Eu gosto desse amigo.");
			
		}else {
			System.out.println("Não gosto desse 'amigo'");
		}
		gosta = gostar;
	}
	public boolean getGosta() {
		return gostar;
	}
	public static void main(String[] args) {
		Amigo amigo1 = new Amigo(true, 16, "Sim");

		amigo1.setVerdade(true);
		amigo1.setGosta(true);
		
		Amigo amigo2 = new Amigo(false, 17, "Sim");
		
		amigo2.setVerdade(false);
		amigo2.setGosta(true);
	}

}
