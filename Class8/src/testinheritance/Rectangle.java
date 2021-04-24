package testinheritance;

import javabasics2.TwoDimesionalShape;

public class Rectangle extends TwoDimesionalShape{

	public void setLength(int len) {
		length = len;
	}
	
	public void setBreadth(int br) {
		breadth = br;
	}
	
	public void printArea() {
		if(length > 0 && breadth > 0) {
			System.out.println("Area of a rectangle is : "+ (length*breadth));
		}else {
			System.out.println("Unable to calucate the area");
		}
		
	
	}
	
}
