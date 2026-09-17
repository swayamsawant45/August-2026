
public class Program {

	public static void main(String[] args) {
		
		Date objDate = new Date();
		
		switch(choice){
			
			case 1:
				System.out.println("Enter day:");
				int day = ConsoleInput.getInt();
				
				System.out.println("Enter month:");
				int month = ConsoleInput.getInt();
				
			
				System.out.println("Enter year:");
				int year = ConsoleInput.getInt();
				
				objDate.setDate(day, month, year);
				break;
				
			case 2:
				System.out.println("Add Days :");
				int days = ConsoleInput.getInt();
				
				objDate.addDays(days);
				break;
			
			case 3:
			    System.out.println("Enter months to add:");
			    int months = ConsoleInput.getInt();

			    objDate.addMonths(months);
			    break;

			case 4:
			    System.out.println("Enter years to add:");
			    int years = ConsoleInput.getInt();

			    objDate.addYears(years);
			    break;

			case 5:
			    objDate.display();
			    break;

			case 6:
			    // compare two dates
			    break;

			case 7:
			    System.out.println("Exiting...");
			    return;

			default:
			    System.out.println("Invalid choice!");
				
		}
		

		System.out.println("Enter the Day");
		int day = ConsoleInput.getInt();
				
		System.out.println("Enter the month");
		int month = ConsoleInput.getInt();
				
		System.out.println("Enter the year");
		int year = ConsoleInput.getInt();
		
				
		objDate.setDate(day,month,year);
		
		System.out.println(objDate.getDay());
	}

}
