/*
 * Nome do programa: Lote1_10.
 * Nome do programador: Fernando Luiz
 * Objetivo: Receba 2 números reais. Calcule e mostre a diferença dos custos desses valores.
 */
import javax.swing.JOptionPane;

public class Lote1_10 {

    public static void main(String args[]) {
        /*
        Double X,Y;

        X= Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de X "));
        Y= Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de Y"));
        X= (X*X)+(Y*Y);
        
        System.out.println("O valor da soma dos quadrados de X e Y é: "+X);
        */
        double x, y, sub;
        x = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de X: "));
        y = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de Y: "));
        
        sub = (x) - (y);
        
        System.out.println("O resultado de X - Y é: " +sub);
        JOptionPane.showMessageDialog(null, sub); 
    }
}