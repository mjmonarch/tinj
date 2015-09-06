package reusingClasses;



import mindview.DetergenDelegate;
import mindview.Detergent;
import mindview.Print;

class Class1 {
	int int1;
};

class MrMuscle extends Detergent {
	
	public void scrub() {
		 append(" MrMuscle.scrub()");
		 super.scrub(); // Call base-class version
	}
	
	public void sterialize() {
		append(" MrMuscle.sterialize()");
	}
		
}

class MrMuscleDelegation extends DetergenDelegate {
	
	public void scrub() {
		 append(" MrMuscle.scrub()");
		 super.scrub(); // Call base-class version
	}
	
	public void sterialize() {
		append(" MrMuscle.sterialize()");
	}
	
}

class Art {
	Art() { System.out.println("creating a memeber of class Art"); }
}

class Drawing extends Art {
	Drawing() { System.out.println("creating a member of class Drawing"); }
}
	
class Cartoon extends Drawing {
	//Cartoon() {System.out.println("creating a member of class Cartoon"); }
}

class A {
	A() { System.out.println("This is A-class default constructor!!!"); }
	A(int a) { System.out.println("This is A constructor with arguments!!!"); }
}
	
class B {
	B() { System.out.println("This is B-class default constructor!!!"); }
	B(int b) { System.out.println("This is B constructor with arguments!!!"); }
}

class C extends A {
	B b1 = new B();
}

class C1 extends A {
	B b1;
	C1() { 
		System.out.println("This is C the only one constructor!!!");
		b1 = new B (17);
	}
}

class Component1 {
	private int a;
	Component1 (int a) { System.out.println("component " + a + " constructor"); this.a = a; }
	void dispose() { System.out.println("component " + a + " dispose"); }
}

class Component2 {
	private int a;
	Component2 (int a) { System.out.println("component " + a + " constructor"); this.a = a;  }
	void dispose() { System.out.println("component " + a + " dispose"); }
}

class Component3 {
	private int a;
	Component3 (int a) { System.out.println("component " + a + " constructor"); this.a = a; }
	void dispose() { System.out.println("component " + a + " dispose"); }
}

class Root {
	Component1 comp1;
	Component2 comp2;
	Component3 comp3;
	
	Root(int a) {
		System.out.println("root constructor");
		comp1 = new Component1(1);
		comp2 = new Component2(2);
		comp3= new Component3(3);
	}
	
	void dispose() { 
		comp3.dispose();
		comp2.dispose();
		comp1.dispose();
		System.out.println("root dispose");
		}
	
}

class Stem extends Root {
	Component1 comp11;
	Component2 comp21;
	Component3 comp31;
	
	Stem(int a) { 
		super(a); 
		System.out.println("stem constructor");
		comp11 = new Component1(11);
		comp21 = new Component2(21);
		comp31 = new Component3(31);
		}
	
	void dispose() {
		comp31.dispose();
		comp21.dispose();
		comp11.dispose();
		System.out.println("stem dispose");
		super.dispose();
	}
}

class Amphibian {
	
	void say() {
		System.out.println("i am amphibian");
	}
	
	protected static void type(Amphibian anmf) {
		anmf.say();
	}
	
}

class Frog extends Amphibian {}

class Frog1 extends Amphibian {
	
	void say() {
		System.out.println("i am frog, but i am amphibian also");
	}
	
}


public class TJ4_ch6 {

