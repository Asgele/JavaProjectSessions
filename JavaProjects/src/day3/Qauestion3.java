package day3;

import java.util.Scanner;

public class Qauestion3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number between 1 to 7");

		int num = input.nextInt();

		switch (num) {

		case 1:
			System.out.println("manday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("wensday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		}
		if (num <= 5) {
			System.out.println("Weekday");
		} else {
			System.out.println("Weekend");
		}
		input.close();

	
	}

}
