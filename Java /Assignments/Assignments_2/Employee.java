
abstract public class Employee  {
	
	String Name;
	String Address;
	int Age;
	String Gender;
	int basicSalary;
	
	Employee(String name,String address,int age,String gender,int bs){
		
		Name=name;
		Address=address;
		Age=age;
		Gender=gender;
		basicSalary=bs;
			
		
	}
	
	public void displayInfo() {
		System.out.println("Name :" + Name);
		System.out.println("Address :" + Address);
		System.out.println("Age :" + Age);
		System.out.println("Gender :" + Gender);
		System.out.println("basicSalary :" + basicSalary);
	}
	
}
