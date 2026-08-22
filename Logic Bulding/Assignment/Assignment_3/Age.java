import java.util.Scanner;

public class Age{
	public static void checkAgeCategory(int age)
	{
	 	String results = ( age < 18) ? "minor" : (age < 65) ? "adult" : "senior citizen";
		System.out.println("Your a : " + results);
	
	
		
	}
 public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		
		checkAgeCategory(age);

	}
}