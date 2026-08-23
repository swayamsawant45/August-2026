import java.util.Scanner;

public class SumArray
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int[] sum = new int [5];
		System.out.println("Enter 5 number");

		for(int i=0 ; i<5 ; i++)
		{
			sum[i] = sc.nextInt();
		}
		
		int add = 0;    //10 20 30 40 50
		
		for(int i : sum )
		{
		add = add + i;
		}
		
		System.out.println("Sum is :" + add);

	
	}
}