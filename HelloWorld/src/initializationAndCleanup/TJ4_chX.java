package initializationAndCleanup;

public class TJ4_chX {

	public static void main(String[] args) {
		
	/* Exercise #1 - (1) Create a class containing an uninitialized String reference. 
	 * Demonstrate that this reference is initialized by Java to null.
	 */
	System.out.println("Ex1_________________");
	System.out.println("Uninitiated String is equal to " + new Ex1_testClass().s);
		
	/* Exercise #2 - (2) Create a class with a String field that is initialized at the point of definition, 
	 * and another one that is initialized by the constructor. What is the difference between the two approaches?	
	 */
	System.out.println("Ex2_________________");
	Ex2_testClass ex2 = new Ex2_testClass();
	System.out.println("s1 was " + ex2.s1);
	System.out.println("s2 was " + ex2.s2);
	// difference because fields, that was initialized at the point of definition can be static, so they can
	// be accessed without calling a constructor at all
	
	/* Exercise #3 - (1) Create a class with a default constructor (one that takes no arguments) that prints a message. 
	 * Create an object of this class.
	 */
	System.out.println("Ex3_________________");
	Ex3_testDefaultConstructor ex3 = new Ex3_testDefaultConstructor();
	
	/* Exercise #4 - (1) Add an overloaded constructor to the previous exercise that takes a String argument and prints it
	 *  along with your message.
	 */
	System.out.println("Ex4_________________");
	Ex4_testOverloadedConstructor ex4_1 = new Ex4_testOverloadedConstructor();
	Ex4_testOverloadedConstructor ex4_2 = new Ex4_testOverloadedConstructor("test overload");
	
	/* Exercise #5 - (2) Create a class called Dog with an overloaded bark( ) method. This method should be overloaded based 
	 * on various primitive data types, and print different types of barking, howling, etc., depending on which overloaded version
	 *  is called. Write a main( ) that calls all the different versions.
	 */
	System.out.println("Ex5_________________");
	Ex5_dog dog = new Ex5_dog();
	byte b = 0;
	System.out.println("Trying byte... "); dog.bark(b);
	char c = 'a';
	System.out.println("Trying char... "); dog.bark(c);
	short s = 0;
	System.out.println("Trying short... "); dog.bark(s);
	int i = 0;
	System.out.println("Trying int... "); dog.bark(i);
	long l = 0;
	System.out.println("Trying long... "); dog.bark(l);
	float f = 1.0f;
	System.out.println("Trying float... "); dog.bark(f);
	double d = 1.0;
	System.out.println("Trying double... "); dog.bark(d);
	
	/* Exercise #6 - (1) Modify the previous exercise so that two of the overloaded methods have two arguments (of two different types),
	 *  but in reversed order relative to each other. Verify that this works.
	 */
	System.out.println("Ex6_________________");
	Ex6_dog dog2 = new Ex6_dog();
	System.out.println("Trying long + int"); dog2.bark(l,i);
	System.out.println("Trying int + long"); dog2.bark(i,l);
	
	/* Exercise #7 - (1) Create a class without a constructor, and then create an object of that class in main( ) to verify that 
	 * the default constructor is automatically synthesized.
	 */
	System.out.println("Ex7_________________");
	Ex7_testClass ex7 = new Ex7_testClass();
		
	/* Exercise 8: (1) Create a class with two methods. Within the first method, call the second method twice: 
	 * the first time without using this, and the second time using this—just to see it working;
	 *  you should not use this form in practice.
	 */
	System.out.println("Ex8_________________");
	new Ex8_testClass().method2();
	
	

	}
}
