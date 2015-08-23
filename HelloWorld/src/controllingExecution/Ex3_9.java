package controllingExecution;

public class Ex3_9 {

	public static void Fibonacci (int count) {
		
		int i1; 
		int i2;
		int i3;
		
		switch (count) {
		case 1: System.out.print("1 "); break;
		case 2: System.out.print("1 1 "); break;
		default: {
			System.out.print("1 1 ");
			i1 = 1;
			i2 = 1;
			for (int i=3; i<=count; i++) {
				System.out.print((i1+i2) + " ");
				i3 = i2;
				i2 += i1;
				i1 = i3;
			}
		}
		}
		System.out.println();
		
	}
	
}
