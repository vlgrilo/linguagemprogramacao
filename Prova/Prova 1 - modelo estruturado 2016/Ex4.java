import java.util.*;

public class Ex4{
    
    public static void main (String[] args){
        
        int idade=0, idademaior=0, idademenor=0;
        
        Scanner x = new Scanner (System.in);
        do{
            System.out.printf ("\nInsira uma idade: ");
            idade = x.nextInt();
            if (idade<=21 && idade>0){
                idademenor++;
            }
            if (idade>=50 && idade>0){
                idademaior++;
            }
        }while (idade!=0);
        System.out.printf ("\nNumero de idades menores que 21: " + idademenor);
        System.out.printf ("\nNumero de idades maiores que 50: " + idademaior);
        }
    }    
    