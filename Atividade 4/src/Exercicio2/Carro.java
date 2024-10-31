package Exercicio2;

import java.util.Scanner;

public class Carro extends Veiculo{

    Carro(String placa, String marca, String modelo, int ano) {
        super(placa, marca, modelo, ano);
    }

    @Override
    public void calcularIPVA() {
        /*Carros reduzem o valor estimado em R$ 2000 a cada ano
        e carros pagam 4% do valor estimado do veículo.*/
        int idadeVeiculo = 2024 - this.anoFabricacao;
        if (idadeVeiculo > 0) {
            this.valor -= idadeVeiculo*2000;
            if (this.valor > 0) {
                double ipva = (4.0/100)*this.valor;
                System.out.printf("O valor do IPVA do carro é %.2f", ipva);
                System.out.println();
            }
            else { /*Caso o valor do veículo venha a ser menor ou igual a zero, significa que ele desvalorizou a ponto
                de não precisar pagar IPVA*/
                System.out.println("Esse veículo está isento de IPVA");
                System.out.println();
            }
        }
        else if (idadeVeiculo == 0) {
            double ipva = (4.0/100)*this.valor;
            System.out.println("O valor do IPVA do carro é: " + ipva);
            System.out.println();
        }
        else {
            System.out.println("Não foi possível calculcar o IPVA desse veículo\n");
        }
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Placa do Carro: " + this.placa);
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.anoFabricacao);
        System.out.println("Valor: " + this.valor);
        System.out.println();
    }
}
