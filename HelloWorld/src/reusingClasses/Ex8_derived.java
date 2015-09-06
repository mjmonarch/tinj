package reusingClasses;

class Ex8_base {
	
	public Ex8_base(int i) {
	System.out.println("this is base constructor with args");
	}
	
}


class Ex8_derived extends Ex8_base {

	public Ex8_derived(int i) {
		super(17);
		System.out.println("this is derived constructor with args");
	}
	
	public Ex8_derived() {
		super(0);
		System.out.println("this is derived default constructor ");
	}
	
	
}
