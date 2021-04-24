package testconstructor;

public class TestCar {

	public static void main(String[] args) {
		
		Car nocar = new Car();
		
		System.out.println(nocar.getBrand());
		System.out.println(nocar.getModel());
		System.out.println(nocar.getEngine());
		System.out.println(nocar.getSeat());
		
		Car merc =  new Car("Merc","Class C",2.2f,5);
		
		System.out.println(merc.getBrand());
		System.out.println(merc.getModel());
		System.out.println(merc.getEngine());
		System.out.println(merc.getSeat());
	
	}

}
