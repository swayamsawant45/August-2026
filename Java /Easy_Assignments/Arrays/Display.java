
public class Display {

	public static void main(String[] args)
	{
//		Sort obj = new Sort();
		
		System.out.println("Enter NO of elements: ");
		int size = ConsoleInput.getInt();
		
		
		int[] numbers = new int[size];
		

		
		for(int temp = 0 ; temp < numbers.length; temp++ ) {
			
			System.out.println("Enter Element " + (temp+1));
			numbers[temp]= ConsoleInput.getInt();
		
		}
		
		System.out.println("Array: ");
		for(int temp =0 ;temp<numbers.length;temp++) {
			System.out.print(numbers[temp]+ " ");
		}
		
		
		System.out.println(" ");

		System.out.println("Sorted Array: ");

		//  Sort the array first
		for (int i = 0; i < numbers.length - 1; i++) 
		{
		    for (int j = 0; j < numbers.length - 1 - i; j++) 
		    {
		    	
		        if (numbers[j] > numbers[j + 1]) {
		            // Swap 
		            int temp1 = numbers[j];
		            numbers[j] = numbers[j + 1];
		            numbers[j + 1] = temp1;
		        }
		    }
		}

		// Print the sorted array
		for (int temp = 0; temp < numbers.length; temp++)
		{
		    System.out.print(numbers[temp] + " ");
		}
			
		
		System.out.println("=========================================");
		
		
	
		int sum = 0;
		
		for(int i = sum ;i < numbers.length ;i++)
		{
		 sum = sum + numbers[i];
		}
		
		System.out.println("Sum of Elements OF Array: " + sum);
		
		System.out.println("=========================================");
		
		 
		double avg =  sum / numbers.length;
			
		System.out.println("Avrage of Elements OF Array: " + avg);
		
		System.out.println("=========================================");
		
		int max = numbers[0];
		int temp8 = 0;
		
		for(int i = 0; i< numbers.length;i++) 
		{
			temp8 = numbers[i];
			
			if(temp8>max)
			{
				max=temp8;
				
			}
			
		
		}
		System.out.println("Max of Elements OF Array: " + max);
		
		System.out.println("=========================================");
		
		int start = 0;
		int end = numbers.length-1;
		
		while(start < end)
		{
			int temp =  numbers[start];
			numbers[start] = numbers[end];
			numbers[end]= temp;
			
			start++;
			end--;
				
		}
		
		System.out.print("Reversed Array :");
		for(int num : numbers) {
			System.out.print(num +" ");
		}
		System.out.println("");
		System.out.println("=========================================");
		
		
		
		
			
		
		

	}

}
