package allApproches;

public class OnlyNumerics {
public static void main(String[] args) {
		

		long a = 65L;
		char b = (char)a;       //when we convert to char we get ASCII values 
		
		long a1 = 71L;
		char b1 = (char)a1;
		
		long a2 = 54L;
		char b2 = (char)a2;
		
		long a3 = 82L;
		char b3 = (char)a3;
		
		long a4 = 90L;
		char b4 = (char)a4;
		
		System.out.print("Phone Number - "+a);
		System.out.print(a1);
		System.out.print(a2);
		System.out.print(a3);
		System.out.print(a4);
		
		System.out.println("");
	
		System.out.println("<--------Adding of ASCII values-------->");
			
		System.out.print("After Addition - " +b+b1+b2+b3+b4);  // Only Numbers
      
	}

}
