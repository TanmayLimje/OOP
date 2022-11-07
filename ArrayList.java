import java.util.*;

public class arraylist {

	ArrayList<Integer> num = new ArrayList<Integer>();
	ArrayList<String> val = new ArrayList<String>();

	static Scanner sc = new Scanner(System.in);
	
	void insert(boolean s){
		
		if(s){
			System.out.println("Enter the string:");
			String sy = sc.next();
			val.add(sy);
		}
		else{
			System.out.println("Enter number:");
			int i = sc.nextInt();
			num.add(i);
		}
		
	}
	
	void display(){
		System.out.println("Entered no is:");
		for (int i = 0; i < num.size();i++){
			System.out.println(num.get(i));
		}
		
		System.out.println("Entered string is:");
		for (int i = 0; i < val.size();i++){
			System.out.println(val.get(i));
		}
	}
	
	void remove(String v){
		val.remove(v);
	}
	
	void remove(int v){
		num.remove(v);
	}
	
	void even_odd(){
		
		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();
		
		int count1 = 0,count2 = 0;
		
		for (int i = 0; i < num.size(); i++)
		{
			if(num.get(i) % 2 == 0)
			{
				even.add(num.get(i));
				//even.get(i);
				count1++;
			}
			else
			{
				odd.add(num.get(i));
				//odd.get(i);
				count2++;
			}
		}
		
		System.out.println(even);
		System.out.println("even count:" + count1);
		System.out.println(odd);
		System.out.println("odd count:" + count2);
		
	}
	
	boolean isPrime(int n){
		
		boolean flag = false;
		
		if (n == 1)
			flag = false;
		
		else if (n == 2)
			flag = true;
		
		else if (n % 2 == 0)
			flag = false;
		
		else{
			if (n == 3)
				flag = true;
			else{
				for (int i = 3; i < Math.ceil(Math.sqrt(n));i+=2){
					if (n % i == 0)
						flag = false;
					else
						flag = true;
				}
			}
		}
		
		return flag;			
			
	}
	
	void checkPrime(){
		
		ArrayList<Integer> notP = new ArrayList<Integer>();
		
		System.out.println("Prime:");
		
		for (int i = 0; i < num.size(); i++){
			
			if(isPrime(num.get(i)))
				System.out.println(num.get(i));
			
			else
				notP.add(num.get(i));
		}
		
		System.out.println(num.size() - notP.size() );
		
		System.out.println("Not prime:" + notP);
		
		System.out.println(notP.size());
		
	}
	
	String palindrome(String s) { 
       
		StringBuilder s1 = new StringBuilder(); 
       
		s1.append(s); 
        s1.reverse(); 
        
        s = String.valueOf(s1); 
       
        return s; 
	} 
	
	  void checkpalindrome() { 
         
		  for(int i = 0; i < val.size();i++){
        	 
			  if(val.get(i).equals(Pallindrome(val.get(i))))
        		  System.out.println(val.get(i)+" Is palindrome");
        	  
			  else
        		  System.out.println(val.get(i) + " Is not palindrome");
          }
 
	
	
	  }
	  
}

------------------------------------------------------------------------------------------------------------------------------------------------------

import java.util.Scanner;

public class main_arraylist {

	public static void main(String[] args) {

		arraylist obj = new arraylist();
		
		Scanner sc = new Scanner(System.in);
	
		int input;
		
		do
		{
			System.out.println("----MENU----");
			System.out.println("1. Add values");
			System.out.println("2. display values");
			System.out.println("3. check");
			System.out.println("4. exit");
			System.out.println("Enter your choice:");
			input=sc.nextInt();
			
			switch(input)
			{
			
			case 1:
				
				System.out.println("Is it a string?");
				System.out.println("1.yes");
				System.out.println("2. no");
				int b = sc.nextInt();
				
				if(b==1)
					obj.insert(true);
				else
					obj.insert(false);
				break;
				
			case 2:
				
				obj.display();
				break;
				
			case 3:
				
				System.out.println("----check-list---");
				System.out.println("1. even or odd");
				System.out.println("2. prime or not");
				System.out.println("3. palindrome");
				System.out.println("your choice:");
				
				int a=sc.nextInt();
				
				switch(a)
				{
				
				case 1:
					obj.even_odd();
					break;
									
				case 2:
					obj.checkPrime();
					break;
					
				case 3:
					obj.checkPallindrome();
					break;
				
				}
			
			}
			
		}while(input!=4);
		
	}

}
