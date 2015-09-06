package controllingExecution;

import java.util.Random;



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
		int i10 = 052525252;
		int i11 = 025252525;
		System.out.println("i10 in numerical: " + i10 + ", in binary: " + Integer.toBinaryString(i10));
		System.out.println("i10 in numerical: " + i10 + ", in binary: " + Ex3_5_1.printBinary(i10));
		System.out.println("i11 in numerical: " + i11 + ", in binary: " + Integer.toBinaryString(i11));
		System.out.println("i10 in numerical: " + i11 + ", in binary: " + Ex3_5_1.printBinary(i11));

		//test for correctness of static procedure printBinary
		label2:
		for (int i=1; i<100; i++) {
			int r = rand.nextInt();
			if (Integer.toBinaryString(r).equals(Ex3_5_1.printBinary(r)) != true) {
				System.out.println("test failed");
				break label2;
			}
		}
		
		/*Exercise #6 - (2) Modify the two test( ) methods in the previous two programs so that they 
		 * take two extra arguments, begin and end, and so that testval is tested to see if it is within
		 *  the range between (and including) begin and end.
		 */
		System.out.println("Ex5_________________");
		int i3;
		for (int i=0; i<10; i++) {
			i1 = rand.nextInt(10); // test value					
			i2 = rand.nextInt(10); // begin of interval
			i3 = rand.nextInt(10); // end of interval			
			System.out.println("begin = " + i2 + " , end = " + i3 + " , testvalue = " + i1 + " , result of testing range is: " + Ex3_6.test(i1, i2, i3) );
		}
		
		/*Exercise #7 - (1) Modify Exercise 1 so that the program exits by using the break keyword
		 *  at value 99. Try using return instead
		 */
		System.out.println("Ex7_________________");
		for (int i=1; i<101; i++) {
			System.out.print(i + " ");
			if (i==99) break;
		}
		System.out.println();
		
		/*Exercise #8 - (2) Create a switch statement that prints a message for each case, and put the switch inside 
		 * a for loop that tries each case. Put a break after each case and test it, 
		 * then remove the breaks and see what happens.	
		 */
		System.out.println("Ex8_________________");
		for (int i=0; i<10; i++) {
			i1 = rand.nextInt(7);
			switch (i1) {
			case 0 : System.out.println(i + " - 0");   break;
			case 1 : System.out.println(i + " - 1");   break;
			case 2 : System.out.println(i + " - 2");   break;
			case 3 : System.out.println(i + " - 3");   break;
			case 4 : System.out.println(i + " - 4");   break;
			case 5 : System.out.println(i + " - 5");   break;
			case 6 : System.out.println(i + " - 6");   break;
			case 7 : System.out.println(i + " - 7");   break;
			default: System.out.println(i + " - UNKNOWN");    			
			}
		}
		
		/*Exercise #9 - (4) A Fibonacci sequence is the sequence of numbers 1, 1, 2, 3, 5, 8, 13, 21, 34, and so on,
		 *  where each number (from the third on) is the sum of the previous two. Create a method that takes 
		 *  an integer as an argument and displays that many Fibonacci numbers starting from the beginning, e.g.,
		 *   If you run java Fibonacci 5 (where Fibonacci is the name of the class) the output will be: 1, 1, 2, 3, 5.
		 */
		System.out.println("Ex9_________________");
		i1 = rand.nextInt(20);
		System.out.println("Fibonacci sequence of " + i1 + " numbers: ");
		Ex3_9.Fibonacci(i1);
		
		/*Exercise #10 - (5) A vampire number has an even number of digits and is formed by multiplying a pair of numbers 
		 * containing half the number of digits of the result. The digits are taken from the original number in any order. 
		 * Pairs of trailing zeroes are not allowed. Examples include:
		 * 1260 = 21 * 60
		 * 1827 = 21 * 87
		 * 2187 = 27 * 81
		 * Write a program that finds all the 4-digit vampire numbers. (Suggested by Dan Forhan.)
		*/
		
		System.out.println("Ex9_________________");
		int t1, t2;
		for (int j1=1; j1<10; j1++) {
			for (int j2=0; j2<10; j2++) {
				t1 = j1*10 + j2;
				for (int j3=0; j3<10; j3++) {
					for (int j4=0; j4<10; j4++) {
						//System.out.print(j1*1000+j2*100+k1*10+k2);
						//System.out.print(" " + (j1*10+j2) + " " + (k1*10+k2));
						//System.out.println();
						t2 = j3*10 + j4;
						if (t1*t2 == (j1*1000+j2*100+j3*10+j4)) System.out.println((j1*1000+j2*100+j3*10+j4) + " = " + t1 + " x " + t2);
						if (t1*t2 == (j1*1000+j3*100+j2*10+j4)) System.out.println((j1*1000+j3*100+j2*10+j4) + " = " + t1 + " x " + t2);
						if (t1*t2 == (j1*1000+j4*100+j3*10+j2)) System.out.println((j1*1000+j4*100+j3*10+j2) + " = " + t1 + " x " + t2);
						if (t1*t2 == (j1*1000+j4*100+j2*10+j3)) System.out.println((j1*1000+j4*100+j2*10+j3) + " = " + t1 + " x " + t2);
						if (t1*t2 == (j1*1000+j2*100+j4*10+j3)) System.out.println((j1*1000+j2*100+j4*10+j3) + " = " + t1 + " x " + t2);
						if (t1*t2 == (j1*1000+j3*100+j4*10+j2)) System.out.println((j1*1000+j3*100+j4*10+j2) + " = " + t1 + " x " + t2);
						if (t1*t2 == (j2*1000+j1*100+j3*10+j4)) System.out.println((j2*1000+j1*100+j3*10+j4) + " = " + t1 + " x " + t2);
						if (t1*t2 == (j2*1000+j1*100+j4*10+j3)) System.out.println((j2*1000+j1*100+j4*10+j3) + " = " + t1 + " x " + t2);
						if (t1*t2 == (j2*1000+j3*100+j1*10+j4)) System.out.println((j2*1000+j3*100+j1*10+j4) + " = " + t1 + " x " + t2);
						if (t1*t2 == (j2*1000+j3*100+j4*10+j1)) System.out.println((j2*1000+j3*100+j4*10+j1) + " = " + t1 + " x " + t2);
						if (t1*t2 == (j2*1000+j4*100+j1*10+j3)) System.out.println((j2*1000+j4*100+j1*10+j3) + " = " + t1 + " x " + t2);
						if (t1*t2 == (j2*1000+j4*100+j3*10+j1)) System.out.println((j2*1000+j4*100+j3*10+j1) + " = " + t1 + " x " + t2);
											
					}
				}
			}
		}
		
	}

}
