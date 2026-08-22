import java.util.Scanner;

public class doWhile
{
	public static void askForPositiveNumber()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		
		int num = sc.nextInt();

		do{
	           System.out.println("Enter Positive Number :");
		   num = sc.nextInt();
		  }
		while(num < 0);
		
		System.out.println("you have enterd a postive Number: ");
	}
	public static void main(String args[])
	{
		askForPositiveNumber();	
	}
}
