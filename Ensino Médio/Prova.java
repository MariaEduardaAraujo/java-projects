public class Prova {
	@SuppressWarnings("unused")
	private String disciplina, tipo;
	@SuppressWarnings("unused")
	private int qtdQuest, nota, valorTotal;
	
	public Prova(int qtdQuest, int nota, String disciplina) {
		this.qtdQuest = qtdQuest;
		this.nota = nota;
		this.disciplina = disciplina;
	}
	public void setQtdQuest(int qtd) {
		qtdQuest = qtd;
		System.out.println(qtdQuest);
	}
	public int getQtdQuest() {
		return qtdQuest;
	}
	public void setNota(int n) {
		if(n >= 6) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
		nota = n;
	}
	public int getNota() {
		return nota;
	}
	
	public static void main(String[] args) {
		Prova prova1 = new Prova(12, 10, "Química");
		Prova prova2 = new Prova(10, 8, "Física");
		
		prova1.setQtdQuest(12);
		prova2.setNota(8);
	}
}
