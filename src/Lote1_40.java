/*
        * Nome do programa: Lote1_40.
        * Nome do programador: Fernando Luiz
        * Objetivo: Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N’nésimo termo.
        */



import javax.swing.JOptionPane;
public class Lote1_40{  
      
    public static void main(String args[]){
        int x,An,At,F;
        
    x= Integer.parseInt(JOptionPane.showInputDialog("Insira um  número para sequência Fibonacci: "));
    while (x<0) x= Integer.parseInt(JOptionPane.showInputDialog("Insira um  número para sequência Fibonacci: "));  
    An=0;
    At=1;
    System.out.println("A sequência de Fibonacci é: "+At);
    for(int i =2 ; i <= x; i++){
        F=At+An;
        System.out.println(F);
        An=At;
        At=F;



                    }       
                    }
                    }





