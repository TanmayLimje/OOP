public class arithmetic_operations {

	private int num1,num2,result;
	
	public arithmetic_operations(int a, int b)
	{
		
		this.num1 = a;
		this.num2 = b;
		
	}
	
	public void division()
	{
		try
		{
			result = num1 / num2;
			System.out.println("The division is:" + result);
		}
		catch (ArithmeticException e)
		{
			System.out.println("!!Exception found!!");
			e.printStackTrace();
		}
		catch(RuntimeException e)
		{
			System.out.println("you are in 2nd catch block using runtime exception class");
		}
		catch(Exception e)
		{
			System.out.println("you are in  3rd catch block using exception class");
		}
		finally
		{
			System.out.println("welcome to finally block");
		}
		
	}
	
  ----------------------------------------------------------------------------------------------------------------------------------------------
  
import java.util.Scanner;

public class Exception_handling {

	public static void main(String[] args) {
		
		int a,b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value for num1:");
		a = sc.nextInt();
		System.out.println("Enter value for num2:");
		b = sc.nextInt();
		
		arithmetic_operations obj = new arithmetic_operations(a,b);
		
		obj.division();

		System.out.println("hello this is main method");
	}

}
	
------------------------------------------------------------------------------------------------------------------------------------------------------------
 //OUTPUT 
------------------------------------------------------------------------------------------------------------------------------------------------------------ 
  
// Enter value for num1:
// 23
// Enter value for num2:
// 0
// !!Exception found!!
// java.lang.ArithmeticException: / by zero
// 	at arithmetic_operations.division(arithmetic_operations.java:30)
// 	at Exception_handling.main(Exception_handling.java:17)
// welcome to finally block
// hello this is main method
