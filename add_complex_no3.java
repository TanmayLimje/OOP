//ADDITION OF COMPLEX NUMBERS USING 3 OBJECTS

import java.util.Scanner;

public class complex_1 {

	private int img, real;
		
	public void getdata() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Real value: ");
		real = sc.nextInt();
		
		System.out.println("Enter Imaginary value: ");
		img = sc.nextInt();
		
	}
	
	public void add (complex_1 x, complex_1 y) {
		
		real = x.real + y.real;
		img = x.img + y.img;
		
	}
	
	
	public void display () {
		
		System.out.println(real + "+" + img + "i");
		
	}
	
}



public class complexM_1 {

	public static void main (String arg[]) {
		
		complex_1 C1 = new complex_1();
		complex_1 C2 = new complex_1();
		complex_1 C3 = new complex_1();
		
		System.out.println("Enter your First Complex Number");
		C1.getdata();
		
		System.out.println("Enter your Second Complex Number");
		C2.getdata();
		
		C3.add(C1, C2);
		
		System.out.println("The addition is:  ");
		C3.display();
	}
	
}
