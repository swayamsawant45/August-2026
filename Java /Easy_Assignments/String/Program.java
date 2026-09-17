
public class Program {
	
		
	
	
	public static void main(String [] args) {
		
		
		System.out.println("Enter String 1 :");
		String str = ConsoleInput.getString();
		
		System.out.println("Enter String 2 :");
		String str1 = ConsoleInput.getString();
		
		
		System.out.println("Orignal String " + str);
		System.out.println("The character at position 0 is " + str.charAt(0));
		System.out.println("The character at position 0 is " + str.charAt(10));
		
		System.out.println("=======================================================");
		
		int result = str.compareTo(str1);
		
		
		System.out.println("String 1: " + str);
		System.out.println("String 1: " + str1);
		
		 if (result == 0) {
	            System.out.println("\"" + str + "\" is equal to \"" + str1 + "\"");
	        }
	        else if (result < 0) {
	            System.out.println("\"" + str + "\" is less than \"" + str1 + "\"");
	        }
	        else {
	            System.out.println("\"" + str + "\" is greater than \"" + str1 + "\"");
	        }
		 
		 System.out.println("=======================================================");
		 
		 
		 String str2 = "Python Exercises";
		 String str3 = "Python Exercise";
		 
		 System.out.println("\"Python Exercises\" ends with \"se\"? " + str2.endsWith("se"));
		 System.out.println(" \"Python Exercise\" ends with \"se\"? " + str3.endsWith("se"));
		
		 System.out.println("=======================================================");
		 
		 String tempStr =  "The quick brown fox jumps over the lazy dog."; 
		 
		 
		 for(int i = 0; i < tempStr.length() ; i++) 
		 {
			 char ch = tempStr.charAt(i);
			 
			 if(Character.isLetter(ch)) {
				 System.out.println(ch + " = " +i);
			 }
		 }
		 
		 System.out.println("=======================================================");
		 
		 String str5 = "The quick brown fox jumps over the lazy dog.";
		 
		 System.out.println(str5.replace("fox", "cat"));
		 
		 System.out.println("=======================================================");
		 
		 
		 
		 String str6 =  "The Quick BroWn FoX!";
		 
		 System.out.println("Orignal String : " + str6);
		 
		 System.out.println("String in uppercase :" + str6.toUpperCase());
		 
		 System.out.println("=======================================================");
		 
		 System.out.println("Orignal String : " + str6);
		 
		
			
			
			for(int j = str6.length() - 1 ; j >= 0 ;j--) 
			{
				char ch = str6.charAt(j);
			
				System.out.print(" "+  ch);
				
			}
			
			
			System.out.println("=======================================================");
			
			
			int temp = 1234;
			
			int orignal = temp;
			
			int reverse = 0;
			
			System.out.println("OG number = " + temp);
			
			int num =0;
			
			while(temp > 0) {
				
				num = temp % 10;
				
				reverse = reverse*10 + num;
				
				temp =temp / 10;
			}
			
		
			System.out.println("Reversed number =" + reverse);
			
			if(reverse == orignal) {
				System.out.println("is a Palindrome");
			}
			else 
				 System.out.println(orignal + " = "+"Not Palindrome");
	}

}
