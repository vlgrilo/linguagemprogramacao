import java.util.*;

public class Ex5{
    
    public static void main (String[] args){
        
        Scanner x = new Scanner (System.in);
        
        int cidades[] = new int[15];
        int veiculos[] = new int[15];
        int acidentes[] = new int[15];
        int i, numtotal_acid=0, numero_max=0, cidadetot=0, a=0, cidade = 0, variavelfinal;        
        
        for (i=0;i<=3;i++){
            
            System.out.printf("Cidade Numero: " +(i+1));
            System.out.printf("\nNumero de veiculos de passeio (ano 2015): ");
            veiculos[i] = x.nextInt();
            
            System.out.printf ("Numeros de acidentes (ano 2015): ");
            acidentes[i] = x.nextInt();
            System.out.printf("\n");
            
            if (veiculos[i]<15000){
                
                cidadetot++;
                a = acidentes[i] + a;
                
            }
        }
        
        for (i=0;i<=3;i++){
            
            numtotal_acid = numtotal_acid + acidentes[i];
            
        }
        
        System.out.printf ("\nNumero total de acidentes: " + numtotal_acid);
        
        for (i=0;i<=3;i++){
            
            if (acidentes[i] > numero_max){
                
                numero_max = acidentes[i];
                
            }
            
        }
        
        for (i=0;i<=3;i++){
            
            if (acidentes[i] == numero_max){
                
                cidade = i+1;
                
            }
            
        }
        
        System.out.printf ("\nA cidade com maior indice de acidentes é cidade %d que teve %d acidentes", cidade, numero_max);
        
        variavelfinal = a/cidadetot;
        System.out.printf ("\nMedia de acidentes de transitos em cidades com menos de 1500 veiculos: %.0f\n ", variavelfinal);
        
    }
    
}
        