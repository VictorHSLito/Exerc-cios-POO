/*Desenvolva um algoritmo que leia o valor de um produto e aplique um desconto a ser especificado pelo usuário.
Ao final do programa, apresente o nome do produto, seu antigo valor e o valor com desconto aplicado com três casas decimais.*/

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o nome do produto?");

        String nome = sc.nextLine();
        System.out.println("Qual o seu preço?");

        float preco = sc.nextFloat();
        System.out.println("Qual será o desconto aplicado ao produto? ");

        float desconto = sc.nextFloat();
        float preco_final = preco* (1 - (desconto*1/100));

        System.out.printf("O preço do produto %s antes do desconto era de R$ %.3f, " +
                "com o desconto será de R$ %.3f.", nome, preco, preco_final);

        sc.close();
    }
}
