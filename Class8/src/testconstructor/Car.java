package testconstructor;

public class Car {

	// Global Space
	private String brand;
	private String model;
	private float engine;  
	private int seat;  
	
	
	public Car() {
		System.out.println("This is a default constructor");
		brand = "no brand";model = "no model";engine = 0.0f;seat =0;
	}
	
	public Car(String br,String mod,float eng,int se) {
		brand = br;model = mod;engine = eng;seat =se;
	}
	
	public String getBrand() {
		return brand;
	}
	public String getModel() {
		return model;
	}
	public float getEngine() {
		return engine;
	}
	public int getSeat() {
		return seat;
	}

}
