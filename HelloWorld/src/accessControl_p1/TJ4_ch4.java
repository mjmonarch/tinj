package accessControl_p1;

import java.util.*;
import accessContol_p2.*;
import accessControl_debugoff.*;

class Vector {}

public class TJ4_ch4 {

public static void main(String[] args) {
		
Random rand = new Random();
		
/*Exercise #1 - (1) Create a class in a package. Create an instance of your class outside of that package.
*/
System.out.println("Ex1_________________");
Ex1_demoClass ex1_dc1 = new Ex1_demoClass();
		
/*Exercise #2 -(1) Take the code fragments in this section and turn them into a program, and verify that collisions do in fact occur.
*/
System.out.println("Ex2_________________");
Vector v = new Vector();

/*Exercise #3 - (2) Create two packages: debug and debugoff, containing an identical class 
 * with a debug( ) method. The first version displays its String argument to the console, the second does nothing.
 *  Use a static import line to import the class into a test program, and demonstrate the conditional compilation effect.
 */
System.out.println("Ex3_________________");
TestDebug.debug("aaa");

/*Exercise #4 - (2) Show that protected methods have package access but are not public.
 */
System.out.println("Ex4_________________");
//trying to call protected method in the another package	
//Ex4_TestClass.test1(); - 'protected' methods have only package access without inheritance

/*Exercise #5 - (2) Create a class with public, private, protected, and package-access fields and method members.
 *  Create an object of this class and see what kind of compiler messages you get when you try to access
 *   all the class members. Be aware that classes in the same directory are part of the “default” package.
 */
Ex5_TestClass ex5 = new Ex5_TestClass();
System.out.println("Ex5_________________");
//trying to call public method
ex5.t1();
//trying to call package-access method
//ex5.t2(); // not visible
// trying to access protected method
//ex5.t3(); // not visible
//trying to access private method
//ex5.t4(); // not visible

/*Exercise #6 - (1) Create a class with protected data. Create a second class in the same file with a method
 *  that manipulates the protected data in the first class.
 */
System.out.println("Ex6_________________");

/*Exercise #8 - (4) Following the form of the example Lunch.java, create a class called ConnectionManager 
 * that manages a fixed array of Connection objects. The client programmer must not be able to explicitly 
 * create Connection objects, but can only get them via a static method in ConnectionManager.
 *  When the ConnectionManager runs out of objects, it returns a null reference. Test the classes in main( ).
 */
System.out.println("Ex8_________________");
for (int i=0; i<11; i++) 
	System.out.println("iteration #" + (i+1)+". Getting connection... Connection name is " + ConnectonManager.getConnection());

/*Exercise #9 - Create the following file in the access/local directory (presumably in your CLASSPATH):
 * ...
 * Explain why the compiler generates an error. Would making the Foreign class part of the access.local package change anything?
 */
System.out.println("Ex9_________________");
PackagedClass pc = new PackagedClass(); // class PackagedClass has package access. Should be public to keep code working

}
}
