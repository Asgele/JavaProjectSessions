package day5;



public class Main {


	public static void main(String[] args) {
    polygon triangle = new polygon(8,"white");
    triangle.printside();
    triangle.printcolor();	
     polygon rectangle = new polygon(6,"Yelow");
     rectangle.printside();
     rectangle.printcolor();
     polygon polygon = new polygon(10,"Blue");
     polygon.printside();
     polygon.printcolor();
	
  ThreeDimentionShape rectangular3D =new ThreeDimentionShape(5,"orange",20);
	rectangular3D.printside();
     rectangular3D.printcolor();
	 rectangular3D.printHeight();

	}
	
}



