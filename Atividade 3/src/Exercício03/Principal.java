package Exercício03;

public class Principal {
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo();
        Triangulo t2 = new Triangulo();
        boolean teste = false;
        System.out.println("Digite os lados do primeiro triangulo: ");
        t1.lerLados();
        teste = t1.verificaTriangulo();

        if (teste == false) {
            do {
                System.out.println("Digite novamente os lados: ");
                t1.lerLados();
                teste = t1.verificaTriangulo();
            } while (teste != true);
        }

        System.out.println("Agora digite os lados do segundo triangulo: ");
        t2.lerLados();
        teste = t2.verificaTriangulo();

        if (teste == false) {
            do {
                System.out.println("Digite novamente os lados: ");
                t2.lerLados();
                teste = t2.verificaTriangulo();
            } while (teste != true);
        }

        t1.area = t1.calculaArea(t1.calculaSemiPerimetro());
        t2.area = t2.calculaArea(t2.calculaSemiPerimetro());

        System.out.printf("Área do primeiro triângulo: %.2f\n", t1.area);
        System.out.printf("Área do segundo triângulo: %.2f\n", t2.area);

        if (t1.area > t2.area) {
            System.out.println("O triângulo com maior área é o primeiro triângulo");
        }
        else {
            System.out.println("O triângulo com maior área é o segundo triângulo");
        }
    }
}
