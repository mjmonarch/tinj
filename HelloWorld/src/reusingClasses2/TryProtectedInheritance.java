package reusingClasses2;

import reusingClasses.Ex15_protected;

class TryProtected {
	
	Ex15_protected ex15 = new Ex15_protected();
	//ex15.protectedMethod(); cannot call because it is not visible
	
}


public class TryProtectedInheritance extends Ex15_protected{

	public void tryMe() {
		this.protectedMethod();
	}
	
	public static void main(String[] args) {
		
		new TryProtectedInheritance().tryMe(); // this will work
		
	}

}
