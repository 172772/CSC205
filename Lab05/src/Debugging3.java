import java.util.Scanner;        // Scanner class used for getting user input
public class Debugging3 {
	   // AverageAndSmallest
	   // This program will get three numbers from the user
	   // and determine the smallest number and the average
         // The main method that begins execution of Java application
	    public static void main(String args[])
	    {
	        // variable declarations
	        int num1;           //  first number to compare
	        int num2;           //  second number to compare
	        int num3;           //  third number to compare
	        int smallest = 0;   //  variable to hold smallest
	        double average;     //  variable to hold average

	        // create Scanner to capture input from console
	        Scanner input = new Scanner(System.in);

	        // get user input, num1 and num2
	        System.out.print("Enter first number: ");
	        num1 = input.nextInt();
	        System.out.print("Enter second number: ");
	        num2 = input.nextInt();
	        System.out.print("Enter third number: ");
	        num3 = input.nextInt();

	        // Compare and determine the smallest
	        if (num1 >= num2)
	                smallest = num2;
	        if (num1 < num2)
	                smallest = num1;
	        if (num3 < smallest)
	                smallest = num3;

	        // Calculate the average
	        average = (num1 + num2 + num3) / 3.0;

	        // Display average and the samllest
	        System.out.printf("Average is %.2f\n", average);
	        System.out.printf("Smallest is %d\n", smallest);
	    }

}
