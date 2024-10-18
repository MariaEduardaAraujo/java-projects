import java.util.Scanner;

/*3) Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.*/

/*4) Construir um algoritmo que leia dois números e efetue a adição. Caso o valor somado seja
maior que 20, este deverá ser apresentado somando-se a ele mais 8; caso o valor somado seja
menor ou igual a 20, este deverá ser apresentado subtraindo-se 5.*/

public class aula171024 {
    public static void main(String args[]) {
        int a, b, c, maior;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite três valores! \n");
        System.out.print("a: ");
        a = sc.nextInt();
        System.out.print("b: ");
        b = sc.nextInt();
        System.out.print("c: ");
        c = sc.nextInt();

        maior = a;

        if (b > maior) {
            System.out.println("O maior valor é: " + b);
        }
        if (c > maior) {
            System.out.println("O maior valor é: " + c);
        }else{
            System.out.println("O maior valor é: " + maior);
        }
        
        sc.close();
    }
}
