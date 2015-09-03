package accessControl_debug;

public class Ex6_TestClass {

	protected static int i = 17;
	
}

class Test {
	
	int j;
	
	void test() { j = Ex6_TestClass.i + 1;} 
	
}
