  /*
        * Nome do programa: Lote1_26_mod (procedimento com parâmetros)
        * Nome do programador: Fernando Luiz
        * Objetivo: Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.

        */

        import javax.swing.JOptionPane;

        public class Lote1_26_mod {

        public static void main(String args[]) {

        Integer x,y;
        
        
       x= Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor: "));
       y= Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor: "));
       exibir(x,y);
        }
        
static void exibir(int x, int y)
{
 
    if  ((x==0)||(y==0))
        {
           System.out.println("0 é múltiplo de 0");
        
        }
       if (x%y==0)
        {
           JOptionPane.showMessageDialog(null,"O número "+x+" é múltiplo de "+y);
        }
        else if (y%x==0)
           {
           JOptionPane.showMessageDialog(null,"O número "+y+" é múltiplo de "+x);
           }
                else
           {
                   JOptionPane.showMessageDialog(null,"Nenhum número múltiplo");
           }
           }
        }          