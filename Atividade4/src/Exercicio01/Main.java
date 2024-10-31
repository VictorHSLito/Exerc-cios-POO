package Exercicio01;

public class Main {
    public static void main(String[] args) {
        ContaPoupanca c1 = new ContaPoupanca();
        ContaEspecial c2 = new ContaEspecial();

        c1.Informations();
        System.out.println();
        c1.Deposit(1000);
        System.out.println();
        c1.Withdraw(999);
        System.out.println();
        c1.NewBalance(14);
        System.out.println();
        c1.NewBalance(c1.IncomeDay);
        System.out.println();
        c1.Informations();

        System.out.println();
        c2.Informations();
        System.out.println();
        c2.Deposit(8000);
        System.out.println();
        c2.Withdraw(15000);
        System.out.println();
        c2.Informations();

    }
}