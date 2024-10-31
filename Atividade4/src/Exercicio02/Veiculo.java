package Exercicio02;

import java.util.Scanner;

public abstract class Veiculo {
    Scanner sc = new Scanner(System.in);
    protected String placa;
    protected String marca;
    protected String modelo;
    protected int anoFabricacao;
    protected float valor;

    Veiculo (String placa, String marca, String modelo, int ano) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = ano;
        setValor();
    }
    abstract void calcularIPVA();

    abstract void exibirDetalhes();

    protected void setValor() {
       do {
           System.out.print("Qual será o valor do automóvel? ");
           this.valor = sc.nextFloat();
           if (this.valor < 20000) {
               System.out.println("Valor inválido para automóvel! Digite um valor acima de R$ 20.000");
           }
       } while (valor < 20000);
    }
}
