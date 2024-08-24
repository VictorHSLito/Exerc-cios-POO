package Aula02;/*Faça um programa para ler o valor de um círculo, e depois mostre o valor da área deste círculo com quatro casas decimais.
Você deverá utilizar o JOptionPane. */

import javax.swing.JOptionPane;
public class Ex02 {
    public static void main (String[] args) {
        String raio = JOptionPane.showInputDialog("Digite o valor do raio do círculo: ");
        float PI = 3.14159f;

        float raio1 = Float.parseFloat(raio);
        float area = PI*(raio1*raio1);

        String mensagem = String.format("A área do circulo de raio %s, vale: %.4f", raio, area);
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
