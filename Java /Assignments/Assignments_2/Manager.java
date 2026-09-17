
public class Manager extends Employee {
	
	int HRA;

	public Manager(String name,String address,int age,String gender,int bs,int hra) {
		super(name,address,age,gender,bs);
		HRA=hra;
		
	}
	
	 public void displayInfo() {
		 
		 super.displayInfo();
		System.out.println("HRA : " + HRA);
	}

}
