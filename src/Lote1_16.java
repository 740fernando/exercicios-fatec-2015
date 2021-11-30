/*
 * Nome do programa: Lote1_16.
 * Nome do programador: Fernando Luiz
 * Objetivo: Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de descendentes. 
 Calcule o salário que serão as horas trabalhadas x o valor por hora. 
 Calcule o salário líquido (= Salário Bruto – desconto). 
 A cada dependente será acrescido R$ 100 no Salário Líquido. 
 Exiba o salário a receber.
 */

import javax.swing.JOptionPane;

public class Lote1_16 {

    public static void main(String args[]) {
        Double SB, SL, QH, VH, D;
        int NDep;
        QH = Double.parseDouble(JOptionPane.showInputDialog("Insira a quantidade de horas trabalhadas: "));
        VH = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor que recebe por hora: "));
        //NDep = Double.parseDouble(JOptionPane.showInputDialog("Insira o números de dependentes"));
        NDep = Integer.parseInt(JOptionPane.showInputDialog("Insira o números de dependentes"));
        D = Double.parseDouble(JOptionPane.showInputDialog("Insira o percetual de descontos: "));
        /*
        SB = QH * VH;
        SL = (SB-(SB*D))+NDep*100;
        */
        SB = QH * VH;
        D = SB * (D /100);
        SL = SB - D + (NDep * 100);
        System.out.println("O salário bruto é: " + SB+" O salário líquido é: "+SL);
        
    }
}
