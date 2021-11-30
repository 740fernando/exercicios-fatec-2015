    /*
    * Nome do programa: Lote1_24.
    * Nome do programador: Fernando Luiz
    * Objetivo:Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.

    */

    import javax.swing.JOptionPane;

    public class Lote1_24
{

    public static void main(String args[])
    {
        int x;
        x = Integer.parseInt(JOptionPane.showInputDialog("Insira o número: "));
        if ((x % 3 == 0) && (x % 2 == 0))
        {
            JOptionPane.showMessageDialog(null, "O número: " + x + " é divisível por 2 e 3");
        }
        else if (x % 3 == 0)
        {
            JOptionPane.showMessageDialog(null, "O número: " + x + " é divisível por 3");
        }
        else if (x % 2 == 0)
        {
            JOptionPane.showMessageDialog(null, "O número: " + x + " é divisível por 2");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "o número não é divísivel por 2 e 3");
        }

    }
}