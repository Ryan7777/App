import java.io.*;
public class A6_2
{
	public static void main(String a[])throws IOException
	{
		int i,j,k,max,maxindex=0;
		int A[] = {10,20,40,30,20};
		int B[][] = {{100,200,100,200,110},{200,100,100,200,100},{100,200,200,100,200}};
		int C[]=new int [3];
		max = C[0];
		for(i=0;i<B.length;i++)
		{
			for(j=0;j<B[i].length;j++)
			{
				C[i] += A[j]*B[i][j];
			}
			if(C[i]>max)
			{
				max=C[i];
				maxindex=i+1;
			}
			System.out.println("�P���"+(i+1)+"���~�Z�G"+C[i]+"�A�F����v�G"+((float)C[i]/100)+"%");
		}		
		System.out.println("\n�P���"+maxindex+"�㦳�̦n���~�Z");
	}
}