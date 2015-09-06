package mindview;


public class DetergenDelegate extends Cleanser {
	
private Cleanser cleanser1 = new Cleanser();
	
public void append(String a) { cleanser1.append(a); }

public void scrub() {
 cleanser1.append(" Detergent.scrub()");
 cleanser1.scrub(); 
}

// Add methods to the interface:
public void foam() { cleanser1.append(" foam()"); }

public void dilute() { cleanser1.dilute(); }

public void apply() { cleanser1.apply(); }

public String toString() { return cleanser1.toString(); }


// Test the new class:
public static void main(String[] args) {
 DetergenDelegate x = new DetergenDelegate();
 x.dilute();
 x.apply();
 x.scrub();
 x.foam();
 Print.print(x);
}	
} /* Output:
Cleanser dilute() apply() Detergent.scrub() scrub() foam()
*///:~

