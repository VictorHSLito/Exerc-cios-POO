package Exercício02;

import java.util.Scanner;

public class Funcionario {
    String nome;
    float salario;
    float novo_salario;

    Scanner sc = new Scanner(System.in);

    public void Status() {
        System.out.println("Nome do Funcionário: " + this.nome);
        System.out.println("Salário antigo do funcionário: " + this.salario);
        System.out.println("Novo salário com reajuste: " + this.novo_salario);
    }

    public void cadastraFuncionario() {
        System.out.println("Qual o nome do funcionário? ");
        this.nome = sc.next();
        System.out.printf("Qual o salário de %s? ", this.nome);
        this.salario = sc.nextFloat();
        if (this.salario < 0) {
            do {
                System.out.println("Salário inválido! Por favor digite novamente: ");
                this.salario = sc.nextFloat();
            } while (this.salario < 0);
        }
    }

    public void atualizaSalario() {
        if (this.salario > 1 && this.salario <= 1000) {
            this.novo_salario = this.salario*1.15f;
        }
        else if (this.salario > 1001 && this.salario <= 1500) {
            this.novo_salario = this.salario*1.10f;
        }
        else if (this.salario > 1501 && this.salario <= 2000) {
            this.novo_salario = this.salario*1.05f;
        }
        else {
            System.out.println("Esse sálario não é possível receber aumento");
        }
    }
}
