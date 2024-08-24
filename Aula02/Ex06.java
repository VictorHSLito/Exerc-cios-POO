package Aula02;/*Faça um algoritmo que leia o salário de um funcionário e aplique um aumento de 15% sobre o salário.
Ao final do algoritmo apresente o antigo salário e o salário reajustado com duas casas decimais. Você deverá utilizar o JOPtionPane.*/

import javax.swing.JOptionPane;

public class Ex06 {
    public static void main(String[] args) {
        String pergunta = JOptionPane.showInputDialog("Qual o salário do funcionário? ");

        float salario = Float.parseFloat(pergunta);

        float novo_salario = salario*1.15f;

        String mensagem = String.format("O antigo salário era de R$ %.2f e o novo salário com o aumento é de R$ %.2f.", salario, novo_salario);

        JOptionPane.showMessageDialog(null, mensagem);
    }
}
