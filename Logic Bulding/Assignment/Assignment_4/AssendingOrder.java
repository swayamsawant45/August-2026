import java.util.Scanner;
import java.util.Arrays;

public class AssendingOrder
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int[] number = new int[5];
		System.out.println("Enter 5 Number");
		
		for(int i = 0 ; i<5 ; i++)
		{
		number[i] = sc.nextInt();
		}
		
		Arrays.sort(number);
		System.out.println(Arrays.toString(number));
		
	}
}