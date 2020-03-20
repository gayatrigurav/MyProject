package myproject;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//The program will prompt user to input the number and then it will reverse 
		//the same number using while loop.
		
		int num = 0;
		int reversenum = 0;
		
		System.out.println("Input your number and press enter:");
		Scanner in = new Scanner(System.in);
		//captured input would be stored in number num
		num = in.nextInt();
		//while Loop: logic to find  out the reverse number
		while(num != 0)
		{
			reversenum = reversenum*10;
			reversenum = reversenum  + num%10;
			num = num/10;
		}
		
		System.out.println("Reverse of input number is:"+ reversenum);
	}

}
