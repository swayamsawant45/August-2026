
public class Engineer extends Employee{
	int OverTime;

	public Engineer(String name,String address,int age,String gender,int bs,int overTime) {
		super(name,address,age,gender,bs);
		OverTime=overTime;
	
	}
	

	 public void displayInfo() {
		 
		 super.displayInfo();
		System.out.println("Over Time : " + OverTime);
	}

}
