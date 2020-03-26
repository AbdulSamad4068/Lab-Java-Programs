/*
Task #3
Write an application that inputs one number consisting of five digits from the user, separates the number into its individual digits and prints the digits separated from one another by three spaces each. For example, if the user types in the number 42339, the program should print:
4 2 3 3 9
*/

package Lab1;

import java.util.Scanner;

public class Task3 {
    public static void main (String [] args) {
         
        Scanner value = new Scanner (System.in);
        int number; //number entered by the user
        int first_d; //first digit of number
        int second_d; //second digit of number
        int third_d; //third digit of number
        int fourth_d; //fourth digit of number
        int fifth_d; //fifth digit of number
         
        System.out.print ("Enter An Integer Number Consisting of Five Digits: ");
        number = value.nextInt();
         
        fifth_d = number % 10;
        fourth_d = (number % 100)/10;
        third_d = (number % 1000)/100;
        second_d = (number % 10000)/1000;
        first_d = (number % 100000)/10000;
         
        System.out.println ();
         
        System.out.printf ("%d   %d   %d   %d   %d\n", first_d, second_d, third_d, 
                fourth_d, fifth_d);
         
    }
}