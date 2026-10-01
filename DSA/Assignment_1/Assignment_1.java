import java.util.ArrayList;
import java.util.Scanner;

public class Assignment_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] arr = {15,8,23,4,19,7};
		
		int min =arr[0] ;
		int max = arr[0];
		
		
		for(int i = 0; i<arr.length;i++) 
		{
			if(arr[i] < min) 
			{
				min = arr[i];
			}
			if(arr[i] > max) 
			{
				max = arr[i];
			}
			
		}
		System.out.println("Minimum : "+min );
		System.out.println("Maximum : "+max);
		
		
		int [] arr1 = {12,5,8,20,15,20,7};
		
		int secondLargest = 0;
		
		int maxi = 0;
		for(int i = 0;i<arr1.length;i++) 
		{
			if( arr1[i] > maxi) 
			{
				secondLargest =maxi;
				maxi = arr1[i];
			}
			
			if(arr1[i] > secondLargest && arr1[i] != maxi) 
			{
				secondLargest = arr1[i];
			}
		}
		System.out.println("Second Largest = "+ secondLargest);
		
		
		
		int [] zero = {0,5,0,3,8,0,2};
		int j =0;
		
		
		for(int i= 0; i<zero.length;i++) 
		{
			if(zero[i] != 0) 
			{
				int temp = zero[i];
				zero[i] = zero[j];
				zero[j] = temp;
				
				j++;
	
			}
			
		
		
		}
		for(int i : zero) {
			System.out.println(i);
		}
		
		

        ArrayList<Integer> queue = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n===== Student Queue Management =====");
            System.out.println("1. Add Student");
            System.out.println("2. Submit Assignment");
            System.out.println("3. Search Student");
            System.out.println("4. Display Queue");
            System.out.println("5. Count Students");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();

                    queue.add(id);

                    System.out.println("Student " + id + " added to the queue.");
                    break;

                case 2:
                    if (queue.isEmpty()) {
                        System.out.println("Queue is empty. No student to process.");
                    } else {
                        int student = queue.remove(0);

                        System.out.println(
                            "Student " + student + " submitted the assignment."
                        );
                    }
                    break;

                case 3:
                    System.out.print("Enter Student ID to search: ");
                    int searchId = sc.nextInt();

                    if (queue.contains(searchId)) {
                        System.out.println(
                            "Student " + searchId + " is waiting."
                        );
                    } else {
                        System.out.println(
                            "Student " + searchId + " is not waiting."
                        );
                    }
                    break;

                case 4:
                    if (queue.isEmpty()) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("Current Queue: " + queue);
                    }
                    break;

                case 5:
                    System.out.println(
                        "Current number of students: " + queue.size()
                    );
                    break;

                case 6:
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 6);

        sc.close();
		
		
		
		
		
		
		
	}

}
