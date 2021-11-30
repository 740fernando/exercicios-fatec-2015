/*
        * Nome do programa: Lote1_38.
        * Nome do programador: Fernando Luiz
        * Objetivo: Receba 2 números inteiros, verifique qual o maior entre eles. 
                    Calcule e mostre o resultado da somatória dos números ímpares entre esses valores.
        */




import javax.swing.JOptionPane;
public class Lote1_38{  
      
    public static void main(String args[]){
                int x,y,resultado;

    x= Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro  número inteiro: "));
    y= Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo número inteiro: "));    
    
    
    if (x>y){ JOptionPane.showMessageDialog(null,"O primeiro valor ("+x+") digitado é maior que o segundo valor ("+y+")");
        }
    else{  
        JOptionPane.showMessageDialog(null,"O segundo valor ("+y+") digitado é maior que o primeiro valor ("+x+")");
        }    
    
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= y; j++) {
                if ((i%2!=0)&(j%2!=0)){
                    resultado=i+j;
                    System.out.println("A soma dos nº ímpares: "+i+","+j+" é : "+resultado);
        }
        }
        }
        }
        }

            
            
            
      


            
                
        
       
    
