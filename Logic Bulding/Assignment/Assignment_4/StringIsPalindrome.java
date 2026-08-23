import java.util.Scanner;

public class StringIsPalindrome
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String : ");
	String str = sc.nextLine();
	
	System.out.println("Enterd Strings : " + str);
	
	String reverse = "";
 
	for(int i = str.length() - 1 ; i >= 0; i-- )
	{
		reverse = reverse + str.charAt(i);
	}
	if (reverse.equals(str)) // if (reverse == str) (== check ref & .equals checks actual content) 
	{
	System.out.println("The String '" + str + "' is a palindrome." );
	}
	
	}
}