package matriz;

import java.util.*;

public class matriz1
{
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		
		float[] [] matriz = new float [3] [3];
		int v1, v2, somaV=0;
		
		for(v1=0; v1<3; v1++)
		{
			for(v2=0; v2<3; v2++)
			{
				System.out.println("\nDigite um valor: ");
				 matriz[v1] [v2] = leia.nextInt();
				 
				 if(matriz[v1] [v2] > 10)
				 {
					 somaV++;
				 }
			}
		}
	                	System.out.println("\nQuantidade de valores maiores que 10: "+somaV);
	}
}
