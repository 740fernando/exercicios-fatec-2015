/*
        * Nome do programa: Lote1_42.
        * Nome do programador: Fernando Luiz
        * Objetivo: Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
                    Casa: 	1	2	3	4	...	64
                    Qte:	1	2	4	8	...	N

        */



import java.util.Objects;
import javax.swing.JOptionPane;
public class Lote1_42{  
      
    public static void main(String args[]){
        Double Qte;
    Qte=1.;    
        for (int i = 2; i <=64; i++) {
            Qte=Qte*2;
            System.out.println("A quantidade de "+i+" grãos contidos em um tabuleiro é: "+Qte);
        }
    }
    } 
    
        
  