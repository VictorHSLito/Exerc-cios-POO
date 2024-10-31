package Exercicio01;

public class ContaPoupanca extends ContaBancaria {
    int IncomeDay;

    ContaPoupanca () {
        System.out.println(getClient() + " você está abrindo uma Conta Poupança, nesse caso é necessário definir um dia para rendimentos");
        setIncomeDay();
    }

    public void NewBalance(int incomeDay) {
        /* Geralmente a taxa de rendimento em contas poupanças
        varia em torno de 0,5% + TR (Taxa Referencial), a fim de
        não complicar o exercício, considerarei apenas como rendimento
        de 0,5% */
        if (incomeDay == this.IncomeDay) {
            this.Balance *= (float) (1.005);
            System.out.println("Novo saldo é de: R$ " + this.Balance);
        }
        else {
            System.out.println("Ainda não é dia de rendimento");
        }
    }

    private void setIncomeDay() {
        do {
            System.out.print("Qual dia seria um de sua preferência? ");
            this.IncomeDay = sc.nextInt();
        } while (this.IncomeDay <= 0 || this.IncomeDay > 31 );
    }
}
