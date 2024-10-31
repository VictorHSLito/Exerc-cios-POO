package Exercicio02;

public class Caminhao extends Veiculo{
    Caminhao(String placa, String marca, String modelo, int ano) {
        super(placa, marca, modelo, ano);
    }

    @Override
    public void calcularIPVA() {
        /*Caminhões reduzem o valor estimado em R$5.000 a cada ano.
        * e caminhões pagam 1,5% do valor estimado do veículo.*/
        int idadeVeiculo = 2024 - this.anoFabricacao;

        if (idadeVeiculo > 0) {
            this.valor -= 5000*idadeVeiculo;
            if(this.valor > 0) {
                double ipva = (1.5/100) * this.valor;
                System.out.printf("O valor do IPVA do caminhão é %.2f", ipva);
                System.out.println();
            }
            else { /*Caso o valor do veículo venha a ser menor ou igual a zero, significa que ele desvalorizou a ponto
                de não precisar pagar IPVA*/
                System.out.println("Esse veículo está isento de IPVA\n");
            }

        }
        else if (idadeVeiculo == 0) {
            double ipva = (1.5/100)*this.valor;
            System.out.println("O valor do IPVA do caminhão é: " + ipva);
            System.out.println();
        }
        else {
            System.out.println("Não foi possível calcular o IPVA desse veículo\n");
        }
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Placa do Caminhao: " + this.placa);
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.anoFabricacao);
        System.out.println("Valor: " + this.valor);
        System.out.println();
    }
}
