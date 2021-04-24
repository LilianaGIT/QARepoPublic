package testinheritance;

import javabasics2.TwoDimesionalShape;

public class Square extends TwoDimesionalShape{

	public void setLength(int len) {
		length = len;
	}
	
	public void printArea() {
		if(length > 0 ) {
			System.out.println("Area of a square is : "+ (length*length));
		}else {
			System.out.println("Unable to calucate the area");
		}
	}
	
	
}
