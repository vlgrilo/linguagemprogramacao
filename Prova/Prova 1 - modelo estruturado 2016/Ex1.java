import java.util.*;

public class Primo
{
    public static void main (String args[])
    {
        int i, n, count;
        count = 0;
        Scanner x = new Scanner (System.in);
        
        System.out.println("Digite um numero inteiro");
        n = x.nextInt();
        
       for (i = 1; i <= n; i++)
       {
           if (n % i == 0) 
            {
               count ++;
            }
           
       }
           if (count <=2)
           {
               System.out.println ("O numero e primo");
           }
           
           else 
           {
               System.out.println ("O numero nao e primo");
           }           
    }
    }
