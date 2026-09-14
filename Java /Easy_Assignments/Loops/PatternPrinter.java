
public class PatternPrinter {
	
	void Patter1() {
		for(int temp = 0; temp <= 5 ;temp++)
		{
			for(int temp2 = 0 ;temp2 < temp; temp2++) 
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	
	void Patter2()
	{
		for(int temp = 5; temp >= 1;temp--)  				//	temp 5  > 0 
		{
			for(int temp2 = 1;temp2 <= temp;temp2++)   	   //   temp 2  5 > 5
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	
	
	void Patter3() 
	{
		int num=1;
		for(int temp = num; temp < 5 ;temp++)
		{
			for(int temp2 = 0 ;temp2 < temp; temp2++) 
			{
				System.out.print(num++ + " ");
			}
			System.out.println("");
		}
	}
	
	void Patter4() 
	{
		int num=0;
		for(int temp = num; temp <= 7 ;temp++)
		{
			
			for(int temp2 = 1 ;temp2 < temp; temp2++) 
			{
				System.out.print(temp2 + " ");
			}
			System.out.println("");
			
			num++;
		}
	}
	
	void Patter5() 
	{
		int num=6;
		for(int temp = num; temp >= 1;temp--)
		{
			
			for(int temp2 = 1 ;temp2 <= temp; temp2++) 
			{
				System.out.print(temp2 + " ");
			}
			System.out.println("");
			
			num++;
		}
	}
	
	
	
	
}	
