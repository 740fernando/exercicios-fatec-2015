/*
        * Nome do programa: Lote1_29.
        * Nome do programador: Fernando Luiz
        * Objetivo:Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento. 
                   Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%. 
                   Demais tipos não serão considerados.

        */

        import javax.swing.JOptionPane;

        public class Lote1_29 {

        public static void main(String args[]) {

        Double POUPANCA,RENDAFIXA;
        int x;
        
        x = Integer.parseInt(JOptionPane.showInputDialog("1 -Poupança \n2- Renda Fixa "));
        switch(x)
        {
            case 1: POUPANCA=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de depósito na poupança"));
                    POUPANCA=POUPANCA*1.03;
                    JOptionPane.showMessageDialog(null,"O valor corrigido na poupança será "+POUPANCA);
                    break;
            
            case 2: RENDAFIXA=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de depósito na Renda Fixa"));
                    RENDAFIXA=RENDAFIXA*1.05;
                    JOptionPane.showMessageDialog(null,"O valor corrigido na poupança será "+RENDAFIXA); 
                    break;
            default:JOptionPane.showMessageDialog(null,"inválido");
        }
        }
        }
        
     
       
           
       

 