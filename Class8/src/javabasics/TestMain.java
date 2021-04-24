package javabasics;

public class TestMain {

	public static void main(String[] args) {
		
		int a = 20;
		int b = 25;
		int c = 30;
		
		// Understanding if-else
		if(a<=b) {
			System.out.println("a > b");
		}else if(b > c) {
			System.out.println("b > c");
		}else {
			System.out.println("c > b");
		}
		
		
		String studentName = "sfsdfdwf";
		
		switch(studentName.toLowerCase()) {
			case "souvik" : System.out.println("Role - Trainer");break;
			case "rajesh" : System.out.println("Role - BA");break;
			case "vidya" : System.out.println("Role - Student");break;
			case "liliana" : System.out.println("Role - Student");break;
			default : System.out.println("No valid information provided");
		}
		
		
		
		
		

	}

}
