package test1;

import java.util.Scanner;

public class Factorial {
	
	static void fact(int x) {
		int f = 1;
		for (int i = 1; i <= x; i++) {
			//System.out.println(i);
			f = f * i;
		}
		System.out.println("factorial of " + x + " is " + f);
	}
	
	public static void main(String arg[]) {
		 
		 Scanner obj = new Scanner(System.in);
		 System.out.println("Enter the value of n:");
		 int n = obj.nextInt();
		 fact(n);
		 
	 }
	 
	 
}
