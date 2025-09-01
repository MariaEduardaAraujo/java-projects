package a2908.Arrays;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        String[] nomeEstudantes = new String[5];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < nomeEstudantes.length; i++){
            System.out.print("Digite os nomes dos estudantes: ");
            String nome = sc.next();
            nomeEstudantes[i] = nome;
        }

        System.out.println("\n==== Nomes =====");
        for (String nome : nomeEstudantes) {
            System.out.println(nome);
        }
        
        sc.close();
    }
}
