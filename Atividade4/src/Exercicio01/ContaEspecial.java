package Exercicio01;

import java.util.Scanner;

public class ContaEspecial extends ContaBancaria{
    Scanner sc = new Scanner(System.in);
    float limit;

    @Override
    public void Withdraw(float value) {
        if ((value > this.limit)) {
            System.out.println("Não é possível sacar além do limite da conta");
        }
        this.Balance -= value;
    }

    public void setLimit() {
        System.out.println("Qual será o valor limite da conta?");
        this.limit = sc.nextFloat();
    }
}
