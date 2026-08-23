import java.util.Scanner;

public class SpecificElementArr
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int[] number = new int[5];
		System.out.println("Enter 5 Numbers : ");

		for(int i = 0 ; i<5 ; i++)
		{
			number[i]=sc.nextInt();
		}
		
		
		System.out.println("Enter a number Which you want to Search in Array");
		int num = sc.nextInt();

		for (int n : number)
		{
			if(num == n)	
			{
			System.out.println("found");
			}
				
		}
		
	
	}


}
