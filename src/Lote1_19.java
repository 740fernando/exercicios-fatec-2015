/*
 * Nome do programa: Lote1_19.
 * Nome do programador: Fernando Luiz
 * Objetivo: Receba 2 valores reais. Calcule e mostre o maior deles
 */

import javax.swing.JOptionPane;

public class Lote1_19 {

    public static void main(String args[]) {
        Float x, y;

        x = Float.parseFloat(JOptionPane.showInputDialog("Insira o primeiro valor: "));
        y = Float.parseFloat(JOptionPane.showInputDialog("Insira o segundo valor "));

        if (x > y) {
            System.out.print("O maior valor é : " + x);
        }else {
            System.out.print("O maior valor é : " + y);
        }
    }

}

