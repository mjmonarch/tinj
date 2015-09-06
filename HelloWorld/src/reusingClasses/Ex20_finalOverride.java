package reusingClasses;

import mindview.*;

class WithFinals {
	//Identical to "private" alone:
	private final void f() { Print.print("WithFinals.f()"); }
	//Also automatically "final":
	private void g() { Print.print("WithFinals.g()"); }
}


class Ex20_finalOverride1 extends WithFinals {

	private final void f() {
		Print.print("OverridingPrivate.f()");
	}
	
	private void g() {
		Print.print("OverridingPrivate.g()");
	}
}

class Ex20_finalOverride2 extends Ex20_finalOverride1 {
	
	//@Override
	public final void f() {
		Print.print("OverridingPrivate2.f()");
	}
	
	//@Override
	public void g() {
		Print.print("OverridingPrivate2.g()");
	}
}

public class Ex20_finalOverride {
	
public static void main(String[] args) {
	Ex20_finalOverride2 op2 = new Ex20_finalOverride2();
	op2.f();
	op2.g();
	//You can upcast:
	Ex20_finalOverride1 op = op2;
	//But you can’t call the methods:
	//! op.f();
	//! op.g();
	//Same here:
	Ex20_finalOverride1 wf = op2;
	//! wf.f();
	//! wf.g();
}
} /* Output:
OverridingPrivate2.f()
OverridingPrivate2.g()
*///:~