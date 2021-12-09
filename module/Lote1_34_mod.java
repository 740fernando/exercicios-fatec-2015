        /*
        * Nome do programa: Lote1_34.
        * Nome do programador: Fernando Luiz
        * Objetivo:Calcule e mostre o quadrado dos números entre 10 e 150.
        */





public class Lote1_34_mod{  
      
    public static void main(String args[]){
        Integer x=0;
        
        processar(x);
    } 
     static void processar(int x)
     {        
        for (int i = 1; i <= 150; i++) {
            x=i*i;
        System.out.println(x+" a raiz quadrada é "+i);
     }    
    }  
}  

    
