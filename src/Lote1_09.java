/*
 * Nome do programa: Lote1_9.
 * Nome do programador: Fernando Luiz
 * Objetivo: Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados
 */
import javax.swing.JOptionPane;

public class Lote1_09 {

    public static void main(String args[]) {
        //Integer X,Y;
        int X, Y,qdr;

        X= Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de X "));
        Y= Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de Y"));
        
        qdr= (X*X)+(Y*Y);
        
        System.out.println("O valor da soma dos quadrados de X e Y é: "+qdr);
    }
}