package Exercícios;
import java.util.Scanner;

public class Teste2 {
	public static void main(String[] args) {
		String nome;
		int idade;
		double peso;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		nome = sc.nextLine();
		System.out.print("Digite sua idade: ");
		idade = sc.nextInt();
		System.out.print("Digite seu peso: ");
		peso = sc.nextDouble();
		System.out.println("Nome: "+ nome + ", Idade: " + idade + ", Peso: " + peso);
	}

}
