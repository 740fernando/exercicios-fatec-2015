        /*
        * Nome do programa: Lote1_35_mod(função).
        * Nome do programador: Fernando Luiz
        * Objetivo: Receba um número inteiro. Calcule e mostre o seu fatorial.
        */



import javax.swing.JOptionPane;
public class Lote1_35_mod{  
      
    public static void main(String args[]){
        Integer x,r;
        
    x= Integer.parseInt(JOptionPane.showInputDialog("Insira um  número inteiro: "));
     calc(x);  
        System.out.println("!"+x+" = "+calc(x));    
    }

static int calc(int a)
{
int r=1;    

     if (a==0)
            {
            System.out.println("Fatorial de 0 é = 1");
            }
        else
            {
        for(int i = 1;i <= a; i++)
            {
            r = r * i;
            
            }
            }
            return r;
}
}            
            

            
            