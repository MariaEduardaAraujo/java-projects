package Laboratório;
/**
 * Arquivo: Pessoa
 * Descriçãoo: Programa para praticar o uso de métodos e diagrama de classe
 * PROO - Laboratório 4
 * 
 */
public class Pessoa{
	
	String nome;
	double peso;
	double altura;
	
	void falar(String mensagem) {
		
		System.out.println(mensagem);
	}
	void comer(String tipo, int horario) {
		
		System.out.println("Estou comendo o " + tipo + " �s " + horario);
	}
	double imc(double peso, double altura) {
		
		double imc = peso/(altura*altura);
		return imc;
	}
	void verific(double imc) {
		if (imc < 18.5) {
			
			System.out.println("Baixo.");
		}
		if (imc > 18.5 && imc < 24.9) {
			
			System.out.println("Normal.");
		}
		if (imc > 25 && imc < 29.9) {
			
			System.out.println("Acima.");
		} 
		if (imc >30) {
			
			System.out.println("Obeso.");
		}
	}
	
	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		
		System.out.println("IMC: " + pessoa1.imc(50, 1.65));
		pessoa1.verific(pessoa1.imc(50, 1.65));
		
		System.out.println("IMC: " + pessoa2.imc(65, 1.70));
		pessoa2.verific(pessoa2.imc(65, 1.70));
	}
}