import java.util.Scanner;

public class Table
{
	public static void printMultiplicaionTable(int num)
	

	
	{
		for(int i = 1 ; i<11 ; i++ )
		{
			System.out.println(num + "x" + i + "=" + (num*i));
		}
		
	}


	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		printMultiplicaionTable(num);
	}	
}