package Exercicio02;

import java.util.Scanner;

public abstract class Veiculo {
    Scanner sc = new Scanner(System.in);
    String placa;
    String marca;
    String modelo;
    int anoFabricacao;
    float valor;

    Veiculo (String placa, String marca, String modelo, int ano) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = ano;
        setValor();
    }
    abstract void calcularIPVA();

    abstract void exibirDetalhes();

    private void setValor() {
        System.out.println("Qual será o valor do automóvel?");
        this.valor = sc.nextFloat();
    }
}
