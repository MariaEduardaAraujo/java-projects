public class Curso {
	@SuppressWarnings("unused")
	private String tipo, local;
	private boolean ead;
	@SuppressWarnings("unused")
	private double duracao, valor;
	
	public Curso (String tipo, boolean ead, double duracao) {
		this.tipo = tipo;
		this.ead = ead;
		this.duracao = duracao;
	}
	public boolean getEnsino() {
		return ead;
	}
	public void setEnsino(boolean e){
		if(e == true) {
			System.out.println("Curso EAD");
		}else {
			System.out.println("Curso presencial ");
		}
		ead = e;
	}
	public static void main(String[] args) {
		Curso curso1 = new Curso("Superior", true, 12);
		Curso curso2 = new Curso("Superior", false, 60);
			
		curso1.setEnsino(false);
		curso2.setEnsino(true);
	}
}
