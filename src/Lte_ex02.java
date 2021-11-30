/*
 * Nome do programa: Lte_ex02.
 * Nome do programador: Fernando Luiz
 * Objetivo: Calcula um resultado de uma equação
 *           comandos:entrada, operador aritmético e saída
 */

import javax.swing.JOptionPane;

public class Lte_ex02 {

    public static void main(String args[]) {
        int A, R;
        A = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor"));
        System.out.println("FATEC-ZL");
        A = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        R = A * 3;

        System.out.println("O resultado é :" + R);

    }
}
