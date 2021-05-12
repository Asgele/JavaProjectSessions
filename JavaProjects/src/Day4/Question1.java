package Day4;

public class Question1 {

	public static void main(String[] args) {
	//Write a Java program to calculate the average value of array integers.
   //Array is collection
	//Array = used to store multiple vales in a single variable 
   //int[] grades
	//int is type
	//DataType variable =value
	//{"Orange","Apple","Banana""mango};
 int[]myArray = new int[4];
        myArray[0] =20;
        myArray[1]= 26;
        myArray[2] = 30;
        myArray[3] = 45; 

//int[] average = (myArray[0] + myArray[1] + myArray[2] +myArray[3])/4;
 int sum = 0;
 for(int i=0; i < myArray.length;i++){	
    sum =sum + myArray[i];	
 }
	int average = sum /myArray.length;
	
	System.out.println("The average of an array elements is=" +average);
	}
	}
