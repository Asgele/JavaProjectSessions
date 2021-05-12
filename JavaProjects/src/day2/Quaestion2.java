package day2;

import java.util.Scanner;

public class Quaestion2 {

	public static void main(String[] args) {
		
   Scanner input  =  new Scanner(System.in);
    
    String letter = "T";
    System.out.print("Enter a letter:");
	String letter2 = input.nextLine();
	if (letter2.startsWith(letter)){
		System.out.println("Yes that's a String: " + letter);
	}
	
	else if (letter2 == "") {  
		System.out.println("That's not the  string:" + letter);		
	}
	else {	
	
		System.out.println("That's invalid");	
	input.close();
	
	}
	}
}
