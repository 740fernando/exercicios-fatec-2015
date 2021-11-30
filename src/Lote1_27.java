/*
        * Nome do programa: Lote1_27.
        * Nome do programador: Fernando Luiz
        * Objetivo:Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos). 
                   Calcule e mostre a velocidade média em km/h.
        */

        import javax.swing.JOptionPane;

        public class Lote1_27 {

        public static void main(String args[]) {

        Integer N,M;
        Double T, V;
        
        
       N= Integer.parseInt(JOptionPane.showInputDialog("Insira o número de voltas: "));
       while (N<0){
           N= Integer.parseInt(JOptionPane.showInputDialog("Insira o número de voltas: "));
       }
       M= Integer.parseInt(JOptionPane.showInputDialog("Insira a extensão do circuito(em metros): "));
       while (M<0){
           M= Integer.parseInt(JOptionPane.showInputDialog("Insira a extensão do circuito(em metros): "));
       }
       ;
       
       T= Double.parseDouble(JOptionPane.showInputDialog("Insira o tempo de duração(em minutos)"));
       while (T<0){
           T= Double.parseDouble(JOptionPane.showInputDialog("Insira o tempo de duração")); 
       }
       
       V=(M*N*60)/(T*1000);
       ;
       JOptionPane.showMessageDialog(null,"A velocidade média é : "+V+" KM/H");
        }
        }
