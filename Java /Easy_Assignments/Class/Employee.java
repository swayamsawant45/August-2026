
public class Employee {

	String name;
	int year;
	String salaryAddress;
		
	
	Employee(String n,int y,String sal){
		name=n;
		year=y;
		salaryAddress=sal;
		
	}
	
	public void display() 
	{
	
		System.out.println(name + "         " + year + "             " + salaryAddress );

		
	}
	
	
}
