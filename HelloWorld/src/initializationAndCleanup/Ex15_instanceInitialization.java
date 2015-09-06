package initializationAndCleanup;

public class Ex15_instanceInitialization {

	private String i;
	private String j;
	
	{ 
		System.out.println("inside instance initializatoin");
		i = "17";
	}
	
	public Ex15_instanceInitialization(String j) {
		System.out.println("inside constructor");
		this.j = j;
	}
	
	void print (){
		System.out.println("i= " + i + ", j = " + j);
	}
	
	
}
