/*Task #2:
Suppose you have a real number variable x. Write a Java expression that computes the following value y while using the * operator only four times:

y=12.3x^4-9.1x^3+19.3x^2-4.6x+34.2
*/

package Lab1;

import java.util.Scanner;
public class Task2 {
 	
    	public static void main(String[] args) {
    		Scanner scan=new Scanner(System.in);
    		System.out.print("Enter any real number: ");
    		double x=scan.nextDouble();
    		double y = (((12.3 * x - 9.1) * x + 19.3) * x - 4.6) * x + 34.2;
    		System.out.println("The value of y when x is "+x+" is given by: "+y);
    }
}
