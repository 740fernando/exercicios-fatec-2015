/*
 * Nome do programa: Lote1_6.
 * Nome do programador: Fernando Luiz
 * Objetivo: Receba os valores em x e y. Efetua a troca de seus valores e mostre seus conteúdos.
 */

import javax.swing.JOptionPane;

public class Lote1_06 {

    public static void main(String args[]) {
        //int X, Y;
        int X, Y, aux;

        X = Integer.parseInt(JOptionPane.showInputDialog("insira o valor de X: "));
        Y = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de y: "));
        /*
        X=-X;
        Y=-Y;
        */
        aux = X;
        X = Y;
        Y = aux;
        
        System.out.println("Efetuado a troca de valores: "+"\nX= "+X+"\nY= "+Y);}
}
   
