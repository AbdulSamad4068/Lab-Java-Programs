/*
Task #4:
In physics, a common useful equation for finding the position s of a body in linear motion at a given time t, based on its initial position s0, initial velocity v0, and rate of acceleration a, is the following:
s=s0+v0t+0.5at^2

Write code to declare variables for s0,v0, a, and t, and then write the code to compute s on the basis of these values.
*/

package Lab1;

import java.util.Scanner;
public class Task4 
{
  	public static void main (String [] args) 
	{
         
        double s0 = 10.5;
        double v0 = 9.5;
        double a = 9.8;
        double t = 25.5;

        double s = s0 + (v0 * t) + (0.5 * a * t * t);
        System.out.println("The value of required eq is: "+s);
                 
    }
}
