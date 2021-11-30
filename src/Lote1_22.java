/*
 * Nome do programa: Lote1_22.
 * Nome do programador: Fernando Luiz
 * Objetivo:Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.

 */

import javax.swing.JOptionPane;

public class Lote1_22 {

    public static void main(String args[]) {
        Integer x, y;

        x = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do 1º número: "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do 2º número "));

        if (x > y) {
            System.out.println("O resultado de forma crescente é : " + y + " , " + x);
        } else {
            System.out.println("O resultado de forma crescente é : " + x + " , " + y);

        }
    }
}
