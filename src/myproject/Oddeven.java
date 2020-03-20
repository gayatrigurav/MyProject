package myproject;
import java.util.Scanner;

public class Oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		System.out.println("Enter an Integer:");
		
		//The input provided by user is stored in num
		
		Scanner input = new Scanner(System.in);
		num= input.nextInt();
		
		//if number is divided by 2 then it is even number else odd number
		
		if(num % 2 == 0 )
			System.out.println("Entered number is even");
		else
			System.out.println("Entered number is odd");
	}

}




