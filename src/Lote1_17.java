/*
 * Nome do programa: Lote1_17.
 * Nome do programador: Fernando Luiz
 * Objetivo:Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. 
Receber o tempo de percurso e a velocidade média.
 */

import javax.swing.JOptionPane;

public class Lote1_17 {

    public static void main(String args[]) {
     double L,T,V;

        T = Double.parseDouble(JOptionPane.showInputDialog("Insira o tempo gasto na viagem em horas: "));
        V = Double.parseDouble(JOptionPane.showInputDialog("Insira a velocidade do veículo em Km/h "));
        
        

        L=(V*T)/12;
        System.out.println("A quantidade de combustível gasto foi: "+L+" LITROS");
    }
}
