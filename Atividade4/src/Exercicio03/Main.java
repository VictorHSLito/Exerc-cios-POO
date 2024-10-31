package Exercicio03;

import java.util.Scanner;

/*
Teria sido interessante ter criado uma classe abstrata que funcionasse
como molde para as outras classes. Assim não haveria tanto reuso de código.
 */

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
                q1.exibirDetalhes(q1.getDias());
                break;
            case 2:
                QuartoDuplo q2 = new QuartoDuplo();
                q2.exibirDetalhes(q2.getDias());
                break;
            case 3:
                Suite s1 = new Suite();
                s1.exibirDetalhes(s1.getDias());
                break;
            default:
                System.out.println("Não foi escolhida uma opção válida");
                break;
        }

    }

}
