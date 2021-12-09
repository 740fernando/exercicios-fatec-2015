/*
        * Nome do programa: Lote1_27_modularizado(função e procedimento sem passagem de parâmetros).
        * Nome do programador: Fernando Luiz
        * Objetivo:Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos). 
                   Calcule e mostre a velocidade média em km/h.
        */

        import javax.swing.JOptionPane;

        public class Lote1_27_mod {
        static Integer N,M;
        static Double T=0.0 ; 
        public static void main(String args[]) {
            
           
        
        
       N= Integer.parseInt(JOptionPane.showInputDialog("Insira o número de voltas: "));
       
       M= Integer.parseInt(JOptionPane.showInputDialog("Insira a extensão do circuito(em metros): "));
       
       T= Double.parseDouble(JOptionPane.showInputDialog("Insira o tempo de duração(em minutos)"));
       
       JOptionPane.showMessageDialog(null,"A velocidade média é : "+calc(M,N,T)+" KM/H");
       
        }
       
       
        
static void repeti()
{
    while (N<0){
           N= Integer.parseInt(JOptionPane.showInputDialog("Insira o número de voltas: "));
       }
    while (M<0){
           M= Integer.parseInt(JOptionPane.showInputDialog("Insira a extensão do circuito(em metros): "));
       }
    while (T<0){
           T= Double.parseDouble(JOptionPane.showInputDialog("Insira o tempo de duração")); 
       }
    
}
        
        
static double calc(int a, int b, double c)
{
double V;
      V=(a*b*60)/(c*1000);
      return (V);  
}
        }