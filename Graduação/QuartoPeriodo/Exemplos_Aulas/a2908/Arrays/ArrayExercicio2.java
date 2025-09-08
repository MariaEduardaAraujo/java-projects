package a2908.Arrays;

import java.util.Random;
import java.util.Scanner;

/*Exercício - Fazer com que todos os chutes de um jogo de advinhação sejam armazenados em um array para depois mostrar todos os chutes*/

public class ArrayExercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Random rd = new Random();
        int numAleatorio = rd.nextInt(100)+1;
        int chances = 5;
        int chute[] = new int[chances];
        
        System.out.println(numAleatorio);

        for (int i = 0; i < chute.length; i++){
            System.out.print("Digite seu palpite: ");
            int palp = sc.nextInt();
            
            boolean repetido = false;
            for (int j = 0; j < i; j++) {  // só até i, porque o resto ainda não foi preenchido
                if (palp == chute[j]) {
                    repetido = true;
                    break;
                }
            }

            if (repetido) {
                System.out.print("Você já deu esse palpite! ");
                i--;
            }else{
                chute[i] = palp;
                System.out.print("Palpite registrado! ");
            }

            if (palp == numAleatorio) {
                System.out.println("Acertou!");
                break;
            }else{
                System.out.println("\nMas você não acertou! Tente novamente!");
            }
        }
        sc.close();
    }
}