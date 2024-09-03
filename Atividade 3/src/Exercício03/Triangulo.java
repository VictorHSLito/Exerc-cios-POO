package Exercício03;

import java.util.Scanner;

public class Triangulo {
    int [] triangulo = new int[3];
    double area;

    Scanner sc = new Scanner(System.in);

    public void lerLados() {
        for (int i = 0; i < 3; i++) {
            this.triangulo[i] = sc.nextInt();
            if (this.triangulo[i] < 0) {
                System.out.println("Nâo é possível existir lado negativo!");
                break;
            }
        }
    }

    public boolean verificaTriangulo() {
        if ((this.triangulo[0] + this.triangulo[1] > this.triangulo[2]) &&
                (this.triangulo[1] + this.triangulo[2] > this.triangulo[0]) &&
                (this.triangulo[2] + this.triangulo[0] > this.triangulo[1])) {
            System.out.println("Triângulo válido");
            return true;
        }
        else {
            System.out.println("Triângulo inválido!");
            return false;
        }
    }

    public float calculaSemiPerimetro() {
        float perimetro = 0;
        for (int i = 0; i < 3; i++) {
            perimetro += this.triangulo[i];
        }
        return perimetro/2;
    }

    public double calculaArea(float perimetro) {
        return Math.sqrt(perimetro*(perimetro - this.triangulo[0])*
                (perimetro - this.triangulo[1])*(perimetro-this.triangulo[2]));
    }

}
