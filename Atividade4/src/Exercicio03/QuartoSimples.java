package Exercicio03;

import java.util.Scanner;

public class QuartoSimples implements Acomodacao, ServicoAdicional {
    private int diaria = 100;
    private int pessoas = 0;
    private int dias = 0;

    Scanner sc = new Scanner(System.in);

    QuartoSimples () {
        setDias();
        setPessoas();
    }

    @Override
    public double calcularDiaria() {
        return diaria*getDias();
    }

    @Override
    public void exibirDetalhes(int dias) {
        System.out.printf("Valor da diária: %d\n", this.diaria);
        System.out.println("Quantidades de dias reservados: " + getDias());
        System.out.println("Quantidade de pessoas: " + getPessoas());
        System.out.println("Valores de cada serviço:\n" +
                "\t1 - Café da manhã: R$ 20,00 por pessoa\n" +
                "\t2 - Limpeza extra: R$ 30,00 por diária");
        System.out.printf("Valor a ser pago pelo café da manhã: R$ 20,00 * %d pessoas * %d dias = R$ %d\n" +
                        "Valor a ser pago pela limpeza: R$ 30,00 * %d dias = R$ %d\n", getPessoas(), getDias(), 20*getPessoas()*getDias(),
                getDias(), 30*getDias());
        System.out.printf("Valor a ser pago pelas diárias: R$ %.2f\n", calcularDiaria());
        System.out.printf("Total de gastos gerados: R$ %.2f\n", calcularServicos());
        System.out.println("*===================================*");
    }

    @Override
    public double calcularServicos() {
        double valorCafe = (20*getPessoas() * getDias());
        double valorLimpeza = 30*getDias();
        return calcularDiaria() + valorLimpeza + valorCafe;
    }

    private void setDias() {
        while (dias <= 0) {
            System.out.println("Quantos dias serão usados os serviços de Quarto Simples?");
            this.dias = sc.nextInt();
        }
    }

    private void setPessoas() {
        while (pessoas <= 0) {
            System.out.print("Quantos pessoas usarão os serviços de Quarto Simples? ");
            this.pessoas = sc.nextInt();
        }
    }

    public int getDias() {
        return dias;

    }
    public int getPessoas() {
        return pessoas;
    }
}
