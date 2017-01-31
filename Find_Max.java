// Janelynn Camingue
// 1/30/17
// This program asks the user to input two numbers, and the program finds the biggest of the two and prints it out.



import java.util.Scanner;

class Find_Max{
	public static void main( String[] args){
		// variables: num1 is 1st number; num2 is 2nd number; max is the highest number
		int num1, num2, max;
		Scanner sc=new Scanner(System.in);
		// asks the user to input a number
		System.out.print("Enter a number: ");
		// assigns the number that the user inputs to the variable num1
		num1= sc.nextInt();
		// asks the user to input another number
		System.out.print("Enter another number: ");
		// assigns the number that the user inputs to the variable num2
		num2=sc.nextInt();
		// max variable is the max number of num1 and num2
		max=Math.max(num1, num2);
		// prints it out
		System.out.println("The maximum number of the two is "+max+".");
	}
}