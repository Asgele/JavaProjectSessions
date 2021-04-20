package day2;

import java.util.Scanner;

public class Qausetion3 {

	public static void main(String[] args) {
		
  Scanner input = new Scanner(System.in);  
		
  System.out.println("Enter your number:");	             
     
   int num = input.nextInt();  
	
 if (num>0) {   
	 System.out.println("you entered a positive number"); 
 }
      else  if (num < 0) {

    	  System.out.println ("you entred a negative number");    	 
      }
      else {System.out.println("you entered zero"); 
      
      }
       input.close();  
      
    } 
}