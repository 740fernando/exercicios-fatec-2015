/*
 * Nome do programa: Lote1_13.
 * Nome do programador: Fernando Luiz
 * Objetivo: Receba a quantidade de alimento em quilos. 
             Calcule e mostre quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia.
 */

import javax.swing.JOptionPane;

public class Lote1_13 {

    public static void main(String args[]) {
        double A,D;

        A= Double.parseDouble(JOptionPane.showInputDialog("Insira a quantidade de alimenento em Kg"));
        D=(A*1000)/50;
       

        System.out.println("O alimento vai durar: " +D+" dias");
    }
}
