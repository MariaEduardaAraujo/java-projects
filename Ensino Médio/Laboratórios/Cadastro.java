package Laboratório;
import java.util.Scanner;

/**
 * Arquivo: Lab1.java
 * Descricao: Programa para praticar os tipos de dados, entrada e sa�da
 * PROO - Laboratório 1
 * 
 */
public class Cadastro{
	public static void main(String[] args) {
		
		String nome, sobrenome, usuario, senha;
		int data;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o seu nome: ");
		nome = sc.nextLine();
		System.out.print("Informe o seu sobrenome: ");
		sobrenome = sc.nextLine();
		System.out.print("Informe a data de nascimento: ");
		data = sc.nextInt();
		
		System.out.println("Prezado (a) Sr. (a) " + nome.toUpperCase() + " " + sobrenome.toUpperCase() + ",");
		System.out.println("Após cadastrá-lo (a) no sistema, informamos que foi criado um usuário e senha para você.");
		
		usuario = sobrenome.substring(1) + nome.substring(0,2);
		System.out.println("Usuário: " + usuario.toLowerCase());
		senha = nome.substring(0,1) + sobrenome.substring(0,1);
		System.out.println("Senha: " + senha + nome.length() + data );
		
		
	}
}
