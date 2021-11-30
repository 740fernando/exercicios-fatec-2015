/*
 * Nome do programa: Lote1_14.
 * Nome do programador: Fernando Luiz
 * Objetivo:Receba 2 ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo.
 */

import javax.swing.JOptionPane;

public class Lote1_14 {

    public static void main(String args[]) {
        double A1, A2, A3;

        A1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do ângulo 1"));
        A2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do ângulo 2"));

        A3=180-(A1+A2);

        System.out.println("O valor do terceiro ângulo: " + A3 + "°");
    }
}
