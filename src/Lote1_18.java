/*
 * Nome do programa: Lote1_18.
 * Nome do programador: Fernando Luiz
 * Objetivo: Receba 2 valores inteiros. 
             Calcule e mostre o resultado da diferença do maior pelo menos valor.
 */

import javax.swing.JOptionPane;

public class Lote1_18 {

    public static void main(String args[]) {
        Integer x, y, z;

        x = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor: "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor "));

        if (x > y) {
            z = x - y;
            System.out.print("o valor do maior para o menor é: " + x + " - " + y + " = " + z);
        } else {
            z = y - x;
            System.out.print("o valor do maior para o menor é: " + y + " - " + x + " = " + z);
        }

        
    }
}
