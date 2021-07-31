/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class Exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i, cont=0, n=10;
        int  vetor[] = new int[n];
        
        Scanner scan = new Scanner(System.in);
        
        for(i = 0; i < 10; i++){
            System.out.printf("Informe%2d valor de %d: ", (i+1),n);
            vetor[i]=i;            
            vetor[i] = scan.nextInt();
            
            if(vetor[i]%5==0){
                cont = cont +1;
            }
        }
        
        System.out.println("Quantidade de numeros divisiveis por 5: "+cont);
    }
    
}
