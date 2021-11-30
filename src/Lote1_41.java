/*
        * Nome do programa: Lote1_41.
        * Nome do programador: Fernando Luiz
        * Objetivo: Receba 100 números inteiros reais. Verifique e mostre o maior e o menos valor. Obs.: somente valores positivos.
        */



import java.util.Objects;
import javax.swing.JOptionPane;
public class Lote1_41{  
      
    public static void main(String args[]){
        Double x,y;
        
        for (int i = 0; i < 100; i++) {
            
        
    
      x= Double.parseDouble(JOptionPane.showInputDialog(" Insira o primeiro número : "));
      y= Double.parseDouble(JOptionPane.showInputDialog(" Insira o segundo número : "));
    
    if (x>y){ System.out.println (" O maior número é "+x+" , o menor número é: "+y);}
    else if (x<y) System.out.println("O maior número é "+y+", o menor número é: "+x); 
    else if (Objects.equals(y, x)) System.out.println("Os números são iguais");
    
    }
    } 
    }
        
  









    
