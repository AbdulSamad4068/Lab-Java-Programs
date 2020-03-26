/*
Task #5:
Write a Java program to print the area and perimeter of a circle.
*/

package Lab1;

import java.util.Scanner;

public class Task5 {
	
    public static void main (String [] args) //main method begins execution
    {
           Scanner value = new Scanner (System.in);
           System.out.println("Enter radius of the circle: ");
           double radius=value.nextDouble();
           System.out.printf("Area of the circle = %.2f\nPerimeter of the cirlce = %.2f",3.1415*radius*radius,2*3.1415*radius);
    }
}
