package Exercicio2;

public class Onibus extends Veiculo {

    Onibus(String placa, String marca, String modelo, int ano) {
        super(placa, marca, modelo, ano);
    }

    @Override
    public void calcularIPVA() {

    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Placa do Ônibus: " + this.placa);
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano de fabricação: " + this.anoFabricacao);
        System.out.println("Valor: " + this.valor);
    }
}
