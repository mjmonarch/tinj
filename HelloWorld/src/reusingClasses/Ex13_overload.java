package reusingClasses;

class Ex13_base {
	
	void method (int a) { System.out.println("method with int"); }	
	void method  (char a) { System.out.println("method with char"); }
	void method (long a) { System.out.println("method with long"); }
	
}

public class Ex13_overload extends Ex13_base {
	
	void method (String a) { System.out.println("method with String"); }

}
