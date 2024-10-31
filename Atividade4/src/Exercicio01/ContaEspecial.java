package Exercicio01;

import java.util.Scanner;

public class ContaEspecial extends ContaBancaria{
    Scanner sc = new Scanner(System.in);  // Não é necessário usar esse recurso novamente, pois já é importado da classe-mãe
    float limit;

    ContaEspecial () {
        System.out.println(getClient() + " você está abrindo uma Conta Especial, é preciso definir um limite para saldos negativos.");
        System.out.println("Defina-o abaixo:");
        setLimit();
    }

    @Override
    public void Withdraw(float value) {
        if (this.Balance - value < -this.limit) {
            System.out.println(getClient() + " Você tentou sacar um valor superior ao limite da conta");
            System.out.println("Tente novamente um valor que não ultrapasse o limite definido na abertura da conta");
        }
        else {
            this.Balance -= value;
            System.out.println("Saque realizado com sucesso. Saldo atual: R$ " + this.Balance);
        }

    }

    public void setLimit() {
        do {
            System.out.println("Qual será o valor limite da conta?");
            this.limit = sc.nextFloat();
        } while (this.limit <= 0);
    }
}
