package Exercicio01;

import java.util.Random;
import java.util.Scanner;

public abstract class ContaBancaria {
    /*Os atributos são Protected pois queremos que as classes filhas
    tenham acesso a esses atributos, mas não um agente externo*/
    protected String Client;
    protected int IdAccount;
    protected float Balance;

    Scanner sc = new Scanner(System.in);
    Random random = new Random(); // Vai ser usado para gerar o Id da conta

    ContaBancaria() {
        setInformations();
    }

    public void Withdraw(float value) {
        if (value > this.Balance) {
            System.out.println("Não é possível sacar além do que há na conta");
        }
        else {
            this.Balance -= value;
            System.out.println(getClient() + ", foi retirado R$ " + value + " de sua conta!");
            System.out.println("O novo saldo da sua conta é: R$ " + getBalance());
        }
    }

    public void Deposit(float value) {
        if (value <= 0) {
            System.out.println("Não é possível depositar nada ou um valor negativo");
        }
        this.Balance += value;
        System.out.println(getClient() + ", foi depositado R$ " + value + " em sua conta!");
        System.out.println("O novo saldo da sua conta é: R$ " + getBalance());
    }

    public void Informations() {
        System.out.println("Nome do Cliente: " + getClient());
        System.out.println("Id da conta: " + getIdAccount());
        System.out.println("Saldo em conta: R$ " + getBalance());
    }

    private void setInformations() {
        int opc = 0;
        do {
            System.out.println("Qual o nome do cliente? ");
            this.Client = sc.nextLine();
            System.out.print("Você confirma esse nome?\n" +
                    "\t1 - Sim\n" +
                    "\t2 - Não, deixe-me tentar novamente\n");
            opc = sc.nextInt();
        } while (opc != 1);
        this.IdAccount = random.nextInt(0, 100000);
        this.Balance = 0;
    }

    public String getClient() {
        return Client;
    }

    private int getIdAccount() {
        return IdAccount;
    }

    private float getBalance() {
        return Balance;
    }
}
