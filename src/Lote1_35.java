/*
        * Nome do programa: Lote1_35.
        * Nome do programador: Fernando Luiz
        * Objetivo: Receba um número inteiro. Calcule e mostre o seu fatorial.
        */



import javax.swing.JOptionPane;
public class Lote1_35{  
      
    public static void main(String args[]){
        Integer x,r;
        r=1;
    x= Integer.parseInt(JOptionPane.showInputDialog("Insira um  número inteiro: "));
        if (x==0){
            System.out.println("Fatorial de 0 é = 1");
        }
        else{
        for(int i = 1;i <= x; i++){
                
                r = r * i;
        System.out.println("!"+x+" = "+r);    
        }
        }    
            
            
            
            }
            
        }
    


    