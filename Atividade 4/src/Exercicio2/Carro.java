package Exercicio2;

import java.util.Scanner;

public class Carro extends Veiculo{

    Carro(String placa, String marca, String modelo, int ano) {
        super(placa, marca, modelo, ano);
    }

    @Override
    public void calcularIPVA() {

    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Placa do Carro: " + this.placa);
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.anoFabricacao);
        System.out.println("Valor: " + this.valor);
    }
}
