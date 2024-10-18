//import java.util.Scanner;

/*3) Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.

public class aula171024 {
    public static void main(String args[]) {
        int a, b, c, maior;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite três valores: \n");
        System.out.print("a: ");
        a = sc.nextInt();
        System.out.print("b: ");
        b = sc.nextInt();
        System.out.print("c: ");
        c = sc.nextInt();

        maior = a;

        if (b > maior) {
            maior = b;
        }
        if (c > maior) {
            maior = c;
        }
        
        System.out.println("O maior valor é: " + maior);

        sc.close();
    }
}*/

/*4) Construir um algoritmo que leia dois números e efetue a adição. Caso o valor somado seja
maior que 20, este deverá ser apresentado somando-se a ele mais 8; caso o valor somado seja
menor ou igual a 20, este deverá ser apresentado subtraindo-se 5.

public class aula171024 {
    public static void main(String[] args) {
      int num1, num2, soma;
      
      Scanner sc = new Scanner(System.in);
      System.out.println("Digite dois valores para serem somados: ");
      System.out.print("Valor 1: ");
      num1 = sc.nextInt();
      System.out.print("Valor 2: ");
      num2 = sc.nextInt();

      soma = num1 + num2;

      if (soma > 20) {
        System.out.println("O valor da soma desses dois números é: " + (soma + 8));
      }else if (soma <= 20) {
        System.out.println("O valor da soma desses dois números é: " + (soma - 5));
      }
      sc.close();
    }
}*/