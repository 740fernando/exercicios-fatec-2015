/*
 * Nome do programa: Lote1_11.
 * Nome do programador: Fernando Luiz
 * Objetivo: Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência.
 */
import javax.swing.JOptionPane;

public class Lote1_11 {

    public static void main(String args[]) {
        Double C,R;

        R= Double.parseDouble(JOptionPane.showInputDialog("Insira o raio da circunferência "));
        
        C= R*Math.PI*2;
        
        System.out.println("O comprimento da circunferência é : " +C);}
}