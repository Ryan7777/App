public class sale
{
	public static void main(String args[])
	{
		int i,j;
		int A[] ={10,20,40,30,20};
		int B[][]={{100,200,100,200,110},
					{200,100,100,200,100},
					{100,200,200,100,200}};
		int sum[] = new int[3];
		int max=sum[0],maxindex=0;
		System.out.print("���~����: "+"\t");
		for(i=0;i<A.length;i++)
		{
			System.out.print(A[i]+"\t");
		}
		System.out.println();
		for(i=0;i<B.length;i++) 
		{
			System.out.print("�P���"+(i+1)+"���P��q: ");
			for(j=0;j<B[i].length;j++)
			{
				System.out.print(B[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		for(i=0;i<B.length;i++)
		{
			for(j=0;j<A.length;j++)
			{
				sum[i] += A[j]*B[i][j];
			}
			if(sum[i]>max)
			{
				max=sum[i];
				maxindex=i+1;
			}
			System.out.println("�P���"+(i+1)+"���~�Z:"+sum[i]+" , �F����v:"+((sum[i]/(float)10000)*100+"%"));
		}
		System.out.println(); 
		System.out.println("�P���"+maxindex+"�㦳�̦n���~�Z");
		System.out.println();
	}
}