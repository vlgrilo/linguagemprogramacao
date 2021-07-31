
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Verifica {
    
    private String verificador;
    
    public void divisivel(){
        
        Scanner scan = new Scanner(System.in);
        int n;
        
        System.out.print("Entre com o numero: ");
        n = scan.nextInt();        
        
        if(n%2==0 && n%5==0 && n%10==0){
            verificador="Valido";
        }else{
            verificador="Invalido";
        }
    }
    
    public String getverifica(){
        return verificador;        
    }
    
}
