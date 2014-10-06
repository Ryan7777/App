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
		System.out.print("產品價格: "+"\t");
		for(i=0;i<A.length;i++)
		{
			System.out.print(A[i]+"\t");
		}
		System.out.println();
		for(i=0;i<B.length;i++) 
		{
			System.out.print("銷售員"+(i+1)+"的銷售量: ");
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
			System.out.println("銷售員"+(i+1)+"的業績:"+sum[i]+" , 達成比率:"+((sum[i]/(float)10000)*100+"%"));
		}
		System.out.println(); 
		System.out.println("銷售員"+maxindex+"具有最好的業績");
		System.out.println();
	}
}