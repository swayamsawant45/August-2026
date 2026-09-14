
public class PrimeMembers extends Members {

	int   JoiningYear;
	int JoiningFees;
	String isActive;
	
	
	PrimeMembers(String name2, int age2, String phone_number2, String address2, int salary2,
            int joiningyear2, int joiningfees2, String isactive2)
	{
		super(name2, age2, phone_number2, address2, salary2);
		JoiningYear = joiningyear2;
		JoiningFees = joiningfees2;	
		isActive = isactive2;	
		
	}
	
	public int getJoiningYear() {
		return JoiningYear;
	}

	public int getJoiningFees() {
		return JoiningFees;
	}
	public String isActive() {
		return isActive;
	}

	public void setJoiningYear(int joiningYear) {
		JoiningYear = joiningYear;
	}

	public void setJoiningFees(int joiningFees) {
		JoiningFees = joiningFees;
	}

	public void setActive(String isActive) {
		this.isActive = isActive;
	}


	void display()
	{
		System.out.println("---Prime Members Details----");
		System.out.println("Name : " + Name);
		System.out.println("Age: " + Age);
		System.out.println("Phone Number " + Phone_number);
		System.out.println("Address: " + Address);
		System.out.println("Salary: " + Salary);
		System.out.println("Joining Year: " + getJoiningYear());
		System.out.println("Joining Fees: " + getJoiningFees());
		System.out.println("Joining Year: " + isActive());
		
	
	}

}
