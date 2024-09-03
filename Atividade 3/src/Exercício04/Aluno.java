package Exercício04;

import java.util.Scanner;

public class Aluno {
    float[] notas = new float[3];
    private int cont = 0;
    private float soma = 0;
    Scanner sc = new Scanner(System.in);

    public void lerNotas() {
        System.out.printf("Digite a nota do %dº trimestre: ", cont + 1);
        notas[cont] = sc.nextFloat();

        if (cont == 0) {
            if (notas[cont] < 0 || notas[cont] > 30 ) {
                while (notas[cont] < 0 || notas[cont] > 30) {
                    System.out.println("Nota inválida para esse trimestre! Digite novamente: ");
                    notas[cont] = sc.nextFloat();
                }
                soma+= notas[cont];
            }
            else {
                soma+= notas[cont];
            }
        }

        if (cont == 1 || cont == 2) {
            if (notas[cont] < 0 || notas[cont] > 35 ) {
                while (notas[cont] < 0 || notas[cont] > 35) {
                    System.out.println("Nota inválida para esse trimestre! Digite novamente: ");
                    notas[cont] = sc.nextFloat();
                }
                soma+= notas[cont];
            }
            else {
                soma += notas[cont];
            }
        }
        cont++;
    }

    public void verificaAprovacao() {
        if (this.soma >= 70) {
            System.out.println("Aluno aprovado!");
        }
        else {
            System.out.println("Aluno reprovado!");
            System.out.printf("Faltam %.3f pontos para obter o mínimo para aprovação!\n", 70 - soma);
        }
    }
}
