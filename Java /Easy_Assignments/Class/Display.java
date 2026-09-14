
public class Display {

	public static void main(String[] args) {
	      
        Student objStd1 = new Student("Jhon", 2,"22421347124","Pune..");  
        Student objStd2 = new Student("Sam",3,"12345678890","Nashik..");
        
        System.out.println(objStd1.name + objStd1.roll_no +objStd1.name+ objStd1.address);
        System.out.println(objStd2.name + objStd2.roll_no +objStd2.name+ objStd2.address);       
        
        System.out.println("====================================================================");
        Triangle objT1 = new Triangle(3,4,5);
        System.out.println("Perimeter of triangle : "+objT1.calculatePerimeter()); 
        System.out.println("Area of triangle : "+objT1.calculateArea()); 
        System.out.println("====================================================================");
       
        Rectangle objR1 = new Rectangle(4,5);
        Rectangle objR2 = new Rectangle(5,8);
        System.out.println("Area of rectangle 1 : " +objR1.calculateArea());
        System.out.println("Area of rectangle 2 : "+objR2.calculateArea());
        
        System.out.println("====================================================================");
        
        Employee objEmp1 = new Employee("Robert",1994,"64C-WallsStreat");
        Employee objEmp2 = new Employee("Sam",2000,"68D-WallsStreat");
        Employee objEmp3 = new Employee("John",1999,"26C-WallsStreat");
        
    	System.out.println("Name" + "     " + "Year of joining"+ "     " + "Address" );
        objEmp1.display();
        objEmp2.display();
        objEmp3.display();
        
        System.out.println("====================================================================");
        
    }

}
