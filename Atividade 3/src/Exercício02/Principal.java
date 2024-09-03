package Exercício02;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario f1 = new Funcionario();

        f1.cadastraFuncionario();
        f1.atualizaSalario();
        f1.Status();
        sc.close();
    }
}
