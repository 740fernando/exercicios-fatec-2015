   /*
* Nome do programa: Lote1_28.
* Nome do programador: Fernando Luiz
* Objetivo:Receba o preço atual e a média mensal de um produto. 
Calcule e mostre o novo preço sabendo que:

Venda Mensal	   Preço Atual	    Preço Novo
    < 500              < 30	      + 10%
    >= 500 e < 1000    >= 30 e < 80    + 15%
    >= 1000	       >= 80	      - 5%
Obs.: para outras condições, preço novo será igual ao preço atual.

*/

import javax.swing.JOptionPane;

public class Lote1_31 {

public static void main(String args[]) {

Double PRECOATUAL,VENDAMENSAL,NOVOPRECO;


PRECOATUAL= Double.parseDouble(JOptionPane.showInputDialog("Insira o preço atual do produto: "));
while (PRECOATUAL<0){
    PRECOATUAL= Double.parseDouble(JOptionPane.showInputDialog("Insira o preço atual do produto: "));
    }

VENDAMENSAL= Double.parseDouble(JOptionPane.showInputDialog("Insira a média mensal: "));
while (VENDAMENSAL<0){
    VENDAMENSAL=Double.parseDouble(JOptionPane.showInputDialog("Insira a média mensal: "));
}

if  ((VENDAMENSAL<500)&& (PRECOATUAL<30)){
    NOVOPRECO=PRECOATUAL* 1.1;  
    JOptionPane.showMessageDialog(null,"O NOVO PREÇO SERÁ: "+NOVOPRECO);
}
if  ((VENDAMENSAL>=500)&&( VENDAMENSAL<1000)&& (PRECOATUAL>=30)&&(PRECOATUAL<80)){
    NOVOPRECO=PRECOATUAL* 1.15;  
    JOptionPane.showMessageDialog(null,"O NOVO PREÇO SERÁ: "+NOVOPRECO);
}
if  ((VENDAMENSAL>=1000) && (PRECOATUAL>=80)){
    NOVOPRECO=PRECOATUAL* 0.95;  
    JOptionPane.showMessageDialog(null,"O NOVO PREÇO SERÁ: "+NOVOPRECO);
}
else{
    JOptionPane.showMessageDialog(null,"O preço continuará o mesmo: "+ PRECOATUAL);
}
}


}
       
       

 