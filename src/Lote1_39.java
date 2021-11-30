/*
        * Nome do programa: Lote1_39.
        * Nome do programador: Fernando Luiz
        * Objetivo: 39.	Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!
        */




import javax.swing.JOptionPane;
public class Lote1_39{  
      
    public static void main(String args[]){
        double x,resultado;
        
    x= Double.parseDouble(JOptionPane.showInputDialog("Insira um número "));
    while (x<0) x= Double.parseDouble(JOptionPane.showInputDialog("Insira um número "));    
     resultado=1;
        for (double i = 1; i <=x; i++) {
            resultado=resultado+(1/(x*(x-i)));
            System.out.println("o resultado da série é :"+resultado);
                    }
                }
            }
