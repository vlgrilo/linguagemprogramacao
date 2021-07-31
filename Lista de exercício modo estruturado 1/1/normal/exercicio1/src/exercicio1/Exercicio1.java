/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a, b, c;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Entre com o 1 valor: ");
        a = scan.nextInt();
        System.out.print("Entre com o 2 valor: ");
        b = scan.nextInt();
        System.out.print("Entre com o 3 valor: ");
        c = scan.nextInt();
        
        if(a > b && a > c){
            System.out.println("Maior valor: "+a);
        }if(b > a && b > c){
            System.out.println("Maior valor: "+b);
        }if(c > a && c > b){
            System.out.println("Maior valor: "+c);
        }
    }
    
}
