/*
 * Nome do programa: Lote1_20.
 * Nome do programador: Fernando Luiz
 * Objetivo:Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula AX²+BX+C=0. 
 Verifique e mostre a existência de raízes reais e se caso exista, calcule e mostre.
 */

import javax.swing.JOptionPane;

public class Lote1_20 {

    public static void main(String args[]) {
        Double A, B, C, x1, x2, DELTA;

        /* Input valores
         */
        A = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de A: "));
        B = Double.parseDouble(JOptionPane.showInputDialog("insira o valor de B: "));
        C = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de C: "));
        /*Calculos matemáticos
         */
        DELTA = (B * B) - 4 * A * C;
        if (DELTA < 0) {
            System.out.println(" não existem raízes reais");
        } 
        else if(DELTA == 0){
            x1 = (-B + Math.sqrt(DELTA)) / 2 * A;
            JOptionPane.showMessageDialog(null,"Exite apenas uma Raíz real X1 e X2 = " +x1);
        }
        else{
            
            x1 = (-B + (Math.sqrt(DELTA))) / (2 * A);
            x2 = (-B - (Math.sqrt(DELTA))) / (2 * A);
            System.out.println("O valor de DELTA é: " + DELTA + " O valor de x1 é : " + x1 + " O valor de X2 é : " + x2);

        }

    }
}
