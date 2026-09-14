
public class Square extends Rectangle{

	int Side;
	
	Square(int l,int b,int s){
		
		super(l,b);
		Side=s;
	}
	
	void perimeter() {
		
		System.out.println("Perimeter of Square = " + (4*Side));
	}
	
	void area() {
		
		System.out.println("Perimeter of Square = " + (Side*Side));
		
	}

}
