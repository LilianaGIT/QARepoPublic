package testinheritance;

import javabasics2.TwoDimesionalShape;

public class Mainnheritance {

	public static void main(String[] args) {
		
		TwoDimesionalShape tds = new TwoDimesionalShape();  // JVM ADD:  ASAS@£@£@12323
		tds.length = 10;
		tds.breadth = 20;
		
		System.out.println(tds.length);
		
		
		
		Square sq = new Square(); // JVM ADD:  ASAS@£@£@5675675
		sq.setLength(25);
		sq.printArea();
		
		System.out.println(tds.length);
		
		Rectangle rect = new Rectangle();  // JVM ADD:  ASAS@£@£@123244545464
		rect.setBreadth(30);
		rect.setLength(25);
		rect.printArea();
		
		
		
		
	}

}
