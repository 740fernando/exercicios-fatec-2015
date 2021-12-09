    /*
* Nome do programa: Lote1_36.
* Nome do programador: Fernando Luiz
* Objetivo: Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N
    */



import javax.swing.JOptionPane;
public class Lote1_36_mod
{  


public static void main(String args[]){
double x;

x= Double.parseDouble(JOptionPane.showInputDialog("Insira um  número inteiro: "));
calc(x);
}       



static void calc(double x)
{
double resultado=1;

for(double i=2  ; i <= x; i++){
    resultado=resultado+(1/i);
        System.out.println("O resultado dessa série é: "+ resultado);
}
}
}