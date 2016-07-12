import java.util.Scanner;

public class arth_calculation {
	
	// Arithmetic Calculation //
	
	public static void main(String args[])
	
	{
		
	int addition , subtraction , multiplication , division , result;

	Scanner monika = new Scanner(System.in);
	
	while(true)
		
	{
	
	System.out.println("Arithmetic Calculation ");
	System.out.println("");
	System.out.println("1. Addition of two no.");
	System.out.println("");
	System.out.println("2. Division of two no. ");
	System.out.println("");
	System.out.println("3. Multiplication of two no. ");
	System.out.println("");
	System.out.println("4. Subtraction of two no. ");
	System.out.println("");
	System.out.println("Enter your selection please ");
	int data = monika.nextInt();

	switch(data)
	
	{
	
	case 1 : System.out.println("Enter first no.");
	         int a = monika.nextInt();
	         System.out.println("Enter second no.");
	         int b = monika.nextInt();
	         result = a + b;
	         System.out.println("Addition of two no. "+result);
	         break;

	case 2 : System.out.println("Enter first no.");
             int c = monika.nextInt();
             System.out.println("Enter second no.");
             int d = monika.nextInt();
             result = c/d;
             System.out.println("Division of two no. "+result);
	         break;
	         

	case 3 : System.out.println("Enter first no.");
             int e = monika.nextInt();
             System.out.println("Enter second no.");
             int f = monika.nextInt();
             result = e*f;
             System.out.println("Multiplication of two no. is "+result);
             break;
    

	case 4 : System.out.println("Enter first no.");
             int g = monika.nextInt();
             System.out.println("Enter second no.");
             int h = monika.nextInt();
             result = g-h;
             System.out.println("Subtraction of two no. is "+result);
             break;
             
	default : System.out.println("Invalid selection , Choose only 1 to 4 Option ");
	
	monika.close();
	
	}

	}
}
	
}