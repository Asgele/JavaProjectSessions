package com.as.day5;

import java.util.Scanner;

public class ArrayEx4 {

	public static void main(String[] args) {
		
	int[]array1 = new int[3];
       
	System.out.println("Enter the elements of the array: ");
	
       
	for (int i=0; i<3; i++) 
	{  
   Scanner Sc = new Scanner(System.in);     
	
	array1[i]=Sc.nextInt();
	
       }   
       System.out.println("The array elements are :");
     for(int i=0;i <3;i++) 
	System.out.println(array1[i]);
	} 
}

