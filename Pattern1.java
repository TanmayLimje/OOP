package test1;
import java.util.Scanner;

public class Pattern1 {
	
	
	
	public static void main(String arg[]) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("enter no of elements:");
		int n = obj.nextInt();
		int i, j, num;
		
		 for ( i = 1; i <= n ; i++) {
	            for ( j = 1; j <= n ; j++) {
	                if (j  <= i){
	                    System.out.print(j);
	                    if (!(i == j)){
	                        System.out.print(" ");
	                    }
	                }

	            }
	            System.out.println("\n");
	        }
		
		
		
	}
}
