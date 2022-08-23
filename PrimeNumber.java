package test1;
import java.util.Scanner;
public class PrimeNumber {
	
	public static void main(String args[]) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("enter no to check whether prime or not:");
		int num = obj.nextInt();
		boolean flag = false;
		int i ;
		
		for (i = 2; i <= num; i++ ) {
			
			if (num % i == 0 ) {
				flag =true;
			}
			else {
				flag = false;
			}
		}
		if (flag = true) {
			System.out.println("Prime:" + num);
		}
		else {
			System.out.println("Not prime" + num);
		}
		
		
	}
	
}