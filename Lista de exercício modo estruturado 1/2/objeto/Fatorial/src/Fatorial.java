import java.util.*;

public class Fatorial{
    
    private int valor_fatorial;
    
    public int calculafat(){
        
        int i, fator=1;
        int num;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        num = scan.nextInt();
        
        for(i=1; i<=num; i++){
            fator=fator*i;
        }
        
        valor_fatorial = fator;
        
        return(valor_fatorial);
        
    }
    
}