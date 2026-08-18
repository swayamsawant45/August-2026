import java.util.Scanner;
public class PositiveNumber{

	public static void main(String args[]){

	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter your number: ");
	int number = scanner.nextInt();


	if(number>=0){
	      System.out.println("number is positive");
	}
	else{
	      System.out.println("number is not positive");

	}

}

}
	