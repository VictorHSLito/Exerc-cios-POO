package Exercício02;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario f1 = new Funcionario();

        System.out.println("Qual o nome do funcionário: ");
        f1.nome = sc.next();
        System.out.println("Agora digite o salário desse funcionário: ");
        f1.salario = sc.nextFloat();
        f1.atualizaSalario(f1.salario);

        f1.Status();
        sc.close();
    }
}
