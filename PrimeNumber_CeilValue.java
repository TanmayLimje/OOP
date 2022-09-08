//TO CHECK WHETHER THE GIVEN NUMBER IS PRIME OR NOT
//IS DONT BY CALCULATING THE CEIL VALUE OF THE SQUARE ROOT OF GIVEN NUMBER.

import java.util.*;
public class primebysqrt {
		
	public static void main(String arg[]){
			
		 Scanner obj = new Scanner (System.in);
		    
		    int num ;
		    boolean flag = false;
		    
		    
		    do{
		      System.out.println("enter a number to check whether prime or not:");
		      
		      num = obj.nextInt();
		      
		    }while(num<1);
		    
		    
		    if(num==1){
		      flag =false;
		    }
		    
		    else {
		      
		      if(num % 2 == 0){
		        
		        if (num == 2){
		          flag = true;
		        }
		        else{
		          flag = false;
		        }
		      }
		      
		      else{
		        if (num == 3){
		          flag = true;
		        }
		        
		        int n = (int)Math.ceil(Math.sqrt(num));
		        //System.out.println(n);
		        
		        for (int j=3; j<=n; j+=2){
		          
		          if (num % j== 0){
		            flag = false;
		            break;
		          }
		          else{
		            flag = true;
		          }
		        }
		      
		    }
		            
		    
		    
		    if (flag == true){
		      
		      System.out.println("Entered number is prime:" + num);
		          
		    }
		    else {
		      System.out.println("Entered number is not prime:" + num);
		    }
		}
	}		
}
