/*
 * Nome do programa: Lote1_8.
 * Nome do programador: Fernando Luiz
 * Objetivo:Receba o valor de um depósito em poupança. 
   Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.
 */
import javax.swing.JOptionPane;

public class Lote1_08 {

    public static void main(String args[]) {
        Double D;

        D = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do depósito "));
       
        D= D*1.03;

        System.out.println("O valor do reajuste após 1 mês é : "+D);
    }
}
