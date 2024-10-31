package Exercicio01;

import java.util.Scanner;

public class Estoque {
    private String nome;
    private float preco;
    private int quantidade;
    private float valorTotal;

    Scanner sc = new Scanner(System.in);

    public void Status() {
        System.out.println("--------------------");
        System.out.println("Nome do produto: " + this.nome);
        System.out.println("Preço do produto: " + this.preco);
        System.out.println("Quantidade do produto: " + this.quantidade);
        System.out.println("Valor total: " + this.valorTotal);
    }

    public void cadastraEstoque() {
        System.out.println("Digite o nome do produto: ");
        this.nome = sc.next();
        System.out.println("Digite agora o preço do produto: ");
        this.preco = sc.nextFloat();
        while (this.preco < 0) {
            System.out.println("Valor inválido para preço! Digite novamente: ");
            this.preco = sc.nextFloat();
        }
        System.out.println("Por fim, digite a quantidade do estoque desse produto: ");
        this.quantidade = sc.nextInt();
        while (this.quantidade < 0) {
            System.out.println("Quantidade inválida! Digite novamente");
            this.quantidade = sc.nextInt();
        }
    }

    public void insereEstoque(int qte) {
        this.quantidade += qte;
        System.out.printf("Inserindo mais %d unidades do produto ao estoque\n", qte);
        atualizaValor();
    }

    public void retiraEstoque (int qte) {
        if (qte > this.quantidade) {
            System.out.println("Não é possível retirar a mais da quantidade de produtos em estoque!");
        }
        else {
            this.quantidade -= qte;
            System.out.printf("Removendo %d unidades do produto do estoque\n", qte);
            atualizaValor();
        }
    }

    public void atualizaValor() {
        this.valorTotal = this.quantidade * this.preco;
    }
}
