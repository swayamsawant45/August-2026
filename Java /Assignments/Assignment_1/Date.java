
public class Date {
	
	private int day;
	private int month;
	private int year;
	
	private int [] noofDays = {0,30,28,30}
	
	public void setDate(int dd, int mm , int yy)
	{
		if(mm < 1 || mm >12) 
			month = 1;
		else
			month = mm;
		
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
		{
			if(dd <= 1 || dd >= 31)
				day = 1;
			else
				day =dd;
		}
		else if(month == 4 || month == 6 || month == 9 || month == 11 )
		{
			if(dd <= 1 || dd >= 30 )
				day =1;
			else
				day = dd;
		}
		else 
		{
			if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
			{
				if(dd <= 1 || dd >= 29)
					day = 1;
				else
					day = dd;
			}
			else
			{
				if(dd <= 1 || dd >= 28)
					day = 1;
				else 
					day = dd;
			}
		}	
	}
			
			public void addDays(int days) {
				day = day+days;
			}
			
		
			public int getDay() {
				return day;
			}
			
			
			public int getMonth() {	
				return month;
			}
			
			public int getYear() {
				return year;
			}
			
		
	}



