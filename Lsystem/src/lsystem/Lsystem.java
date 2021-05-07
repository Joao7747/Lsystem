package lsystem;

import java.util.Scanner;

public class Lsystem {

   // JOAO GUILHERME CABRAL RAMOS CESAR / RA: 082180011
    
    public static void main(String[] args) {
        
        String axioma = "A";
        String corrente = axioma;
        int contador = 0;
        boolean validacao = false;
        Scanner ler = new Scanner(System.in);
        
        do{
        System.out.println("Deseja gerar uma nova geração? S/N");
        String resp = ler.next();
        
        if(resp.equals("S"))
        {
            contador++;
            corrente = NovaGeracao(corrente);
            System.out.println("Geração "+ contador + ": " + corrente);
            validacao = false;
        }
        else
        {
            validacao = true;
        }
        
        }while(validacao == false);
    }
    
    public static String NovaGeracao(String corrente)
    {
        StringBuffer next = new StringBuffer();
        
        for(int i=0; i<corrente.length();i++)
        {
            char c = corrente.charAt(i);
            if(c == 'A'){
                next.append("ABA");
            }
            else if(c == 'B'){
            next.append("BBB");
            }
        }
        
        corrente = next.toString();
        
        return corrente;
    }
    
}
