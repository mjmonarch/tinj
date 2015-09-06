package initializationAndCleanup;

import java.lang.management.GarbageCollectorMXBean;
import java.util.Random;

import javax.crypto.spec.GCMParameterSpec;

public class TJ4_chX {

	enum currency {USD, UAH, RUB, JPY, GBP, EUR};
		
	static void varargMethod (String... str1){
		for (String s: str1) {
			System.out.println(s);
		}
	}
	
	static void enumPrint (currency cur2) {
		switch (cur2) {
		case USD: System.out.print("dollar USA"); break;
		case RUB: System.out.print("rubl Russia"); break;
		case JPY: System.out.print("yena Japan");  break;
		case GBP: System.out.print("pound Great Britain"); break;
		case EUR: System.out.print("euro European Union"); break;
		default: System.out.print("hrivna Ukraine");
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
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
	
	/*Exercise #9 - (1) Create a class with two (overloaded) constructors. Using this, call the second constructor inside the first one. */
	System.out.println("Ex9_________________");
	new Ex9_testClass();
	
	/*Exercise #10 - (2) Create a class with a finalize( ) method that prints a message. In main( ), create an object of your class.
	 *  Explain the behavior of your program.
	 */
	System.out.println("Ex10_________________");
	new Ex10_finalize();
		
	/*Exercise #11 - (4) Modify the previous exercise so that your finalize( ) will always be called. */
	System.out.println("Ex11_________________");
	System.gc();
	Thread.sleep(100);
	                   
	/*Exercise #12 - (4) Create a class called Tank that can be filled and emptied, and has a termination condition that it must be empty 
	 * when the object is cleaned up. Write a finalize( ) that verifies this termination condition. In main( ), test the possible 
	 * scenarios that can occur when your Tank is used.
	 */
	System.out.println("Ex12_________________");
	Ex12_tank tank1 = new Ex12_tank(0);
	Ex12_tank tank2 = new Ex12_tank(5);
	new Ex12_tank(4); // tank with default state
	tank1.fill();
	tank1.empty();
	tank2.fill();
	//forget to empty anonymous tank
	System.gc();
	Thread.sleep(100);
	
	/*Exercise #14 - (1) Create a class with a static String field that is initialized at the point of definition, and another one
	 *  that is initialized by the static block. Add a static method that prints both fields and demonstrates that they are both initialized
	 *   before they are used.
	 */
	System.out.println("Ex14_________________");
	Ex14_static ex14 = new Ex14_static();
	ex14.printStrings();
	
	/*Exercise #15 - (1) Create a class with a String that is initialized using instance initialization. */
	System.out.println("Ex15_________________");
	Ex15_instanceInitialization ex15 = new Ex15_instanceInitialization("33");
	ex15.print();
	
	/*Exercise #16 - (1) Create an array of String objects and assign a String to each element. Print the array by using a for loop.*/
	System.out.println("Ex16_________________");
	String[] strArray = new String[new Random().nextInt(10)];
	for (int i1 = 0; i1<strArray.length; i1++) {
		strArray[i1] = "string #" + i1;
	}
	for (String s1 : strArray) {
		System.out.println(s1);
	}
	
	/*Exercise #17 - (2) Create a class with a constructor that takes a String argument. During construction, print the argument. 
	 * Create an array of object references to this class, but don’t actually create objects to assign into the array.
	 *  When you run the program, notice whether the initialization messages from the constructor calls are printed.
	 */
	System.out.println("Ex17_________________");
	Ex17_array[] arr1 = new Ex17_array[3];
	
	/*Exercise #18 - (1) Complete the previous exercise by creating objects to attach to the array of references. */
	System.out.println("Ex18_________________");
	for (Ex17_array ex17 : arr1) {
		ex17 = new Ex17_array("hello");
	}
	
	/*Exercise #19 - (2) Write a method that takes a vararg String array. Verify that you can pass either a comma-separated 
	 * list of Strings or a String[] into this method.
	 */
	System.out.println("Ex19_________________");
	varargMethod("string1", "string2", "string3");
	String[] strArray2 = new String[3];
	for (int i2=0; i2<3; i2++) {
		strArray2[i2] = "str" + i2;
	}
	varargMethod(strArray2);
	
	/*Exercise #21 - (1) Create an enum of the least-valuable six types of paper currency.
	 *  Loop through the values( ) and print each value and its ordinal( ).
	 */
	System.out.println("Ex21_________________");
	for (currency cur : currency.values()) {
		System.out.println(("enum#" + cur.ordinal() + ": " +  cur));
	}
	
	/*Exercise #22 - (2) Write a switch statement for the enum in the previous example.
	 *  For each case, output a description of that particular currency.
	 */
	System.out.println("Ex22_________________");
	for (currency cur : currency.values()) {
		System.out.print("enum#" + cur.ordinal() + ": " +  cur + " - ");
		enumPrint(cur);
		System.out.println();
	}
	
	
	}
}
