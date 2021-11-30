/*
 * Nome do programa: Lote1_23.
 * Nome do programador: Fernando Luiz
 * Objetivo:Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem. 
 Mostre os 4 números em ordem crescente.

 */

import javax.swing.JOptionPane;

public class Lote1_23 {

    public static void main(String args[]) {
        Integer x, y, z, w;

        x = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do 1º número: "));
        
        y = Integer.parseInt(JOptionPane.showInputDialog("Insira o 2º valor"));
        if (y < x) {
            System.out.println("VALORES INVÁLIDOS");
            while (x > y) {
                y = Integer.parseInt(JOptionPane.showInputDialog("Insira o 2º valor"));
            }

        }
        z = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do 3º número "));
        if (z < y) {
            System.out.println("VALORES INVÁLIDOS");
            while (y > z) {
                z = Integer.parseInt(JOptionPane.showInputDialog("Insira o 3º valor"));
            }

        }
        w = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do 4º número "));

        if (w > z) {
            System.out.println("O resultado de forma crescente é : " +x+"-"+"-"+y+"-"+ z+"-"+w);
        } else {
            if (w > y) {
                System.out.println("O resultado de forma crescente é : "+x+"-"+y+"-"+"-"+"-"+w+"-"+ z);
            } else {
                if (w > x) {
                    System.out.println("O resultado de forma crescente é : " + x+"-"+w+"-"+y+"-"+ z);
                } else {
                    System.out.println("O resultado de forma crescente é : " + w+"-"+x+"-"+y+"-"+z);
                }
            }
        }
    }
}
