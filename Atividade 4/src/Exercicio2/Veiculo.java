package Exercicio2;

public abstract class Veiculo {
    String placa;
    String marca;
    String modelo;
    int anoFabricacao;

    abstract void calcularIPVA();

    abstract void exibirDetalhes();
}
