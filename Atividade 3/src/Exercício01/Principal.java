package Exercício01;

import java.util.Scanner;

public class Principal {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int aux = 0;
        Estoque estoque1 = new Estoque();

        System.out.println("Digite o nome do produto: ");
        estoque1.nome = sc.next();
        System.out.println("Digite agora o preço do produto: ");
        estoque1.preco = sc.nextFloat();
        System.out.println("Por fim, digite a quantidade do estoque desse produto: ");
        estoque1.quantidade = sc.nextInt();
        estoque1.atualizaValor();

        estoque1.Status();
        System.out.println("Qual a quantidade que deseja adicionar ao estoque? ");
        aux = sc.nextInt();
        estoque1.insereEstoque(aux);
        estoque1.Status();
        System.out.println("Qual a quantidade que deseja retirar do estoque? ");
        aux = sc.nextInt();
        estoque1.retiraEstoque(aux);
        estoque1.Status();

        sc.close();
    }



}
