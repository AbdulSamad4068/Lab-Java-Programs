/*
Task #1:
Writing a program that stores a student’s year (Freshman, Sophomore, Junior, or Senior), the number of courses the student is taking, and his or her GPA on a 4.0 scale. Declare variables with the appropriate names and types to hold this information. Print the stored information at the end.
*/


package Lab1;

import java.util.Scanner;
public class Task1 
{
    public static void main(String args[])
    {
      Scanner scan=new Scanner(System.in);
      System.out.println("Write the year in which studying is studying:");
      String year =scan.next();
      System.out.println("Write the number of courses student is taking:");
      int course=scan.nextInt();
      System.out.println("Write the GPA of the student:");
      float GPA=scan.nextFloat();
      
      System.out.printf("year of student:%s",year);
      System.out.printf("\nNumber of course:%d",course);
      System.out.printf("\nGPA of the student:%.2f",GPA);
      
    }
    
}
