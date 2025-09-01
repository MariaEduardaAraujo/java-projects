package aula2908;

import java.util.Scanner;

public class EstrutRept {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //While
        /*
        int a = 10;

        while (a <= 10){
            System.out.println("\n" + a);
            
            System.out.print("Digite um novo valor: ");
            a = sc.nextInt();
        }*/

        //Do While
        /*
        int num = 0;

        do{
            System.out.print("\nDigite um valor: ");
            num = sc.nextInt();
        }while (num == 0);
        */

        //For
        /*
        for(int i = 1; i <= 10; i++){
            for (int j = 1; j <= 10; j++) {
                System.out.println("\n" + i*j);   
            }
            System.out.println();
        }*/

        //For 2
        System.out.println();
        for (int i = 100; i >= 0; i--){
            System.out.println(i);
        }

        sc.close();
    }
}
