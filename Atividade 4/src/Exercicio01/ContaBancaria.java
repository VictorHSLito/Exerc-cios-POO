package Exercicio01;

public abstract class ContaBancaria {
    String Client;
    int IdAccount;
    float Balance;

    ContaBancaria() {
        this.Client = "João";
        this.IdAccount = 1;
        this.Balance = 0;
    }

    ContaBancaria(String name, int accountId, float balanceAmount) {
        this.Client = name;
        this.IdAccount = accountId;
        this.Balance = balanceAmount;
    }

    public void Withdraw(float value) {
        if (value > this.Balance) {
            System.out.println("Não é possível sacar além do que há na conta");
        }
        else {
            this.Balance -= value;
        }
    }

    public void Deposit(float value) {
        if (value <= 0) {
            System.out.println("Não é possível depositar nada ou um valor negativo");
        }
        this.Balance += value;
    }

    public void Informations() {
        System.out.println("Nome do Cliente: " + this.Client);
        System.out.println("Id da conta: " + this.IdAccount);
        System.out.println("Saldo em conta: " + this.Balance);
    }
}
