package Exercicio03;

import java.util.Scanner;

public class QuartoDuplo implements Acomodacao, ServicoAdicional{
    int diaria = 180;
    int pessoas = 0;
    int dias = 0;

    Scanner sc = new Scanner(System.in);

    QuartoDuplo () {
        setDias();
        setPessoas();
    }

    @Override
    public double calcularDiaria() {
        return diaria*getDias();
    }

    @Override
    public void exibirDetalhes(int dias) {
        System.out.printf("Valor da diária %d", this.diaria);
        System.out.println("Quantidades de dias reservados: " + getDias());
        System.out.println("Quantidade de pessoas: " + getPessoas());
        System.out.println("Valores de cada serviço:\n" +
                "\t1 - Café da manhã: R$ 20,00 por pessoa\n" +
                "\t2 - Limpeza extra: R$ 30,00 por diária\n");
        System.out.printf("Total de gastos gerados: %f.2f", calcularServicos());
    }

    @Override
    public double calcularServicos() {
        double valorCafe = 20*getPessoas();
        double valorLimpeza = 30*getDias();
        return calcularDiaria() + valorLimpeza + valorCafe;
    }

    private void setDias() {
        while (dias <= 0) {
            System.out.print("Quantos dias serão usados os serviços de Quarto Duplo? ");
            this.dias = sc.nextInt();
        }
    }

    private void setPessoas() {
        while (pessoas <= 0) {
            System.out.print("Quantos pessoas usarão os serviços de Quarto Duplo? ");
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
