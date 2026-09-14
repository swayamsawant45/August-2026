
public class Rectangle {
	
	int length;
	int breadth;
	
	Rectangle(int l,int b){
		length = l;
		breadth = b;
		
	}
	
	void perimeter() {
		
		System.out.println("Perimeter of Rectangle = " + (2*(length+breadth)));
	}
	
	void area() {
		
		System.out.println("Perimeter of Rectangle = " + (length*breadth));
		
	}

}
