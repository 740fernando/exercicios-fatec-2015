/*
 * Nome do programa: Lote1_2.
 * Nome do programador: Fernando Luiz
 * Objetivo: Receba o sálario de um funcionário e mostre o novo salário com reajuste de 15%
 */

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class Lote1_02 {

    public static void main(String args[]) {
        DecimalFormat df = new DecimalFormat("0.00");
        double S;

        S = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário"));

        S = S * 1.15;

        System.out.println("O novo salário e :" + df.format(S));
    }
}
