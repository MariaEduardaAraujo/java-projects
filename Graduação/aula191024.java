//import java.util.Scanner;
//import java.math.*;

//Lista 05

/*1) Leia 5 valores para uma variável A. A seguir mostre quantos valores digitados foram pares,
quantos valores digitados foram ímpares, quantos foram positivos e quantos foram negativos.

public class aula191024 {
    public static void main(String[] args) {
        int[] a = new int[5];
        int num, maior = 0, menor = 0, par = 0, impar = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite 5 números: \n");
        for (int i = 0; i < 5; i++){
            System.out.print("Número " + (i+1) + ": ");
            num = sc.nextInt();
            a[i] = num;
        }

        for (int j = 0; j < a.length; j++){
            if (a[j] % 2 == 0) {
                par = par + 1;
            }else{
                impar = impar + 1;
            }

            if (a[j] > 0) {
                maior = maior + 1;
            }else{
                menor = menor + 1;
            }
        }

        System.out.println("Números pares: " +  par);
        System.out.println("Números ímpares: " + impar);
        System.out.println("Números maiores que 0: " + maior);
        System.out.println("Números menores que 0: " + menor);
        sc.close();
    }
}*/

/*2) Calcule e mostre a soma dos números pares entre 1 e 100, inclusive.

public class aula191024 {
    public static void main(String[] args) {
        int soma = 0;

        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0) {
                soma = soma + i;
            }
        }
        System.out.println("A soma dos números pares de 1 a 100 é: " + soma);
    }
}*/

/*3) Calcule e mostre a média dos números pares entre 1 e 100, inclusive.

public class aula191024 {
    public static void main(String args[]){
        int media = 0, contPares = 0, soma = 0;
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0) {
                contPares++;
                soma = soma + i;
            }
        }
        media = soma/contPares;
        System.out.println("A média dos números pares entre 1 e 100 é: " + media);
    }
}*/

/*4) Leia 2 valores: X e Y. A seguir, calcule e mostre a soma dos números impares entre eles.

public class aula191024 {
    public static void main(String[] args) {
        int x, y, soma = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        x = sc.nextInt();
        System.out.print("Digite um outro valor: ");
        y = sc.nextInt();

        for (int i = x; i < y; i++){
            if (i % 2 != 0) {
                soma = soma + i;
            }
        }
        
        System.out.print("A soma dos números ímpares entre " + x + " e " + y);
        System.out.println(" é: " + (soma-x));
        
        sc.close();
    }
}*/

/*5) Apresente o quadrado de cada um dos números pares entre 1 e 1000, inclusive 

public class aula191024 {
    public static void main(String[] args) {
        System.out.println("O quadrado dos números pares de 1 a 1000 é: ");
        for (int i = 0; i <= 1000; i++){
            if (i % 2 == 0) {
                System.out.println(Math.pow(i, 2));
            }
        }
    }
}*/