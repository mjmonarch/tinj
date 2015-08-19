package controllingExecution;

public class Ex3_5 {

	// incorrect version, because result string is needed to be 'turned reverse'
	
	public static String printBinary (int value) {
		String result = "";
		int value1 = value;
		if (value > 0) {
			while ((long) value*value1 > 0) {
				result += (value1%2 == 0) ? "0" : "1";
				value1 >>= 1;
			}
		}
		else if (value < 0 ) {
			result = "-1";
		}
		else return "0";
		return result;
	}

	
}
