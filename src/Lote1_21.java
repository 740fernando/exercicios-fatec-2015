/*
 * Nome do programa: Lote1_21.
 * Nome do programador: Fernando Luiz
 * Objetivo:Receba 4 notas bimestrais de um aluno. 
 Calcule e mostre a média aritmética. Mostre a mensagem de acordo com a média:
 a.	Se a média for >= 6,0 exibir “APROVADO”;
 b.	Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
 c.	Se a média for < 3,0 exibir “RETIDO”.

 */

import javax.swing.JOptionPane;

public class Lote1_21 {

    public static void main(String args[]) {
        Float NB1, NB2, NB3, NB4, NF;

        NB1 = Float.parseFloat(JOptionPane.showInputDialog("Insira a 1º nota bimestral: "));
        NB2 = Float.parseFloat(JOptionPane.showInputDialog("Insira a 2º nota bimestral: "));
        NB3 = Float.parseFloat(JOptionPane.showInputDialog("Insira a 3º nota bimestral: "));
        NB4 = Float.parseFloat(JOptionPane.showInputDialog("Insira as 4º notas bimestral: "));
        NF = (NB1 + NB2 + NB3 + NB4) / 4;

        if (NF >= 6) {
            System.out.println("Nota final: "+NF+" - APROVADO ");
        } else {
            if (NF >= 3 || NF < 6) {
        
                System.out.println("Nota final: "+NF+" - EXAME");
            } else {
                System.out.println("Nota final: "+NF+" - REPROVADO ");
            }

            {

            }
        }

    }
}
