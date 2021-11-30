/*
        * Nome do programa: Lote1_30.
        * Nome do programador: Fernando Luiz
        * Objetivo: Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos). 
                    Calcule e mostre a velocidade média em km/h.

        */

        import javax.swing.JOptionPane;

        public class Lote1_30 {

        public static void main(String args[]) {

        Double NUMVOLTAS,METROS, MINUTOS,KMH;
        
        
        NUMVOLTAS= Double.parseDouble(JOptionPane.showInputDialog("Insira o número de voltas "));
        while (NUMVOLTAS<0)
        {
            NUMVOLTAS= Double.parseDouble(JOptionPane.showInputDialog("Insira o número de voltas "));   
        }
        
        
        METROS= Double.parseDouble(JOptionPane.showInputDialog("Insira a extensão do circuito( em metro)"));
        while (METROS<0)
        {
            METROS= Double.parseDouble(JOptionPane.showInputDialog("Insira a extensão do circuito( em metro)"));   
        }
        
        MINUTOS=Double.parseDouble(JOptionPane.showInputDialog("Insira o tempo de duração( em minutos)"));
        while (MINUTOS<0)
        {
            MINUTOS= Double.parseDouble(JOptionPane.showInputDialog("Insira o tempo de duração( em minutos)"));   
        }
        
        KMH=(NUMVOLTAS*METROS*60)/(MINUTOS*1000);
        
        JOptionPane.showMessageDialog(null,"A velocidade média é: "+KMH+" Km/h ");
        }
        }

        
        
        
        
        