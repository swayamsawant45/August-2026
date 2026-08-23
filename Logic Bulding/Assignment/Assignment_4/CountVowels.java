import java.util.Scanner;

public class CountVowels
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter A String : ");
	String str = sc.nextLine();

	System.out.println("Entered String : " + str);

	int count = 0;
	
	for ( char n : str.toCharArray()) 
	{
		if (n == 'a' || n == 'e'|| n == 'i'|| n == 'o'|| n == 'u' || 
		    n == 'A' || n == 'E'|| n == 'I'|| n == 'O'|| n == 'U' )
				
		{
		 count = count + 1;
		}
	}
	System.out.print("The number of vowels in program " + count);
	}
}