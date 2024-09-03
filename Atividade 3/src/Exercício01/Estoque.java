package Exercício01;

public class Estoque {
    public String nome;
    public float preco;
    public int quantidade;
    public float valorTotal;

    public void Status() {
        System.out.println("--------------------");
        System.out.println("Nome do produto: " + this.nome);
        System.out.println("Preço do produto: " + this.preco);
        System.out.println("Quantidade do produto: " + this.quantidade);
        System.out.println("Valor total: " + this.valorTotal);
    }

    public void insereEstoque(int qte) {
        this.quantidade += qte;
        System.out.printf("Inserindo mais %d unidades do produto ao estoque\n", qte);
        atualizaValor();
    }

    public void retiraEstoque (int qte) {
        if (qte > this.quantidade) {
            System.out.println("Não é possível retirar além dos produtos em estoque!");
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
