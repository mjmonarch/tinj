package initializationAndCleanup;

public class Ex8_testClass {

	/* Exercise 8: (1) Create a class with two methods. Within the first method, call the second method twice: 
	 * the first time without using this, and the second time using this—just to see it working;
	 *  you should not use this form in practice.
	 */
	
	private void method1 (){ System.out.println("method 1()");}
	
	public void method2() {
		method1();
		this.method1();
	}
	
}
