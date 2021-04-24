package javabasics.assignments;

public class CreateStudents {

	public static void main(String[] args) {
		
	   Students vidya =  new Students();
	   Students rajesh =  new Students();
	   
	   System.out.println(vidya.getName());
	   System.out.println(vidya.getFromLocation());
	   System.out.println(vidya.getJob());

	   vidya.setName("Vidya");
	   vidya.setFromLocation("Madurai");
	   vidya.setJob("Actively Looking");
	   
	   System.out.println(vidya.getName());
	   System.out.println(vidya.getFromLocation());
	   System.out.println(vidya.getJob());
	   
	   rajesh.setName("Rajesh");
	   rajesh.setFromLocation("Hyderbad");
	   rajesh.setJob("BA");
	   
	   System.out.println(rajesh.getName());
	   System.out.println(rajesh.getFromLocation());
	   System.out.println(rajesh.getJob());
	   
	   
		
		
		

	}

}
