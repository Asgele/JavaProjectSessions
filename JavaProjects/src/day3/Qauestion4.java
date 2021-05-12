package day3;

import java.util.Scanner;

public class Qauestion4 {

	public static void main(String[] args) {
		
     Scanner Sc = new Scanner(System.in);

	System.out.print("Enter a number:");
	
  int i = Sc.nextInt();	
	
	do
	{
	  i--;
	  if(i % 2 ==0) {
		  System.out.println(i);
	  }
	}
	   while(i>1);
	
	 Sc.close();
	}


		

}
