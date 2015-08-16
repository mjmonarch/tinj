package object;

// First chapter - everything is an object
public class TJ4_ch1 {
	
	private static int storage(String s) {
		return s.length() * 2;
	};
	
	public static void main(String[] args) {
	
	//	System.getProperties().list(System.out);
	//	System.out.println(System.getProperty("user.name"));
	//	System.out.println(System.getProperty("java.library.path"));
	
	/* Exercise #1 - (2) Create a class containing an int and a char that * are not initialized,
	 *  and print their values to verify that Java performs default initialization
	 */
	Ex1_1 ex1_1 = new Ex1_1();
	System.out.println("Ex1_________________");
	System.out.println(ex1_1.i);
	System.out.println(ex1_1.x);
	System.out.println();
			
	/* Exercise #2 - (1) Following the HelloDate.java example in this chapter, create a “hello, world” program
	 *  that simply displays that statement. You need only a single method in your class (the “main” one that
	 *   gets executed when the program starts). Remember to make it static and to include the argument list,
	 *    even though you don’t use the argument list. Compile the program with javac and run it using java. 
	 *    If you are using a different development environment than the JDK, learn how to compile and run programs 
	 *    in that environment.
	 */
	System.out.println("Ex2_________________");
	System.out.println("hello,world");
	System.out.println();
		
	/* Exercise #3 - (1) Find the code fragments involving ATypeName and turn them into a program that compiles 
	 * and runs.
	 */
	Ex2_ATypeName atn = new Ex2_ATypeName();
	
	/* Exercise #4 - (1) Turn the DataOnly code fragments into a program that compiles and runs.
	 */
    Ex5_DataOnly edo = new Ex5_DataOnly();
	
	/* Exercise #5 - (1) Modify the previous exercise so that the values of the data in DataOnly are assigned 
	 * to and printed in main( ).
	 */
    edo.b = false;
    edo.d = 3.1415926;
    edo.i = 17;
	System.out.println("Ex5_________________");
	System.out.println("DataOnly b:" + edo.b);
	System.out.println("DataOnly d:" + edo.d);
	System.out.println("DataOnly i:" + edo.i);
	System.out.println();
	
	/* Exercise #6 - (2) Write a program that includes and calls the storage( ) method defined as 
	 * a code fragment in this chapter.
	 */
	String s = "Exercise #6 in action";
	System.out.println("Ex6_________________");
	System.out.println(storage(s));
	System.out.println();
	
	/* Exercise #7 - (1) Turn the Incrementable code fragments into a working program.
	 */
	System.out.println("Ex7_________________");
	System.out.println("Variable value before incrementing: " + Ex7_StaticTest.i);
	Ex7_Incrementable.increment();
	System.out.println("Variable value after incrementing: " + Ex7_StaticTest.i);
	
	/* Exercise #8 - (3) Write a program that demonstrates that, no matter how many objects you create 
	 * of a particular class, there is only one instance of a particular static field in that class.
	 */
	Ex7_StaticTest st1 = new Ex7_StaticTest();
	Ex7_StaticTest st2 = new Ex7_StaticTest();
	System.out.println("Ex8_________________");
	System.out.println("Ex8_StaticTest static variable i value is equal: " + Ex7_StaticTest.i);
	System.out.println("st1 static variable i value is equal: " + st1.i);
	System.out.println("st2_StaticTest static variable i value is equal: " + st2.i);
	System.out.println("change value of static variable i of st1");
	st1.i += 10;
	System.out.println("Ex8_StaticTest static variable i value is equal: " + Ex7_StaticTest.i);
	System.out.println("st1 static variable i value is equal: " + st1.i);
	System.out.println("st2_StaticTest static variable i value is equal: " + st2.i);
	Ex7_StaticTest.i += 10;
	System.out.println("change value of static variable i of Ex7_StaticTest");
	System.out.println("Ex8_StaticTest static variable i value is equal: " + Ex7_StaticTest.i);
	System.out.println("st1 static variable i value is equal: " + st1.i);
	System.out.println("st2_StaticTest static variable i value is equal: " + st2.i);
	
	/* Exercise #9 - (2) Write a program that demonstrates that autoboxing works for all
	 *  the primitive types and their wrappers.
	 */
	System.out.println("Ex9_________________");
	Boolean b1 = false;
	boolean b2 = b1;
	System.out.println("Autoboxing boolean " + b1 + " " + b2);
	Character ch1 = 'x';
	char ch2 = ch1;
	System.out.println("Autoboxing char " + ch1 + " " + ch2);
	Byte bt1 = 1;
	byte bt2 = bt1;
	System.out.println("Autoboxing byte " + bt1 + " " + bt2);
	Short sh1 = 2;
	short sh2 = sh1;
	System.out.println("Autoboxing short " + sh1 + " " + sh2);
	Integer in1 = 3;
	int in2 = in1;
	System.out.println("Autoboxing int " + in1 + " " + in2);
	Long ln1 = 4l;
	long ln2 = ln1;
	System.out.println("Autoboxing long " + ln1 + " " + ln2);
	Float fl1 = 5.0f;
	float fl2 = fl1;
	System.out.println("Autoboxing float " + fl1 + " " + fl2);
	Double db1 = 6.0;
	double db2 = db1;
	System.out.println("Autoboxing double " + db1 + " " + db2);
	
	/* Exercise #10 - (2) Write a program that prints 
	 * three arguments taken from the command line. To do this,
	 *  you’ll need to index into the command-line array of Strings.
	 */
	System.out.println("Ex10_________________");
	System.out.println("First argument is: " + args[0]);
	System.out.println("Second argument is: " + args[1]);
	System.out.println("Third argument is: " + args[2]);

	/* Exercise #11 - (1) Turn the AllTheColorsOfTheRainbow example
	 *  into a program that compiles and runs.
	 */
	Ex11_AllTheColorsOfTheRainbow atcotr = new Ex11_AllTheColorsOfTheRainbow();
	
	
	
	}

}
