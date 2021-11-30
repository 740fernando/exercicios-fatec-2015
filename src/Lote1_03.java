
import javax.swing.JOptionPane;

/*
 * Nome do Programa: Lote1_3.
 * Nome do Programador: Reinaldo.
 * Objetivo: Calcular área do triângulo.
   comandos: entrada, operador aritimético e saída
 */

public class Lote1_03 {
    public static void main (String args[]){
        double b, h, a;
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da Base: "));
        h = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da Altura: "));
        a = (b * h)/2;
        System.out.println("A área do triângulo é: " +a);        
    }   
}