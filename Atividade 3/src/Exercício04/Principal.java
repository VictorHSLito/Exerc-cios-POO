package Exercício04;

public class Principal {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();

        for (int i = 0; i < 3; i++) {
            a1.lerNotas();
        }

        a1.verificaAprovacao();
    }
}