	public static void main(String[] args) {

	/*Exercise #1 - (2) Create a simple class. Inside a second class, define a reference to an object of the first class. 
	 * Use lazy initialization to instantiate this object.
	 */
	System.out.println("Ex1_________________");
	Class1 class1 = new Class1();
	class1.int1 = 17;
	System.out.println(class1 + ". Int1 =" + class1.int1);

	/*Exercise #2 - (2) Inherit a new class from class Detergent. Override scrub( ) and add a new method called sterilize( ).*/
	System.out.println("Ex2_________________");
	MrMuscle mm = new MrMuscle();
	mm.dilute();
	mm.apply();
	mm.scrub();
	mm.foam();
	mm.sterialize();
	Print.print(mm);
		
	/*Exercise #3 - Even if you don’t create a constructor for Cartoon( ), the compiler will synthesize a default constructor
	 *  for you that calls the base class constructor. Prove the previous sentence.
	 */
	System.out.println("Ex3_________________");
	new Cartoon();
	
	/*Exercise #4 - (2) Prove that the base-class constructors are (a) always called and (b) called before derived-class constructors. */
	// like previuos exercise with Cartoon class' uncommented constructor
	
	/*Exercise #5 - (1) Create two classes, A and B, with default constructors (empty argument lists) that announce themselves. 
	 * Inherit a new class called C from A, and create a member of class B inside C. Do not create a constructor for C.
	 *  Create an object of class C and observe the results.
	 */
	System.out.println("Ex5_________________");
	new C();
	
	/*Exercise #7 - (1) Modify Exercise 5 so that A and B have constructors with arguments instead of default constructors. 
	 * Write a constructor for C and perform all initialization within C’s constructor.
	 */
	System.out.println("Ex6_________________");
	new C1();
	
	/*Exercise #8 - (1) Create a base class with only a non-default constructor, and a derived class with both a default (no-arg)
	 *  and non-default constructor. In the derived-class constructors, call the base-class constructor.
	 */
	System.out.println("Ex8_________________");
	new Ex8_derived(34);
	new Ex8_derived();
	
	/*Exercise #9 - (2) Create a class called Root that contains an instance of each of the classes (that you also create)
	 *  named Component1, Component2, and Component3. Derive a class Stem from Root that also contains an instance
	 *   of each “component.” All classes should have default constructors that print a message about that class.
	 */
	System.out.println("Ex9_________________");
	new Stem(17);
	
	/*Exercise #11 - (3) Modify Detergent.java so that it uses delegation. */
	System.out.println("Ex11_________________");
	// see Detergent.java
	MrMuscleDelegation mm1 = new MrMuscleDelegation();
	mm1.dilute();
	mm1.apply();
	mm1.scrub();
	mm1.foam();
	mm1.sterialize();
	Print.print(mm1);
	
	/*Exercise #12 - (3) Add a proper hierarchy of dispose( ) methods to all the classes in Exercise 9. */
	System.out.println("Ex12_________________");
	Stem st1 = new Stem(17);
	try {}
	finally { 
		System.out.println("___disposing______");
		st1.dispose();
	}
	
	/*Exercise #13 - (2) Create a class with a method that is overloaded three times. 
	 * Inherit a new class, add a new overloading of the method, and show that
	 *  all four methods are available in the derived class.
	 */
	System.out.println("Ex13_________________");
	Ex13_overload ex13 = new Ex13_overload();
	ex13.method(new Integer(1));
	ex13.method(new Character('a'));
	ex13.method(new Long(1));
	ex13.method("aaa");
	
	/*Exercise #14 - (1) In Car.java add a service( ) method to Engine and call this method in main( ). */
	// see Car.java in mindview package
	
	/*Exercise #15 - (2) Create a class inside a package. Your class should contain a protected method.
	 *  Outside of the package, try to call the protected method and explain the results. 
	 *  Now inherit from your class and call the protected method from inside a method of your derived class.
	 */
	// see package reusingClasses2
	
	/*Exercise #16 - (2) Create a class called Amphibian. From this, inherit a class called Frog.
	 *  Put appropriate methods in the base class. In main( ), create a Frog and upcast it to Amphibian 
	 *  and demonstrate that all the methods still work.
	 */
	System.out.println("Ex16_________________");
	Amphibian frog = new Frog();
	Amphibian.type(frog);
	
	/*Exercise #17 - (1) Modify Exercise 16 so that Frog overrides the method definitions from the base class
	 *  (provides new definitions using the same method signatures). Note what happens in main( ).
	 */
	System.out.println("Ex17_________________");
	Amphibian frog1 = new Frog1();
	Amphibian.type(frog1);
	
	/*Exercise #18 - (2) Create a class with a static final field and a final field and demonstrate the difference between the two. */
	System.out.println("Ex18_________________");
	Ex18_final fin1 = new Ex18_final();
	Ex18_final fin2 = new Ex18_final();
	System.out.println("fin1 fields: i =" + fin1.i + " , MJ = " + fin1.MJ);
	System.out.println("fin2 fields: i =" + fin2.i + " , MJ = " + fin2.MJ);
	
	/*Exercise #19 - (2) Create a class with a blank final reference to an object. Perform the initialization of the blank final 
	 * inside all constructors. Demonstrate the guarantee that the final must be initialized before use, 
	 * and that it cannot be changed once initialized.
	 */
	System.out.println("Ex19_________________");
	new Ex19_blankFinal(107).print();
	new Ex19_blankFinal().print();
	
	
	
	}

}
