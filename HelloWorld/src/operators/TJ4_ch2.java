
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
		System.out.println("Ex10_________________");
		int i10 = 052525252;
		int i11 = 025252525;
		System.out.println("i10 in numerical: " + i10 + ", in binary: " + Integer.toBinaryString(i10));
		System.out.println("i10 in numerical: " + i11 + ", in binary: " + Integer.toBinaryString(i11));
		System.out.println("using bitwise and operator: " + Integer.toBinaryString(i10&i11) + ", in numerical: " + (i10&i11));
		System.out.println("using bitwise or operator: " + Integer.toBinaryString(i10|i11) + ", in numerical: " + (i10|i11));
		System.out.println("using bitwise xor operator: " + Integer.toBinaryString(i10^i11) + ", in numerical: " + (i10^i11));
		System.out.println("using bitwise not operator at i10: " + Integer.toBinaryString(~i10)  + ", in numerical: " + (~i10));
		System.out.println("using bitwise not operator at i11: " + Integer.toBinaryString(~i11) + ", in numerical: " + (~i11));
		
		/* Exercise #11 - (3) Start with a number that has a binary one in the most significant position
		 *  (hint: Use a hexadecimal constant). Using the signed right-shift operator, right shift it all the way through all 
		 *  of its binary positions, each time displaying the result using Integer.toBinaryString( ).
		 */
		System.out.println("Ex11_________________");
		int i13 = 020000000000;
		System.out.println("starting value: " + Integer.toBinaryString(i13) + " " + i13);
		for (int i=1; i<32;i++) {
			i13 >>= 1;
			System.out.println("perfoming a signed right shift by 1 ... " + Integer.toBinaryString(i13) + " " +i13);
		}
		
		/* Exercise #12 - (3) Start with a number that is all binary ones. Left shift it, then use the unsigned
		 *  right-shift operator to right shift through all of its binary positions, each time displaying 
		 *  the result using Integer.toBinaryString( ).
		 */
		System.out.println("Ex12_________________");
		int i14 = -1;
		System.out.println("starting value: " + Integer.toBinaryString(i14) + " " + i14);
		i14 <<= 10;
		System.out.println("after left shifting by 30 positions: " + Integer.toBinaryString(i14) + " " + i14);
		for (int i=1; i<32;i++) {
			i14 >>>= 1;
			System.out.println("perfoming an unsigned right shift by 1 ... " + Integer.toBinaryString(i14) + " " +i14);
		}
		
		/* Exercise #13 - (1) Write a method that displays char values in binary form. 
		 * Demonstrate it using several different characters.
		 */
		System.out.println("Ex13_________________");
		char ch1 ='m';
		char ch2 = 'a';
		char ch3 = 's';
		char ch4 = 'h'; 
		System.out.println("char value " + ch1 + " in binary form: " + Integer.toBinaryString(ch1) +" "+ (int)ch1);
		System.out.println("char value " + ch2 + " in binary form: " + Integer.toBinaryString(ch2) +" "+ (int)ch2);
		System.out.println("char value " + ch3 + " in binary form: " + Integer.toBinaryString(ch3) +" "+ (int)ch3);
		System.out.println("char value " + ch4 + " in binary form: " + Integer.toBinaryString(ch4) +" "+ (int)ch4);
	
		/* Exercise #14 (3) Write a method that takes two String arguments and uses all the boolean comparisons 
		 * to compare the two Strings and print the results. For the == and !=, also perform the equals( ) test.
		 *  In main( ), call your method with some different String objects.
		 */
		System.out.println("Ex14_________________");
		String str1 = "nil";
		String str2 = "one";
		String str3 = "one";
		Ex2_14.strCompare(str1, str2);
		Ex2_14.strCompare(str2, str3);
		
	}

}
