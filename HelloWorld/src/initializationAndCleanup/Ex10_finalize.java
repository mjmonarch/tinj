package initializationAndCleanup;

public class Ex10_finalize {

	private int i = 0;
	
	public Ex10_finalize() {
		System.out.println("creating new class member...");
		i = 17;
	}
	
	protected void finalize() {
		System.out.println("finalizing...");
		System.out.println(i);
	}
	
}
