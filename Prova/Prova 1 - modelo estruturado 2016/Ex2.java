//VICTOR GRILO, PEDRO, LUCAS NEVES

import java.util.*;

public class Ex2 {
   
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int x, y, sub=0, n=10;
        int vetorA[] = new int[n];
        int vetorB[] = new int[n];
        
        for(x = 0; x < 10; x++){
            
            System.out.printf("Informe %d valor para o vetor A: ", (x+1));       
            vetorA[x] = scan.nextInt();
                    
        }
        
        for(y = 0; y < 10; y++){
            
            System.out.printf("Informe %d valor para o vetor B: ", (y+1));       
            vetorB[y] = scan.nextInt();
                    
        }
        
        for(x = 0; x < 10; x++){
            
            for(y = 10; y >= 0; y--){
                
                if(x == y){
                    
                    sub = vetorA[x] - vetorB[y] + sub;
                    
                }
                
            }
            
        }
        
        System.out.print("Resultado: "+sub);
        
    }
}
