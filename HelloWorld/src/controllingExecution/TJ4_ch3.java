package controllingExecution;

import java.util.Random;

import mindview.*;


public class TJ4_ch3 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		/*Exercise #1 - (1) (1) Write a program that prints values from 1 to 100.
		*/
		System.out.println("Ex1_________________");
		for (int i=1; i<101; i++) System.out.print(i + " ");
		System.out.println();
		
		/*Exercise #2 - (2) Write a program that generates 25 random int values. 
		 * For each value, use an if-else statement to classify it as greater than, 
		 * less than, or equal to a second randomly generated value.
		 */
		int i1 = rand.nextInt(10);
		int i2;
		System.out.println("Ex2_________________");
		for (int i=1; i<25; i++) {
			i2 = rand.nextInt(10);
			System.out.print(i +". i1 = "+i1+", i2 = "+i2 + ". ");
			if (i1 > i2)
				System.out.print("i1 greater than i2");
				else if (i1 < i2) 
					System.out.print("i1 is lesser than i2");
				else 
					System.out.print("i1 is equal i2");
			i1 = i2;
			System.out.println();
			}
		
		/*Exercise #3 - (1) Modify Exercise 2 so that your code is surrounded
		 *  by an “infinite” while loop. It will then run until you interrupt it from
		 *   the keyboard (typically by pressing Control-C).
		 */
		/*System.out.println("Ex3_________________");   // commented because of infinite loop
		for (int i=1;;i++) {
			i2 = rand.nextInt(10);
			System.out.print(i +". i1 = "+i1+", i2 = "+i2 + ". ");
			if (i1 > i2)
				System.out.print("i1 greater than i2");
				else if (i1 < i2) 
					System.out.print("i1 is lesser than i2");
				else 
					System.out.print("i1 is equal i2");
			i1 = i2;
			System.out.println();
		} */
		
		/*Exercise #4 - (3) Write a program that uses two nested for loops and the modulus operator (%) 
		 * to detect and print prime numbers (integral numbers that are not evenly divisible
		 *  by any other numbers except for themselves and 1).
		 */
		System.out.println("Ex4_________________");
		label1:
		for (int i=2; i<101; i++) {
			for (int j=2; j<i/2+1; j++) 
				if ((i%j) == 0) continue label1; 
			System.out.print(i + ", ");
			System.out.println();
		}
		
		/*Exercise #5 - (4) Repeat Exercise 10 from the previous chapter, using the ternary operator 
		 * and a bitwise test to display the ones and zeroes, instead of Integer.toBinaryString( ).
		 */
		System.out.println("Ex5_________________");
		/* Exercise #10 - (3) Write a program with two constant values, one with alternating binary ones and zeroes, 
		 * with a zero in the least-significant digit, and the second, also alternating, 
		 * with a one in the least-significant digit (hint: It’s easiest to use hexadecimal constants for this). 
		 * Take these two values and combine them in all possible ways using the bitwise operators, 
		 * and display the results using Integer.toBinaryString( ).
		 */
		int i10 = 052525252;
		int i11 = 025252525;
		System.out.println("i10 in numerical: " + i10 + ", in binary: " + Integer.toBinaryString(i10));
		System.out.println("i10 in numerical: " + i10 + ", in binary: " + Ex3_5.printBinary(i10));
		System.out.println("i11 in numerical: " + i11 + ", in binary: " + Integer.toBinaryString(i11));
		System.out.println("i10 in numerical: " + i11 + ", in binary: " + Ex3_5.printBinary(i11));
		//System.out.println("using bitwise and operator: " + Integer.toBinaryString(i10&i11) + ", in numerical: " + (i10&i11));
		//System.out.println("using bitwise or operator: " + Integer.toBinaryString(i10|i11) + ", in numerical: " + (i10|i11));
		//System.out.println("using bitwise xor operator: " + Integer.toBinaryString(i10^i11) + ", in numerical: " + (i10^i11));
		//System.out.println("using bitwise not operator at i10: " + Integer.toBinaryString(~i10)  + ", in numerical: " + (~i10));
		//System.out.println("using bitwise not operator at i11: " + Integer.toBinaryString(~i11) + ", in numerical: " + (~i11));
		//System.out.println(i10 + " " + ~i10);
		//System.out.println(i11 + " " + ~i11);
		System.out.println("one" + "two");
	}

}
