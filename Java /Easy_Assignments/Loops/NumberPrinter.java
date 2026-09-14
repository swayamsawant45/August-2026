
public class NumberPrinter {
	
	
	
	void printOddNumbers()
	{
	
		for(int temp = 1 ; temp <= 1000 ; temp++)
		{
			if(temp % 2 != 0) 
			{
				System.out.println(temp);
			}
		
		}
	}
	
	
	void printEvenNumbers() {
	
		for(int temp = 1 ; temp <= 500 ; temp++) {
			if(temp % 2 == 0) {
				System.out.println(temp);
			}
		}
	
	}
	
	void printSeveth() {
	for(int temp = 7; temp <= 200 ; temp += 7) 
	{
		System.out.println(temp);
	}
	


	
}
}
