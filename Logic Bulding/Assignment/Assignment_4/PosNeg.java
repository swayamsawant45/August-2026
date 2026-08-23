 import java.util.Scanner;

public class PosNeg
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int[] num = new int[6];
		System.out.println("Enter 6 number : ");
		
		for(int i = 0 ; i<num.length ; i++)
		{
			num[i] = sc.nextInt();
		}
		

		int posCount = 0;
		int negCount = 0;

		for (int m : num)
		{
			if(m>0)
			{
			 posCount = posCount + 1;
			 
			}
			else
			{
			negCount = negCount + 1;
			
			}
			
		}

		System.out.println("Positive Numbers : " + posCount);		
		System.out.println("Negative Number : " + negCount);
	}
}