package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetsExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<Integer>myset =new HashSet<>();
	myset.add(1);	
	myset.add(3);	
	myset.add(4);	
	myset.add(5);	
	myset.add(9);	
	myset.add(12);	
	myset.add(14);	
	myset.add(15);
	//Iterator
	Iterator<Integer>iterator = myset.iterator();
	//iterator on the collection
	while(iterator.hasNext()){
	  if(iterator.next()%2==0){
	   iterator.remove();
	System.out.println(myset);
	  
	  
	  }

}

	}	
		
}	
