/*
* Nome do programa: Lote1_28.
* Nome do programador: Fernando Luiz
* Objetivo:Receba o preço atual e a média mensal de um produto. 
Calcule e mostre o novo preço sabendo que:

Venda Mensal	   Preço Atual	    Preço Novo
< 500                  < 30	      + 10%
>= 500 e < 1000    >= 30 e < 80       + 15%
>= 1000                >= 80	      - 5%
Obs.: para outras condições, preço novo será igual ao preço atual.

*/

import javax.swing.JOptionPane;

public class Lote1_28_mod {

public static void main(String args[]) 
{

Double PRECOATUAL,VENDAMENSAL,NOVOPRECO;


PRECOATUAL= Double.parseDouble(JOptionPane.showInputDialog("Insira o preço atual do produto: "));
repeti1(PRECOATUAL);
    

VENDAMENSAL= Double.parseDouble(JOptionPane.showInputDialog("Insira a média mensal: "));
repeti2(VENDAMENSAL);
calc(VENDAMENSAL,PRECOATUAL);

        
            
}


static void repeti1(double PRECOATUAL)
{
if (PRECOATUAL<0)
{
    JOptionPane.showMessageDialog(null,"valor inválido");
        while (PRECOATUAL<0)
{
            PRECOATUAL= Double.parseDouble(JOptionPane.showInputDialog("Insira o preço atual do produto: "));   
}    
}
}
static void repeti2(double VENDAMENSAL)
{
 if (VENDAMENSAL<0)
{
    JOptionPane.showMessageDialog(null,"valor inválido");
    while (VENDAMENSAL<0)
{
        VENDAMENSAL= Double.parseDouble(JOptionPane.showInputDialog("Insira a média mensal: "));   
}    
}   
}
static void calc(double VENDAMENSAL, double PRECOATUAL)
{
double NOVOPRECO;
    if ((VENDAMENSAL<500) & (PRECOATUAL<30))
    {
    NOVOPRECO=PRECOATUAL*1.10;
    JOptionPane.showMessageDialog(null,"acréscimo 10% no valor: "+NOVOPRECO);
    }
    
    else if ((VENDAMENSAL>=500) &(VENDAMENSAL>=1000)&(PRECOATUAL>=30)&(PRECOATUAL<80))
    {
    NOVOPRECO=PRECOATUAL*1.15;
    JOptionPane.showMessageDialog(null,"acréscimo 15% no valor: "+NOVOPRECO);
    }
    else if ((VENDAMENSAL>=1000)&(PRECOATUAL>=80))
            { 
        NOVOPRECO=PRECOATUAL*0.95;
        JOptionPane.showMessageDialog(null,"DESCONTO DE 5%: "+NOVOPRECO);
            }
    else
        {
       JOptionPane.showMessageDialog(null,"O preço do produto continua o mesmo: "+PRECOATUAL);
        }
    
}
}