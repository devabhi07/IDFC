package finlaKey;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex3 {
	
	
	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        
	        
	        try{
	        	
	        	
	        	Scanner sc=new Scanner(System.in);
	        	System.out.println("Input");
		        int a=sc.nextInt();
		        System.out.println("Input");
		        int b=sc.nextInt();
	            int c=a/b;
	            System.out.println(c);
	        }
	        catch(ArithmeticException e){
	            System.err.println("e");
	            
	        }
	         catch (InputMismatchException e) {  
	            System.err.println(e );
	                      
	    }
	    }
	}


