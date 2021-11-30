/*
 * Nome do programa: Lote1_15.
 * Nome do programador: Fernando Luiz
 * Objetivo:Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa.
 */

import javax.swing.JOptionPane;

public class Lote1_15 {

    public static void main(String args[]) {
        Double C1,C2,H;
        
        C1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do cateto 1"));
        C2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do cateto 2"));

        H= Math.sqrt((C1*C1)+(C2*C2));
        //H = Math.sqrt(Math.pow(C1, 2) + Math.pow(C2, 2)); Você pode usar a função Math.pow(variável,nº que deseja elevar)

        System.out.println("O valor da hipotenusa é: "+H);
    }
}
