import java.io.*;
public class Bomb_num
{
	public static void main(String A[])throws IOException
	{
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		int Bomb;
		Bomb = (int)(Math.random()*100+1);
		System.out.println("�׷��K�X:"+Bomb);
		System.out.println("�׷��K�X1~100:");

		String s;
		int num=10, min=1, max=100;
		while(Bomb != num)
		{
			num = 0;
			s=buf.readLine();
			num=Integer.parseInt(s);
			if(num<=min || num>=max)
			{
				System.out.println("�Э��s��J�G"+min+"~"+max+":");
			}
			else if(num > Bomb)
			{
				max = num;
				System.out.println("�׷��K�X"+min+"~"+max+":");
			}
			else if(num < Bomb)
			{
				min = num;
				System.out.println("�׷��K�X"+min+"~"+max+":");
			}
			else if(Bomb == num)
			{
				System.out.println("GAME OVER!!!");
				break;
			}
		}
	}
}