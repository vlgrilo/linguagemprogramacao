import java.util.*;

public class Ex3{
    
    public static void main (String[] args){
        
        int[] pontuacao = new int[20];
        int cont=0, i;
        
        Scanner x = new Scanner (System.in);
        
        for (i=0;i<=19;i++){
            System.out.printf ("\nPontuacao: ");
            pontuacao[i] = x.nextInt();
        }
        for (i=0;i<=19;i++){
            if (pontuacao[i]>70){
                System.out.printf ("\nO colocado na posicao " + i + " fez mais de 70 pontos");
            }
        }
    }
}
        
        