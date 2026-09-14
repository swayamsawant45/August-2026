
public class Display {

	public static void main(String[] args) {
		
		// method of parent class by object of parent class
		Parent obj = new Parent();
		obj.Display1();
		
		// method of child class by object of child class
		Child obj1 = new Child();
		obj1.Display();
		
		//  method of parent class by object of child class
		Child obj2 = new Child();
		obj2.Display1();
		
		
		System.out.println("=========================");
		
		
		
		System.out.println("Enter Member Name:");
		String Name = ConsoleInput.getString();
		
		
		System.out.println("Enter Member Age: ");
		int Age = ConsoleInput.getInt();
		
		System.out.println("Enter Member Phone Number: ");
		String Phone_number = ConsoleInput.getString();
		
		System.out.println("Enter Member Address: ");
		String Address = ConsoleInput.getString();
		
		System.out.println("Enter Member Salary: ");
		int Salary = ConsoleInput.getInt();
			
		
		System.out.println("Name of Member: " +Name);
		System.out.println("Age of Member: " +Age);
		System.out.println("Phone number of Member: " +Phone_number);
		System.out.println("Address of Member: " +Address);
		
		Members objMem = new Members(Name,Age,Phone_number,Address,Salary);
		
		objMem.printSalary();
		
		
		System.out.println("=========================");
		
		System.out.println("Enter Member JoiningYear:");
		int JoiningYear = ConsoleInput.getInt();
		
		
		System.out.println("Enter Member JoiningFees: ");
		int JoiningFees = ConsoleInput.getInt();
		
		System.out.println("Enter Member isActive: ");
		String isActive = ConsoleInput.getString();
				
		
		PrimeMembers obj4 = new PrimeMembers(Name,Age,Phone_number,Address,Salary,JoiningYear,JoiningFees,isActive);
		
		obj4.display();
		System.out.println("=========================");
		
		
		System.out.println("Enter Length of Rectangle: ");
		int length = ConsoleInput.getInt();
		
		System.out.println("Enter Breadth of Rectangle: ");
		int breadth = ConsoleInput.getInt();
		
		Rectangle ObjRec = new Rectangle(length,breadth);
		ObjRec.perimeter();
		ObjRec.area();
		
		
		System.out.println("Enter Side of Square: ");
		int side = ConsoleInput.getInt();
		
		Square ObjSqu = new Square(length,breadth,side);
		ObjSqu.perimeter();
		ObjSqu.area();
		
		System.out.println("=========================");
		
		Square2 objSqu = new Square2();
		
		objSqu.Display();
		((Rectangle2) objSqu).Display2();
		((Square2) objSqu).Display4();
		
		
		
		
		
		
	}
	

}
