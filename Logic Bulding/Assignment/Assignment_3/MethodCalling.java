import java.util.Scanner;

public class MethodCalling
{

	static int SumOfTwoNumber(int a, int b)
	{

		int sum = a + b;
		return sum;

	}

		public static void main(String args[])
		{

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Number 1: ");
			int num1 = sc.nextInt();

			System.out.println("Enter Number 2: ");
			int num2 = sc.nextInt();
		

			System.out.println("Sum is : " + SumOfTwoNumber(num1,num2));

		

		}
}
	