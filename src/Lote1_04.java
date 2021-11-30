/*
 * Nome do programa: Lote1_4.
 * Nome do programador: Fernando Luiz
 * Objetivo: Receba a temperatura em graus Celsius. Calcule e mostre a sua temperatura convertida em fahrenheit.
 */

import javax.swing.JOptionPane;

public class Lote1_04 {

    public static void main(String args[]) {
        double C, F;

        C = Double.parseDouble(JOptionPane.showInputDialog("Insira a temperatura em Celsius"));

        //F = (9 * C + 160 / 5);
        F = (9 * C + 160) / 5;
        System.out.println("A temperatura em Fahnrenheit:" + F);

    }
}
