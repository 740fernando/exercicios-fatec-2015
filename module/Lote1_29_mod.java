/*
        * Nome do programa: Lote1_29_mod( função).
        * Nome do programador: Fernando Luiz
        * Objetivo:Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento. 
                   Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%. 
                   Demais tipos não serão considerados.

        */

        import javax.swing.JOptionPane;

        public class Lote1_29_mod{

        public static void main(String args[]) {
        int x;
        double POUPANCA, RENDAFIXA;
        
        
        
        x = Integer.parseInt(JOptionPane.showInputDialog("1 -Poupança \n2- Renda Fixa "));
        switch(x)
        {
            case 1: POUPANCA=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de depósito na poupança"));
                    calc1(POUPANCA);
                    JOptionPane.showMessageDialog(null,"O valor corrigido na poupança será "+calc1(POUPANCA));
                    break;
            
            case 2: RENDAFIXA=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de depósito na Renda Fixa"));
                    calc2(RENDAFIXA);
                    JOptionPane.showMessageDialog(null,"O valor corrigido na poupança será "+calc2(RENDAFIXA)); 
                    break;
            default:JOptionPane.showMessageDialog(null,"inválido");
        }
        }
        
        static double calc1(double POUPANCA)
        {
        double poup;
        poup=POUPANCA*1.03;
        return poup;
        }
        
        static double calc2(double RENDAFIXA)
        {
        double renda;
        renda=RENDAFIXA*1.05;
        return renda;
        }
        }