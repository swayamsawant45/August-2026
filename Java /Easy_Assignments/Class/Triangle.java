
public class Triangle {
	
	int side1 ;
	int side2 ;
	int side3 ;
	
	Triangle(int s1,int s2,int s3){
		side1=s1;
		side2=s2;
		side3=s3;
	}
	
	public double calculatePerimeter () {
		return side1+side2+side3;
	}
	
	  double calculateArea() {
	        double s = calculatePerimeter() / 2; // semi-perimeter
	        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	        return area;
	    }
	

}
