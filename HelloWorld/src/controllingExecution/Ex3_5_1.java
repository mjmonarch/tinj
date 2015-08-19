package controllingExecution;

public class Ex3_5_1 {

	//correct version
	
	// alternative to Integer.toBinaryString(...) method	
	public static String printBinary (int value) {
		String result = "";
		int len = 1; // determine `length` of value in binary representation
		int value1 = value;
		if (value > 0) {
			
			
			label1:
			for (int i=1; i<32; i++) {            // calculating `length` of value in binary representation
				if (value1 > Math.pow(2, i)) 
					len++;
				else break label1;
			}
			
			//System.out.println("len =" + len);
		
			// variant #1
			/*result += "1";
			value1 -= Math.pow(2, len-1);
			
			for (int i=1; i<len; i++) {
				if (value1 >= Math.pow(2,len-i-1)) {
					result += "1";
					value1 -= Math.pow(2, len-i-1);
				}
				else result += "0";
			}*/
			
			//variant #2
			for (int i=len-1; i>=0; i--) {
				result += ((value1 & (int) Math.pow(2,i)) != 0) ? "1" : "0";
			}
			
		}
			
			
		else if (value < 0 ) {
			
			label1:
			for (int i=1; i<32; i++) {            // calculating `length` of value in binary representation
				if (value1 < -Math.pow(2, i)) 
					len++;
				else break label1;
			}
		
			for (int i=0; i<32-len; i++) result += "1";
			
			result += "0";
			value1 += Math.pow(2, len-1);
				
			for (int i=1; i<len; i++) {
				if (value1 >= -Math.pow(2,len-i-1)) 
					result += "1";
				else {
					result += "0";	
					value1 += Math.pow(2, len-i-1);
				}
			}
		
		}
		else return "0";
		return result;
	}
	
}
