/*
Task #6:
Write a Java program that accepts four integers from the user and prints equal if all four are equal, and not equal otherwise.

*/

package Lab1;

import java.util.Scanner;

public class Task6 {
	 	public static void main (String [] args) //main method begins execution
	    {
	           Scanner scan = new Scanner (System.in);
	           System.out.print("Input first number: ");
	           int num1=scan.nextInt();
	           System.out.print("Input second number: ");
	           int num2=scan.nextInt();
	           System.out.print("Input third number: ");
	           int num3=scan.nextInt();
	           System.out.print("Input fouth number: ");
	           int num4=scan.nextInt();
	           
	           if(num1==num2 && num2==num3 && num3==num4) {
	        	   System.out.println("Four numbers are equal.");
	           }
	           else{
	        	   System.out.println("Four numbers are not equal.");
	           }
	           
	    }
}
