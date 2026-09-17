
public class SalesPerson extends Employee {
	int Comission;

	public SalesPerson(String name,String address,int age,String gender,int bs,int comission) {
		super(name,address,age,gender,bs);
		Comission=comission;
	}
	

	 public void displayInfo() {
		 
		 super.displayInfo();
		System.out.println("Comission : " + Comission);
	}

}
