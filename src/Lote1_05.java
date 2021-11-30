/*
 * Nome do programa: Lote1_5.
 * Nome do programador: Fernando Luiz
 * Objetivo:Receba os coeficientes A, B e C de uma equação do 2º grau (AX²+BX+C=0). Calcule e mostre as raízes reais (considerar que a equação possue 2 raízes).
 */

import javax.swing.JOptionPane;

public class Lote1_05 {

    public static void main(String args[]) {
        Double A, B, C, X1, X2, DELTA;

        /* Input valores
         */
        A = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de A: "));
        B = Double.parseDouble(JOptionPane.showInputDialog("insira o valor de B: "));
        C = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de C: "));
        /*Calculos matemáticos
         */
        DELTA = (B * B) - 4 * A * C;
        X1 = (-B + (Math.sqrt(DELTA))) / (2 * A);
        X2 = (-B - (Math.sqrt(DELTA))) / (2 * A);

        /*Output valores
         */
        System.out.println("O valor de DELTA é: " + DELTA + "\nO valor de x1 é : " + X1 + "\nO valor de X2 é : " + X2);

    }
}
