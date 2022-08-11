package vetor;

import java.util.*;

public class vetor1
{
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		
		int n, nP1=0, nP2=0, nP3=0, nI=0, somaNP=0, quantNI=0;
		int [] vetor = new int[3];
			
		for (n=0; n<3; n++)
		{
			System.out.println("\nDigite um número: ");
			vetor [n] = leia.nextInt();	
			
			if(vetor [n] % 2 == 0)
			{
		       somaNP += vetor [n];
			}
			else
			{
				  quantNI++;
			}
		}
    	        System.out.println("\nSoma dos números pares: "+somaNP);
                System.out.println("\nQuantidade de números ímpares: "+quantNI);
    			System.out.println("\nNúmeros pares digitados: ");
    			System.out.println("\nNúmeros ímpares digitados: ");
	}
}