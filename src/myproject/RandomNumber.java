package myproject;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int counter;
		Random rnum = new Random();
		//below code would generate 5 random numbers bet 0 and 200
		System.out.println("Random Numbers:");
		System.out.println("****************");
		for (counter= 1; counter <= 5; counter++) {
			System.out.println(rnum.nextInt(200));
		}
	}

}

