package Day4;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to test if an array contains a specific value. 	}
        // [4, 6, 7, 9] x=7
int[]num= {4 , 6, 7, 9};
int  tofind =5;	
	boolean faund = false;
   for(int n:num) {
	if(n==tofind) {
	faund = true;
	break;
	}
   
  if(faund) 
    System.out.println(tofind + " is faund." );
    else
    System.out.println(tofind + "is not faund");  
   }
	}
	
} 
   