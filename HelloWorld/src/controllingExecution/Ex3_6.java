package controllingExecution;

public class Ex3_6 {
	
	static int test(int testval, int begin, int end) {
		if (testval > end) 
			return -1;
		else if(testval < begin)
			return -1;
		else
			return 1; // testval is between begin and end
		}
	
}
