package com.as.day5;

import java.util.Scanner;

public class ArrayStringExample2 {

	public static void main(String[] args) {
		//Read 5 string in to an Array fome user and print the string interactively?
	
   Scanner input = new Scanner(System.in);	
	System.out.println("please Enter a String value: ");
	String[] printString = new String[3];
	
	printString[0]=input.nextLine();
	printString[1]=input.nextLine();
	printString[2]=input.nextLine();
	
	for (int i= 0; i< printString.length; i++);{
	
	int i = 0;
	System.out.println(printString[i]);
	}
	}
}
