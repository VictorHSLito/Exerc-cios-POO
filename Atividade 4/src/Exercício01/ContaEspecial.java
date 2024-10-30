package Exercício01;

public class ContaEspecial extends ContaBancaria{
    float limit;

    @Override
    public void Withdraw(float value) {
        if (!(value <= -this.limit)) {
            System.out.println("Não é possível sacar além do limite da conta");
        }
        this.Balance -= value;
    }
}
