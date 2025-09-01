package aula2908.Arrays;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        //Array de inteiros
        int numeros[] = new int[3];

        numeros[0] = 99;
        numeros[1] = 10;
        numeros[2] = 1;

        //Formas de percorrer
        
        //System.out.println("\n" + numeros[0]);
        for (int i : numeros) {
            System.out.println(i);
        }

        //Outros tipos de Arrays
        //char val[] = new char[3];
        int qtdEstudantes[];
        //String nome[] = new String[10];

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de alunos: ");
        int qtd = sc.nextInt();

        qtdEstudantes = new int[qtd];
        System.out.println("Tamanho máximo: " + qtdEstudantes.length);
        
        sc.close();
    }

    public static void sort(double[] notas) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sort'");
    }
}
