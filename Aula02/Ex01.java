//Elabore um programa que leia 5 valores e calcule a média aritmética deles. Ao final do programa, apresente os valores digitados e a média aritmética.

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        int size = 5;
        float [] notas = new float[size];
        float media = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 5 notas: ");

        for (int i = 0; i < size; ++i) {
            notas[i] = sc.nextFloat();
            media += notas[i];
        }
        media = (media)/5;
        System.out.println("A media final vale: " + media);
        sc.close();
    }
}
