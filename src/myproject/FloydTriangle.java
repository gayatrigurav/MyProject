package myproject;
import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //This program will prompt user for number of rows and based on the input, 
		//it would print the Floyd’s triangle having the same number of rows.
		
		int row, number = 1, counter, j;
		
		//to get user input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows for floy's triangle");
		//coying user input into an integer variable named rows
		row = input.nextInt();
		System.out.println("Floyd'd triangle");
		System.out.println("**************");
		for (counter= 1;counter <= row; counter++)
		{
			
			for(j=1; j<=counter; j++)
			{
				System.out.print(number + " ");
				//Incrementing the number value 
				number++;
			}
			
			//For new line 
			System.out.println();
		}
	}

}



