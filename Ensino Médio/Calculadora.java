public class Calculadora {

	void soma(int num1, int num2) {
		double soma = num1 + num2;
		System.out.println("Soma: " + soma);
	}
	void subtracao(int num1, int num2) {
		double subtracao = num1 - num2;
		System.out.println("Subtraçãoo: " + subtracao);
	}
	void multiplicacao(int num1, int num2) {
		double multiplicacao = num1 * num2;
		System.out.println("Multiplicação: " + multiplicacao);
	}
	void divisao(double num1, double num2) {
		double divisao = num1 / num2;
		System.out.println("Divisão: " + divisao);
	}
	void media(double num1, double num2) {
		double media = (num1 + num2)/2;
		System.out.println("Média: " + media);
	}
	void mediaponderada(double nota1, double nota2, double p1, double p2) {
		if (p1 + p2 == 1 || p1 * p2 == 1) {
			double mediaponderada = ((nota1*1) + (nota2*1))/(2);
			System.out.println("Soma dos pesos: true");
			System.out.println("Média Ponderada: " + mediaponderada);
		}
		else {
			double mediaponderada = ((nota1*p1) + (nota2*p2))/(p1+p2);
			System.out.println("Soma dos pesos: false");
			System.out.println("Média Ponderada: " + mediaponderada);
		}
	}	
	
	public static void main(String[] args) {
		Calculadora operacao = new Calculadora();
		
		operacao.soma(1, 12);
		operacao.subtracao(8, 4);
		operacao.multiplicacao(5, 7);
		operacao.divisao(16, 8);
		operacao.media(10, 2);
		operacao.mediaponderada(10, 5, 1, 1);

	}
}
