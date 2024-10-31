package Exercicio02;

public class Main {
    public static void main(String[] args) {
        Exercicio02.Veiculo c1 = new Carro("RQD-3121", "BMW", "320i", 2014);
        Exercicio02.Veiculo c2 = new Caminhao("PBC-2108", "Mercedes", "Truck 2000", 2003);
        Exercicio02.Veiculo o1 = new Onibus("JPQ-3134", "Volkswagem", "FOZ U 11", 2020);
        c1.exibirDetalhes();
        c1.calcularIPVA();

        c2.exibirDetalhes();
        c2.calcularIPVA();

        o1.exibirDetalhes();
        o1.calcularIPVA();
    }
}
