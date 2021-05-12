package Day4;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to copy an array by iterating the array. 
	   //Arr1[2,4,5,2]
	  // Arr2[nuil,nuil,nuil,nuil]
	int[] testArrayvalue = {6,7,17,25};
	int x = 6;
    boolean check = false;
    for(int i : testArrayvalue) {	
	   if(i  == x) {
           check = true;
              break; 
	   }
    } 
	if(check) {   
	
		System.out.println("The given element exists");   
	}   
	else {	  
	System.out.println("The given element is dose not exists");
	
	}
	}

}
