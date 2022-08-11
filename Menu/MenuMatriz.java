package Menu;

import java.util.*;

public class MenuMatriz {

	public static void main(String[] args)
	{
		int m1,m2,v,op;
		float[][] matriz1 = new float[2][2];
		float[][] matriz2 = new float[2][2];
		float[][] matriz3 = new float[2][2];
		
		Scanner leia = new Scanner(System.in);
		
		for(m1=0; m1<2; m1++)
		{
			for(m2=0; m2<2; m2++)
			{
				System.out.println("\nDigite os valores da Matriz1: ");
				matriz1[m1][m2] = leia.nextFloat();
				System.out.println("\nDigite os valores da Matriz2: ");
				matriz2[m1][m2] = leia.nextFloat();
			}
		}
		
		do {
			
			System.out.println("\n\t\tMenu de Matrizes");
			System.out.println("\n1- Somar as duas matrizes");
			System.out.println("\n2- Subtrair a primeira matriz da segunda matriz");
			System.out.println("\n3- Adicionar uma constante as duas matrizes");
			System.out.println("\n4- Imprimir as matrizes");
			System.out.println("\n0- Sair do programa");
			System.out.println("\nDigite a sua opção:");
			op = leia.nextInt();
			
			switch(op) {
			
			case 1:
				for(m1=0; m1<2; m1++)
				{
					for(m2=0; m2<2; m2++)
					{
						matriz3[m1][m2] = matriz1[m1][m2] + matriz2[m1][m2];
						System.out.println("\nSoma: "+matriz3[m1][m2]);
					}
				}
				break;
				
			case 2:
				for(m1=0; m1<2; m1++)
				{
					for(m2=0; m2<2; m2++)
					{
						matriz3[m1][m2] = matriz2[m1][m2] - matriz1[m1][m2];
						System.out.println("\nDiferença: "+matriz3[m1][m2]);
					}
				}
				break;
				
			case 3:
				        System.out.println("\nLeia um número: ");
				        v = leia.nextInt();
				
				for(m1=0; m1<2; m1++)
				{
					for(m2=0; m2<2; m2++)
					{
						matriz1[m1][m2] += v;
						matriz2[m1][m2] += v;
						
						System.out.println("\nMatriz1 mais o número: "+matriz1[m1][m2]);
						System.out.println("\nMatriz2 mais o número: "+matriz2[m1][m2]);
					}
				}
				break;
				
			case 4:
				for(m1=0; m1<2; m1++)
				{
					for(m2=0; m2<2; m2++)
					{
						System.out.println("\nMatriz1: "+matriz1[m1][m2]);
						System.out.println("\nMatriz2: "+matriz2[m1][m2]);
					}
				}
				break;
				
			case 0:
				System.out.println("\nTHE END");
				break;
				
				default:
					System.out.println("\nOpção inválida");
			}
		}
		while(op!=0);
	}
}