/*
 * Nome do programa: Lote1_7.
 * Nome do programador: Fernando Luiz
 * Objetivo: Receba os valores do comprimento, largura e altura de um paralelepípedo. Calcule e mostre seu volume.
 */

import javax.swing.JOptionPane;

public class Lote1_07 {

    public static void main(String args[]) {
        Double C, L, H, V;

        C = Double.parseDouble(JOptionPane.showInputDialog("insira o comprimento: "));
        L = Double.parseDouble(JOptionPane.showInputDialog("Insira a largura: "));
        H = Double.parseDouble(JOptionPane.showInputDialog("Insira a altura: "));
        
        V= C*L*H;

        System.out.println("O volume do paralelepído é: "+V);
    }
}
