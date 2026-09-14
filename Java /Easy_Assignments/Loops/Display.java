
public class Display 
{

	public static void main(String[] args)
	{
		NumberPrinter objNP1 = new NumberPrinter();
		
		objNP1.printEvenNumbers();
		
		System.out.println("====================================================================");
		objNP1.printOddNumbers();
		System.out.println("====================================================================");
		objNP1.printSeveth();
	
		System.out.println("====================================================================");
	
		PatternPrinter objPP1 = new PatternPrinter();
		
		objPP1.Patter1();
		System.out.println("====================================================================");
		
		objPP1.Patter2();
		System.out.println("====================================================================");
		
		objPP1.Patter3();
		System.out.println("====================================================================");
		
		objPP1.Patter4();
		System.out.println("====================================================================");
		
		objPP1.Patter5();
		System.out.println("====================================================================");
		
	}

}
