import java.util.Scanner;

public class StringArray
{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String[] name = new String[4];
		System.out.print("Enter 4 names: ");
		 	
		for(int i = 0  ; i < 4 ; i++)
		{

			name[i] = sc.next();
			
		}
		 
		for ( String n : name)
		{
			System.out.println(n + " ");
		}		
			
	}		
}

	