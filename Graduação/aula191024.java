import java.util.Scanner;

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

/*4) Leia 2 valores: X e Y. A seguir, calcule e mostre a soma dos números impares entre eles.*/

public class aula191024 {
    public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        x = sc.nextInt();
        System.out.println("Digite um outro valor: ");
        y = sc.nextInt();

        if (x % 2 != 0 || y % 2 != 0) {
            
        }
        
        sc.close();
    }
}