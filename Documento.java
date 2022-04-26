public class Documento {
	private boolean escrito, amassado, importante, arquivado;
	private String data;
	
	public Documento(boolean escrito, boolean amassado, boolean arquivado) {
		this.escrito = escrito;
		this.amassado = amassado;
		this.arquivado = arquivado;
	}
	public void setPreenchido(boolean e) {
		if(e == true) {
			System.out.println("O Documento está escrito.");
		}else {
			System.out.println("O Documento está em branco.");
		}
		escrito = e;
	}
	public boolean getPreenchido() {
		return escrito;
	}
	public void setAmassou(boolean a) {
		if(a == true) {
			System.out.println("O Documento está amassado.");
		}else {
			System.out.println("O Documento está intacto.");
		}
		amassado = a;
	}
	public boolean getAmassou() {
		return amassado;
	}
	
	public static void main(String[] args) {
		Documento documento1 = new Documento(true, true, true);
		Documento documento2 = new Documento(false, false, true);
		
		documento1.setPreenchido(true);
		documento2.setAmassou(false);
	}
}
