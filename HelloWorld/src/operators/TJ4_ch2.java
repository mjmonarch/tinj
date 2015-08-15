package operators;

import java.util.Random;

import mindview.*;

//Second chapter - ...
public class TJ4_ch2 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		/*Exercise #1 - (1) Write a program that uses the “short” and normal form
		*of print statement.
		*/
		System.out.println("Ex1_________________");
		System.out.println("This was printed by normal print form");
		Print.print("This was printed by short print form");
		Print.print();
		
		/*Exercise #2 - (1) Create a class containing a float and use it to demonstrate aliasing.
		 */
		System.out.println("Ex2_________________");
		Ex2_2 e1 = new Ex2_2();
		Ex2_2 e2 = new Ex2_2();
		e1.d2 = 0.33;
		e2.d2 = 0.5;
		System.out.println("e1.d2 is equal: " + e1.d2 + ", otherwise e2.d2 is equal: " + e2.d2);
		System.out.println("e1=e2, changing e1.d2");
		e1 = e2;
		e1.d2 = 1.0;
		System.out.println("e1.d2 is equal: " + e1.d2 + ", otherwise e2.d2 is equal: " + e2.d2);
		
		/* Exercise #3 - (1) Create a class containing a float and use it to demonstrate aliasing
		 *  during method calls.
		 */
		System.out.println("Ex3_________________");
		Ex2_2 e3 = new Ex2_2();
		e3.d2 = 0.5;
		System.out.println("e3.d2 is equal: " + e3.d2);
		System.out.println("performing change()");
		Ex2_3.change(e3);
		System.out.println("e3.d2 is equal: " + e3.d2);
		
		/* Exercise #4 - (2) Write a program that calculates velocity using a constant distance 
		 * and a constant time.
		 */
		System.out.println("Ex4_________________");
		double d = rand.nextDouble()*100;
		double t = rand.nextDouble()*100;
		System.out.println("distance is equal to " + d + "; time is equal to " + t);
		System.out.println("calculating velocity... velocity is equal to " + Ex2_4.velocity(d, t));
		
		/* Exercise #5 - (2) Create a class called Dog containing two Strings: name and says. In main( ), 
		 * create two dog objects with names “spot” (who says, “Ruff!”) and “scruffy” (who says, “Wurf!”).
		 *  Then display their names and what they say.
		 */
		System.out.println("Ex5_________________");
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		dog1.name = "spot";
		dog1.says = "Ruff!";
		dog2.name = "scruffy";
		dog2.says = "Wurf!";
		System.out.println("dog1 has a name " + dog1.name + ", and says " + dog1.says);
		System.out.println("dog2 has a name " + dog2.name + ", and says " + dog2.says);
		
		/* Exercise #6 - (3) Following Exercise 5, create a new Dog reference and assign it to spot’s object.
		 *  Test for comparison using == and equals( ) for all references.
		 */
		System.out.println("Ex6_________________");
		Dog dog3 = new Dog();
		dog3 = dog1;
		System.out.println("checking ==, result is " + (dog3==dog1));
		System.out.println("checking equals, result is " + dog3.equals(dog1));
		
		/* Exercise #7 - (3) Write a program that simulates coin-flipping.
		 */
		System.out.println("Ex7_________________");
		Double d7 = rand.nextDouble();
		System.out.println("Throwing a coin. Result is " + (d7 > 0.5));
		
		/* Exercise #8 - (2) Show that hex and octal notations work with long values.
		 *  Use Long.toBinaryString( ) to display the results.
		 */
		System.out.println("Ex8_________________");
		Long l1 = 0123l;
		System.out.println("Octal long l1 in binary is " + Long.toBinaryString(l1)+ ", in classic representation is " + l1);
		Long l2 = 0xabcdl;
		System.out.println("Hex long l2 in binary is " + Long.toBinaryString(l2) + ", in classic representation is " + l2);
		
		/* Exercise #9 - (1) Display the largest and smallest numbers for both float
		 *  and double exponential notation.
		 */
		System.out.println("Ex9_________________");
		Float f1 = Float.MAX_VALUE;
		Float f2 = Float.MIN_VALUE;
		System.out.println("Min float value is " + f2 + ", Max float value is " + f1);
		Double d1 = Double.MAX_VALUE;
		Double d2 = Double.MIN_VALUE;
		System.out.println("Min double value is " + d2 + ", Max double value is " + d1);
		
		/* Exercise #10 - (3) Write a program with two constant values, one with alternating binary ones and zeroes, 
		 * with a zero in the least-significant digit, and the second, also alternating, 
		 * with a one in the least-significant digit (hint: It’s easiest to use hexadecimal constants for this). 
		 * Take these two values and combine them in all possible ways using the bitwise operators, 
		 * and display the results using Integer.toBinaryString( ).
		 */
		
	}

}
