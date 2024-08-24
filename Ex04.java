/*Elabore um programa que apresente o nome e a idade de uma pessoa, considerando que ela informe apenas o ano de nascimento e o seu nome.
O seu programa deverá apresentar a seguinte mensagem: “Você se chama <nome_digitado> e possui <idade_calculada> anos de idade!”.
Você deverá utilizar o JOptionPane.*/

import javax.swing.JOptionPane;

public class Ex04 {
    public static void main (String[] args) {
        String nome = JOptionPane.showInputDialog("Como você se chama: ");
        String ano = JOptionPane.showInputDialog("Em que ano você nasceu, " + nome + "?");

        int idade = 2024 - Integer.parseInt(ano);

        String mensagem = String.format("Você se chama %s e possui %d anos de idade!", nome, idade);
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
