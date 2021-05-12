package day3;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int i = input.nextInt();
		
		do
		{
			i--;
			if(i%2==0) {
				System.out.println(i);
			}
		}
		while(i>1);
	   input.close();
	
	}
}


