package Exercícios;
/*
// Exercício 1 - Teste 5
public class Teste5 {
	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++) {
			System.out.println("Valores: " + i);
		}
	}
}

// Exercício 2 - Teste 5
public class Teste5 {
	public static void main(String[] args) {
		for(int i = 100; i >= 1; i--) {
			System.out.println("Valores: " + i);
		}
	}
}

// Exercício 3 - Teste 5
public class Teste5 {
	public static void main(String[] args) {
		for(int i = 0; i <= 500; i = i+2) {
			System.out.println("Valores: " + i);
		}
	}
}


// Exercício 4 - Teste 5
import java.util.Scanner;
public class Teste5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome;
		double preco;
						
		System.out.print("Nome do produto: ");
		nome = sc.nextLine();
		System.out.print("Preço do porduto: ");
		preco = sc.nextDouble();
		double precoReajustado = (preco*0.20) + preco;
						
		while(preco>0){
			if(precoReajustado>0) {
				System.out.println("Preço com reajuste: " + precoReajustado);
			}
			sc.nextLine();
			System.out.print("Nome de outro produto: ");
			nome = sc.nextLine();
			System.out.print("Preço de outro porduto: ");
			preco = sc.nextDouble();
			precoReajustado = (preco*0.20) + preco;
								
		}
						
	}
}
					

// Exercício 5 - Teste 5
import java.util.Scanner;
public class Teste5{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int nBoletos, salario = 2500;
		double valores, valorTotal, sobra;
				    	
		System.out.print("Número de boletos: ");
		nBoletos = sc.nextInt();
		System.out.print("Valor total da soma dos boletos: ");
		valores = sc.nextDouble();
		valorTotal = valores;
				        
		while(valores>=0) {
			sobra = salario - valorTotal;
			if(sobra>0) {
				System.out.println("Valor total pago: " + valorTotal);
				System.out.println("Sobrou: " + sobra);
				System.out.println("Você conseguiu pagar todas as suas contas.");
				                
			}else if (sobra<0){
				System.out.println("Você ficou no vermelho.");
			}
				System.out.print("Número de boletos: ");
				nBoletos = sc.nextInt();
				System.out.print("Valor total da soma dos boletos: ");
				valores = sc.nextDouble();
				valorTotal = valores;
			}
	}
}

// Exercício 6 - Teste 5
import java.util.Scanner;
public class Teste5{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String frase;
		System.out.println("Informe a frase desejada, senhor(a): ");
		frase = sc.nextLine();
		frase = frase.toLowerCase();
		
		for (int i = 0; i <= frase.length(); i++) {
			System.out.print(frase.charAt(i) + ", ");
		}
	} 
}

// Exercício 7 - Teste 5
import java.util.Scanner;
public class Teste5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, b;
		
		System.out.print("Valor do expoente: ");
		n = sc.nextInt();
		System.out.print("Valor da base: ");
		b = sc.nextInt();
		
		if(n>0 && b>=1) {
				System.out.println("Valor: " + Math.pow(b, n));
		}	
	}
}

// Exercício 8 - Teste 5
import java.util.Scanner;
public class Teste 5{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qtdPort, qtdMat, redacao;
		double porcentPort = 50*0.70 , porcentMat = 35*0.70;
		
		System.out.print("Quantidade de questões para Português: ");
		qtdPort = sc.nextInt();
		System.out.print("Quantidade de questões para Matemática: ");
		qtdMat = sc.nextInt();
		System.out.print("Média na redação: ");
		redacao = sc.nextInt();
		
		if(qtdPort >= 35 && qtdMat >= 25 && redacao >= 7) {
			System.out.println("Aprovado.");
		}else {
			System.out.println("Reprovado");
		}
	}
}
*/