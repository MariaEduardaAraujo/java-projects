package Exercícios;
import java.util.Scanner;

/*Faça um programa que tenha como entrada uma String e imprima na tela as letras que estão contidas nela.
Entrada: Aprendendo Java
Saída: a, p, r, e, n, d, e, n, d, o, j, a, v, a,
Observação: os espaços em brancos não devem ser imprimidos.*/

// Exercício 1 - Teste 6
public class Teste6{
	@SuppressWarnings("resource")
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
