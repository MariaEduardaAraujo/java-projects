package aula2908.Arrays;

import java.util.Scanner;
import java.util.Arrays;

/*Exercício - Criar um programa que solicita 5 notas (double)
 * Após, criar um loop para percorrer o array de notas e calcular a média.
 */

public class ArrayExercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double notas[] = new double[5];
        double media = 0;

        System.out.println("\nDigite 5 notas: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nota " + (i+1) + ": ");
            double nota = sc.nextDouble();
            notas[i] = nota;
            
            //notas[i] = sc.nextDouble();
        }

        System.out.println("\n ==== Notas Ordenadas ====");
        Arrays.sort(notas);
        for (double d : notas) {
            System.out.println(d);
        }

        for (double d : notas) {
            media += d;
        }
        
        //Resolução sem For Each
        /*for (int i = 0; i < notas.length; i++) {
            media += notas[i];
        }*/

        System.out.println("\n ==== Média =====");
        System.out.println("A média é: " + media/notas.length);
        sc.close();
    }
}

