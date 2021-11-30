package lote_1;

/*
        * Nome do programa: exemplo switch case
        * Nome do programador: Fernando Luiz
        * Objetivo: algoritmo escolha
        */



import javax.swing.JOptionPane;
public class ex_switchcase{  
      
    public static void main(String args[]){
        int mes;
                
    mes=Integer.parseInt(JOptionPane.showInputDialog("insira o dia do mês"));
    switch(mes){
        case 12: System.out.println("verão");break;
        case 1: System.out.println("verão");break;
        case 2: System.out.println("verão");break;
        case 3: System.out.println("outono"); break;
        case 4: System.out.println("outono");break;
        case 5: System.out.println("outono");    break;
        case 6: System.out.println("inverno");    break;
        case 7: System.out.println("inverno");    break;
        case 8: System.out.println("inverno");break;
        case 9: System.out.println("primavera");break;
        case 10: System.out.println("primavera");
        break;
        case 11: System.out.println("primavera");break;    
        default: System.out.println("inválida");break;    
    }   
    
    
    
    
    
    
    }
    }
    
    