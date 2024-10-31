package Exercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opc;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Escolha uma opção de acomodação\n");
            System.out.println("\t1- Quarto Simples;\n" +
                    "\t2 - QuartoDuplo;\n" +
                    "\t3 - Suíte\n");
            System.out.print("Sua escolha: ");
            opc = sc.nextInt();
        } while (opc <= 0 || opc > 3);

        switch (opc) {
            case 1:
                QuartoSimples q1 = new QuartoSimples();
                break;
            case 2:
                QuartoDuplo q2 = new QuartoDuplo();
                break;
            case 3:
                Suite s1 = new Suite();
                break;
            default:
                System.out.println("Não foi escolhida uma opção válida");
                break;
        }

    }

}
