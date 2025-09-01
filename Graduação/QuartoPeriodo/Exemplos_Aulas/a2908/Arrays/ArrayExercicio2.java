package aula2908.Arrays;

import java.util.Random;
import java.util.Scanner;

/*Exercício - Fazer com que todos os chutes de um jogo de advinhação sejam armazenados em um array para depois mostrar todos os chutes*/

public class ArrayExercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Random rd = new Random();
        int numAleatorio = rd.nextInt(100)+1;
        int chute[] = new int[100];

        for (int i = 0; i < chute.length; i++){
            System.out.print("Digite seu palpite: ");
            int palp = sc.nextInt();
            chute[i] = palp;
            
            if (chute) {
                
            }
        }
        
}
