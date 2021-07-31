/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, valor =1;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Entre com o numero a ser fatorado: ");
        x = scan.nextInt();
        
        for( ; x>0; x--){
            valor= valor * x;            
        }
        
        System.out.println("Valor fatorado: "+valor);
    }
    
}
