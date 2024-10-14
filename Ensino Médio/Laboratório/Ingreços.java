package Laboratório;
import java.util.Scanner;

/**
 * Arquivo: Lab2.java 
 * Descricao: Programa para praticar estruturas de seleção 
 * PROO - Laboratório 2
 **/

public class Ingreços{
	public static void main(String[] args) {
		int idade, qtdIngresso, qtdMeia;
		double total = 0;
		String diaSemana;

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite sua idade: ");
		idade = sc.nextInt();
		System.out.print("Quantidade de ingressos inteiros: ");
		qtdIngresso = sc.nextInt();
		System.out.print("Quantidade de meias-entradas: ");
		qtdMeia = sc.nextInt();
		System.out.print("Dia da semana: ");
		diaSemana = sc.next();

		if ((idade <= 10 || idade > 65) && diaSemana.equals("segunda")) {
			System.out.println("Valor do ingresso: R$ 5,00");
		}
		else if (idade > 10 && idade < 65 && diaSemana.equals("segunda")) {
			System.out.println("Valor do ingressso: R$ 10,00");
		}
		if ((idade > 10 || idade < 65) && diaSemana.equals("terca")) {
			System.out.println("Valor do ingresso: R$ 12,00");
		}
		if ((idade <= 10 || idade >65) && diaSemana.equals("quarta")) {
			System.out.println("Valor do ingresso: R$ 7,50");
		}
		else if (idade > 10 && idade < 65) {
			System.out.println("Valor do ingresso: R$ 15,00");
		}
		if ((idade <= 10 || idade >65) && diaSemana.equals("quinta")) {
			System.out.println("Valor do ingresso: R$ 13,50");
		}
		else if((idade > 10 && idade < 65) && diaSemana.equals("quinta")){
			System.out.println("Valor do ingresso: R$ 27,00");
		}
		if ((idade <= 10 || idade >65) && diaSemana.equals("sexta")) {
			System.out.println("Valor do ingresso: R$ 15,00");
		}
		else if((idade > 10 && idade < 65) && diaSemana.equals("sexta")) {
			System.out.println("Valor do ingresso: R$ 30,00");
		}
		if ((idade <= 10 || idade >65) && diaSemana.equals("sabado")) {
			System.out.println("Valor do ingresso: R$ 15,00");
		}
		else if((idade > 10 && idade < 65) && diaSemana.equals("sabado")) {
			System.out.println("Valor do ingresso: R$ 30,00");
		}
		if ((idade <= 10 || idade >65) && diaSemana.equals("domingo")) {
			System.out.println("Valor do ingresso: R$ 15,00");
		}
		else if((idade > 10 && idade < 65) && diaSemana.equals("domingo")) {
			System.out.println("Valor do ingresso: R$ 30,00");
		}
		
//		double qtdIngresso, qtdMeia, porcentagem;
//		double total = 0;
//		String diaSemana;
//
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Quantidade de ingressos inteiros: ");
//		qtdIngresso = sc.nextInt();
//		System.out.print("Quantidade de meias-entradas: ");
//		qtdMeia = sc.nextInt();
//		System.out.print("Dia da semana: ");
//		diaSemana = sc.next();
//
//		//Bloco I
//		if (diaSemana.equals("segunda") && qtdIngresso >0) {
//			total += 10*qtdIngresso;
//		}
//		if (diaSemana.equals("segunda") && qtdMeia > 0) {
//			total += 5*qtdMeia;	
//		}
//		if (diaSemana.equals("terca") && qtdIngresso >0) {
//			total += 12*qtdIngresso;
//		}
//		if (diaSemana.equals("terca") && qtdMeia >0) {
//			total += 12*qtdMeia;
//		}
//		if (diaSemana.equals("quarta") && qtdMeia > 0) {
//			total += 7.50*qtdMeia;
//		}
//		if (diaSemana.equals("quarta") && qtdIngresso >0) {
//			total += 15*qtdIngresso;
//		}
//		if (diaSemana.equals("quinta") && qtdMeia > 0) {
//			total += 13.50*qtdMeia;
//		}
//		if(diaSemana.equals("quinta") && qtdIngresso >0){
//			total += 27*qtdIngresso;
//		}
//		if (diaSemana.equals("sexta") && qtdMeia > 0) {
//			total += 15*qtdMeia;
//		}
//		if(diaSemana.equals("sexta") && qtdIngresso >0) {
//			total += 30*qtdIngresso;
//		}
//		if (diaSemana.equals("sabado") && qtdMeia > 0) {
//			total += 15*qtdMeia;
//		}
//		if(diaSemana.equals("sabado") && qtdIngresso >0) {
//			total += 30*qtdIngresso;
//		}
//		if (diaSemana.equals("domingo") && qtdMeia > 0) {
//			total += 15*qtdMeia;
//		}
//		if(diaSemana.equals("domingo") && qtdIngresso >0) {
//			total += 30*qtdIngresso;
//		}
//		
//		//Bloco II
//		if (total > 50 && total < 100) {
//			porcentagem = 0.1;
//			System.out.println("Valor total dos ingressos: " + (total - (total*porcentagem)));
//		}
//		else if(total > 100 && total < 200) {
//			porcentagem = 0.15;
//			System.out.println("Valor total dos ingressos: " + (total - (total*porcentagem)));
//		}
//		else if(total > 200) {
//			porcentagem = 0.2;
//			System.out.println("Valor total dos ingressos: " + (total - (total*porcentagem)));
//		}
	}
}

