
package test1;
import java.util.Scanner;

public class addition {

	public static void main(String args[]) {
	
		Scanner obj = new Scanner(System.in);
				
		int a;
		System.out.println("enter 1st no:");
		a = obj.nextInt();
		
		System.out.println("enter 2nd no:");
		int b = obj.nextInt();
		
		int sum = 0 ;
		sum = a + b;
		
		System.out.println("the addition is :" + sum);
				
	}
	
	
}
