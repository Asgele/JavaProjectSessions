package day2;

import java.util.Scanner;

public class Qauestion4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("enter your age:");

		int age = input.nextInt();

		System.out.println("you age is:" + age);

		if (age < 18) {

			System.out.println("You are not eligible to vote");
		}
		else if (age > 18 && age <= 80) {

			System.out.println("You are elibible to vote");

		} else {
			System.out.println("You are too old to vote");
		}
	}
}
