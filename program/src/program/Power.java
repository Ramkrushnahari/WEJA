package program;

import java.util.Scanner;

public class Power {
		public static void main(String args[])
		{
	    		int b,e,power=1;
	   		Scanner sc = new Scanner(System.in); 
			System.out.println("Enter the base");
			b=sc.nextInt();
	    		System.out.println("Enter the exponent");
	    		e=sc.nextInt();
	    
	    		while(e>0)
		    	{
		    	    power=power*b;
	    	    	e--;
	    		}
			System.out.println("The power of the no = "+power);
		}
	}

