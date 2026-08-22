import java.util.Scanner;

public class Sum
{
	public static void calculateSum(int start, int end)
	{
	
		
		int sum = 0; //1,3,6,10,15
		for(int i=start; i<=end; i++)
		{
			sum = sum + i;
			
		}
		System.out.println(sum);
	}
		
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to start : ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter a to end : ");
		int num2 = sc.nextInt();

	
		calculateSum(num1,num2);
	}
		
	
}


// 1,2,3,4,5=1+2+3+4+5=15