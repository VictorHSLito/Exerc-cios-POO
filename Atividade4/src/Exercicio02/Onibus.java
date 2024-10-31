package Exercicio02;

public class Onibus extends Exercicio02.Veiculo {

    Onibus(String placa, String marca, String modelo, int ano) {
        super(placa, marca, modelo, ano);
    }

    @Override
    public void calcularIPVA() {
        /*Ônibus reduzem o valor estimado em R$ 3.000 a cada ano
        e ônibus pagam 2% do valor estimado do veículo.*/
        int idadeVeiculo = 2024 - this.anoFabricacao;
        if (idadeVeiculo > 0) {
            this.valor -= idadeVeiculo*3000;
            if (this.valor > 0) {
                double ipva = (2.0/100)*this.valor;
                System.out.printf("O valor do IPVA do ônibus é %.2f", ipva);
                System.out.println();
            }
            else { /*Caso o valor do veículo venha a ser menor ou igual a zero, significa que ele desvalorizou a ponto
                de não precisar pagar IPVA*/
                System.out.println("Esse veículo está isento de IPVA\n");
            }
        }
        else if (idadeVeiculo == 0) {
            double ipva = (2.0/100)*idadeVeiculo;
            System.out.println("O valor do IPVA desse ônibus é: " + ipva);
            System.out.println();
        }
        else {
            System.out.println("Não foi possível calculcar o IPVA desse veículo\n");
        }
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Placa do Ônibus: " + this.placa);
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano de fabricação: " + this.anoFabricacao);
        System.out.println("Valor: " + this.valor);
        System.out.println();
    }
}
