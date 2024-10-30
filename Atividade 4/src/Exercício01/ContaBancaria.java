package Exercício01;

public abstract class ContaBancaria {
    String Client;
    int IdAccount;
    float Balance;

    public void Withdraw(float value) {
        if (value > this.Balance) {
            System.out.println("Não é possível sacar além do que há na conta");
        }
        this.Balance -= value;
    }

    public void Deposit(float value) {
        if (value <= 0) {
            System.out.println("Não é possível depositar nada ou um valor negativo");
        }
        this.Balance += value;
    }
}
