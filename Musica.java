public class Musica {
	private String ritmo, genero;
	private char tom;
	private boolean acustica, instrumentos;
	
	public Musica (String ritmo, String genero, char tom) {
		this.ritmo = ritmo;
		this.genero = genero;
		this.tom = tom;
	}
	public void setEstilo(boolean a){
		if(a == true) {
			System.out.println("É uma música acústica");
		}else {
			System.out.println("Não é uma música acústica");
		}
		acustica = a;
	}
	public boolean getEstilo() {
		return acustica;
	}
	public void setInstumento(boolean i) {
		if (instrumentos == true) {
			System.out.println("Usa instrumentos");
		}else {
			System.out.println("Não usa instrumentos");
		}
		instrumentos = i;
	}
	public boolean getInstrumentos() {
		return instrumentos;
	}
	public static void main(String[] args) {
		Musica musica1 = new Musica("Regular", "Pop Rock", 'G');
		Musica musica2 = new Musica("Rugular", "Choro", 'C');
		
		musica1.setEstilo(true);
		musica2.setInstumento(true);
	}
}
