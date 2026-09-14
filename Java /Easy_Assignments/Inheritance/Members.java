
	public class Members {
		String Name;
		int Age;
		String Phone_number;
		String Address;
		int Salary;
		
		public Members(String name2, int age2, String phone_number2, String address2, int salary2) {
			
			Name = name2;
			Age=age2;
			Phone_number = phone_number2;
			Address = address2;
			Salary = salary2;
			
		}


		void printSalary() 
		{
			System.out.println("Salary of Member: " + Salary);

		}
	}


