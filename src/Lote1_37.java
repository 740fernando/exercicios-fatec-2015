/*
        * Nome do programa: Lote1_37.
        * Nome do programador: Fernando Luiz
        * Objetivo: Receba um número. Calcule e mostre os resultados da tabuada desse número.
        */



import javax.swing.JOptionPane;
public class Lote1_37{  
      
    public static void main(String args[]){
        Integer x,resultado,s;
        
    x= Integer.parseInt(JOptionPane.showInputDialog("Insira um  número inteiro: "));
    resultado=1;    
    for(int i =1 ; i<=x; i++){
               resultado=x*i;
               
        System.out.println("A tabuada do número: "+x+" : "+ resultado);    
        
        }
            
            
            
            
            }
            
        }
    
