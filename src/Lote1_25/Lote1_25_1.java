import javax.swing.JOptionPane;

/*
 * Nome do Programa: Lt1_ex24
 * Nome do Programador: Danilo
 * Objetivo: descobrir duração de uma partida de futebol.
 */

public class Lote1_25_1 {
    public static void main (String arga []){
        double HI,MI,HF,MF,HT,MT;
        HI = Double.parseDouble(JOptionPane.showInputDialog ("digite a hora inicial do jogo :"));
        MI = Double.parseDouble(JOptionPane.showInputDialog ("digite o minuto inicial do jogo :"));
        HF = Double.parseDouble(JOptionPane.showInputDialog ("digite a hora final do jogo :"));
        MF = Double.parseDouble(JOptionPane.showInputDialog ("digite o minuto final do jogo :"));
        
        if ( HI < HF )
                { 
                   HT = HF - HI;
                }
        else
                {
                   HT = (24 -HI) + HF; 
                }
            if (MI < MF )
                {
                   MT = MF - MI;
                }
            else
                {
                   MT = (60 - MI)+ MF ;        
                }
             System.out.println("a hora final do jogo foi  :"+ HT);
             System.out.println("os minutos finais do jogo foram :"+ MT);
        
        
    }
}
