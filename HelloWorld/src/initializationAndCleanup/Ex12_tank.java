package initializationAndCleanup;

public class Ex12_tank {

	private enum condition {empty, full};
	
	private condition state = condition.empty;
	
	Ex12_tank (int i) {
		state = (i>0) ? condition.full : condition.empty;
	}
	
	void fill() { state = condition.full; }
	
	void empty() { state = condition.empty; }
	
	protected void finalize() {
		// checking for proper termination condition
		if (state != condition.empty) {
			System.out.println(this + " was terminated while full - TERMINATION WARNING!!!");
		}
	}
	
}
