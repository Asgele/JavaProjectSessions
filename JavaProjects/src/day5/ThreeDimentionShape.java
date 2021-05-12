package day5;

//subclass

public class ThreeDimentionShape extends polygon {

	private int height = 0;
	public ThreeDimentionShape(int sides, String color,int height) {
		super(sides, color);

		 this.height = height;	
			}
	public	void printHeight() {
     
			System.out.println(height);

 
	}

	
		
	}


		

	


