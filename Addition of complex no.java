import java.util.Scanner;
public class complex {

	private int real1,img1,real2,img2,real3,img3;
	
	public void getdata() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first value: ");
		real1 = sc.nextInt();
		img1 = sc.nextInt();
		
		System.out.println("Enter second value: ");
		real2 = sc.nextInt();
		img2 = sc.nextInt();
		
	}
	
	public void add() {
		
		real3 = real1 + real2;
		img3 = img1 + img2;
		
	}
	
	public void display() {
		
		System.out.println("the addition is");
		System.out.println(real3 + "+" + img3 + "i");
		
	}
	
}

public class complex_op {
	public static void main (String arg[]) {
		
		complex obj = new complex();
		
		obj.getdata();
		obj.add();
		obj.display();
		
		
	}
}
