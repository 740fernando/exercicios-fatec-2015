    /*
    * Nome do programa: Lote1_32_mod(procedimento sem parâmtro).
    * Nome do programador: Fernando Luiz
    * Objetivo:Receba a data de nascimento e atual em ano, mês e dia. 
    Calcule e mostre a idade em anos, meses e dias, considerando os anos bissextos.

    */



    import javax.swing.JOptionPane;
    public class Lote1_33_mod{  
    static int DD,MM,AA,DA,MA,AF,DR,MR,AR;
    public static void main(String args[]){

    processar();    

    }   




    static void processar()
    {
    DD= Integer.parseInt(JOptionPane.showInputDialog("Insira o dia do seu aniversário: "));
    while ((DD<1)|| (DD>=31))
    {
        DD= Integer.parseInt(JOptionPane.showInputDialog("Insira o dia do seu aniversário: "));           
    }

    MM= Integer.parseInt(JOptionPane.showInputDialog("Insira o mês do seu aniversário"));
    while ((MM<1) || (MM>12))
    {
        MM= Integer.parseInt(JOptionPane.showInputDialog("Insira o mês do seu aniversário: "));           
    }
    AA= Integer.parseInt(JOptionPane.showInputDialog("Insira o ano do seu aniversário"));
    while ((AA<0)&& (AA<=99999))
    {
        AA= Integer.parseInt(JOptionPane.showInputDialog("Insira o ano do seu aniversário: "));           
    }


    DA= Integer.parseInt(JOptionPane.showInputDialog("Insira o dia atual: "));
    while ((DA<1)|| (DA>=31))
    {
        DA= Integer.parseInt(JOptionPane.showInputDialog("Insira o dia atual: "));           
    }


    MA= Integer.parseInt(JOptionPane.showInputDialog("Insira o mês atual"));
    while ((MA<1)|| (MA>12))        
    {
        MA= Integer.parseInt(JOptionPane.showInputDialog("Insira o mês atual"));           
    }


    AF= Integer.parseInt(JOptionPane.showInputDialog("Insira o ano atual"));
    while ((AF<0)|| (AF>=99999))             
    {
        AF= Integer.parseInt(JOptionPane.showInputDialog("Insira o ano atual"));           
    }

    if (DD>DA)
    {
        DR=DD-DA;
    }
    else
    {
        DR=DA-DD;
    }
    if (MM>MA)
    {
        MR=MM-MA;
    }
    else
    {
        MR=MA-MM;
    }
    if (AA>AF)
    {
        AR=AA-AF;
    }
    else
    {
        AR=AF-AA;            
    }
    for (int i = AA; i <=AF; i++) {
    if (i%4==0)
    {
        DR=DR+1;
    }
    }
    JOptionPane.showMessageDialog(null,"Sua idade é : "+AR+" anos "+ MR + " Mês "+ DR+" Dias");  

    }
    }

