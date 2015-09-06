package initializationAndCleanup;

/*Exercise #14 - (1) Create a class with a static String field that is initialized at the point of definition, and another one
 *  that is initialized by the static block. Add a static method that prints both fields and demonstrates that they are both initialized
 *   before they are used.
 */

public class Ex14_static {
	
	static String static1 = "first static string";
	static String static2;
	static {
		System.out.println("static1: " + static1 + ", static2: " + static2);
		static2 = "second static string";
	}
	
	void printStrings (){
		System.out.println(static1);
		System.out.println(static2);
	}
	
	public Ex14_static() {
		System.out.println("inside constructor");
	}
	
}
