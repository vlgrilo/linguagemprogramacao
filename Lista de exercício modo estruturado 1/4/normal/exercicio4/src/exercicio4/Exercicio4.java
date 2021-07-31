/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        int i, n=8, num, res = 1;
        int  vetor[] = new int[n];
        
        Scanner scan = new Scanner(System.in);
        
         for(i = 0; i < 8; i++){
             
            System.out.printf("Informe%2d valor de %d para o vetor: ", (i+1),n);
            vetor[i]=i;            
            vetor[i] = scan.nextInt();
         }
         
         System.out.print("Digite o numero para verificar no vetor: ");
         num = scan.nextInt();
         
         for(i = 0; i < 8; i++){
             
             if(vetor[i] == num){
                 vetor[i]=i+1;
                 System.out.printf("Apossição do numero %d no vetor é %d\n", num, vetor[i]);
                 res=0;
             }
         }
         if(res!=0){
             System.out.println("Não existe esse numero no vetor");
         }
    }
    
}
