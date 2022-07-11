package NareshPrograms;

import java.util.Scanner;

public class Fibanocci {

	public static void main(String[] args) {
		
	    Scanner input = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter the Nth number: ");
		int n = input.nextInt();
		
		if(n>0)
		System.out.println("The number at given position is: "+fib(n));
		
		else
			System.out.println("Invalid number");
	}
	
	public static int fib(int n) {
		
		if(n==1)
			return 0;
		if(n==2)
			return 1;
		else
		return fib(n-1)+fib(n-2);
	}

}
