import java.util.Scanner;
import java.util.Arrays;

public class IndexArr
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	int[] number = new int[5];
	System.out.println("Enter 5 Numbers : ");
	
	for(int i = 0 ; i<5 ; i++)
	{
		number[i] = sc.nextInt();
	}
	Arrays.sort(number);
	System.out.println(" Sorted Array : " + Arrays.toString(number));
	

	System.out.println("Enter number to Search : ");
	int i = sc.nextInt();
	
	int index = Arrays.binarySearch(number, i);
	
	if (index >= 0)
	{
	 System.out.println("The Number" + i + " is found at index " + index);
	}
	else 
	{
	System.out.println("Not Found ");	
	}
	
	}
}



  

   