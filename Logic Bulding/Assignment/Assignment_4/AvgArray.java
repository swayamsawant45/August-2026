import java.util.Scanner;

public class AvgArray
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int[] number = new int[5];
		System.out.println("Enter 5 Numbers :");
		
		for(int i = 0 ; i < number.length ; i++)
		{
			number[i] = sc.nextInt();
	
		}
		int sum = 0;
		
		for (int n : number)
		{
		 sum = sum + n;
		}
		System.out.println("Sum is :" + sum);
		double avg = 0;
		
		avg = sum / number.length;
		System.out.println("Avrage is :" + avg);
	}

}