/*
 * Nome do programa: Lote1_1.
 * Nome do programador: Fernando Luiz
 * Objetivo: Coletar o valor de um lado de um quadrado, calcular sua área e apresentar o resultado
 */

import javax.swing.JOptionPane;

public class Lote1_01 {

    public static void main(String args[]) {
        int A, R;
        A = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado do quadrado"));

        R = A * A;

        System.out.println("A área do quadrado é :" + R);

    }
}
