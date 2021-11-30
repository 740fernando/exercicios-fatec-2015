/*
 * Nome do programa: Lote1_12.
 * Nome do programador: Fernando Luiz
 * Objetivo: Receba o ano de nascimento e o ano atual. 
             Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos.
 */

import javax.swing.JOptionPane;

public class Lote1_12 {

    public static void main(String args[]) {
        Integer AN, AT, I;

        AN = Integer.parseInt(JOptionPane.showInputDialog("Insira  o ano de nascimento "));
        AT = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano atual"));
        I = (AT - AN) + 17;

        System.out.println("A sua idade daqui a 17 anos sera : " + I);
    }
}
