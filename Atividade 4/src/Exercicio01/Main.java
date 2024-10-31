package Exercicio01;

public class Main {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaPoupanca();
        ContaEspecial c2 = new ContaEspecial();

        c1.Informations();
        c1.Deposit(1000);
        c1.Withdraw(999);
        c1.Informations();

        c2.Informations();
        c2.setLimit();
        c2.Withdraw(6000);
        c2.Informations();

    }
}