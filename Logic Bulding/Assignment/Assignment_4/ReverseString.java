import java.util.Scanner;

public class ReverseString
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Any String :");
	String str = sc.next();
	
	System.out.println("String Entered : " + str );

	String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--)
	{
            reversed = reversed + str.charAt(i);
        }
        System.out.println("Reversed string: " + reversed);


	}
}