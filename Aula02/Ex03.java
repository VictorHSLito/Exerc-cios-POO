package Aula02;/*Faça um algoritmo que leia o número de horas trabalhadas de um funcionário, o valor que ele recebe por hora e calcule o salário desse funcionário.
Apresente o salário do funcionário com duas casas decimais.*/

import java.util.Scanner;

public class Ex03 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas horas esse funcionário trabalhou? ");
        int horas = sc.nextInt();

        System.out.println("Qual o valor que esse funcionário recebe por hora trabalhada? ");
        float trab_hora = sc.nextFloat();

        float salario = trab_hora*horas;

        System.out.printf("O salário desse funcionário equivale a R$ %.2f", salario);
        sc.close();
    }
}
