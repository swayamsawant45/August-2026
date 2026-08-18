import java.util.Scanner;

public class AvrageMarks
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks of 3 Subject : ");
		int Maths = sc.nextInt();
		int Science = sc.nextInt();
		int History = sc.nextInt();


	 	double avg = (Maths+Science+History)/3;
		System.out.println("Avreage is : "+avg);

		if(avg >=90){

				System.out.println("Grade A");
 		            }

		else if ( avg >=70 & avg <90){
						System.out.println("Grade B");
					     }
		else if ( avg >=50 & avg <70){
						System.out.println("Grade C");
					     }

		else if ( avg >=30 & avg <50){
						System.out.println("Grade D");
			 	             }

		else {
			System.out.println("FAIL");
		     }
	
	}
}
