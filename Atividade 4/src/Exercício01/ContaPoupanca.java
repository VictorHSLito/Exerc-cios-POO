package Exercício01;

public class ContaPoupanca extends ContaBancaria {
    int IncomeDay;

    public void NewBalance(int incomeDay) {
        /* Geralmente a taxa de rendimento em contas poupanças
        varia em torno de 0,5% + TR (Taxa Referencial), a fim de
        não complicar o exercício, considerarei apenas como rendimento
        de 0,5% */
        if (incomeDay == this.IncomeDay) {
            this.Balance *= (float) (1.005);
            System.out.println("Novo saldo é de: " + this.Balance);
        }
        else {
            System.out.println("Ainda não é dia de rendimento");
        }
    }
}
