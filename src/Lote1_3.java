/*
 * Nome do programa: Lote1_3.
 * Nome do programador: Fernando Luiz
 * Objetivo: Receba a base e a altura de um triângulo. Calcule e mostre a sua área.
 */

import javax.swing.JOptionPane;

public class Lote1_3 {

    public static void main(String args[]) {
        double B, H, A;

        B = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do triângulo"));
        H = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do triângulo"));
        A = B * H;

        System.out.println("O novo salário e :" + A);

    }
}
