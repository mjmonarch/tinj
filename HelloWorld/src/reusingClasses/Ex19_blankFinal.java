package reusingClasses;

public class Ex19_blankFinal {

	final int i;
	
	public Ex19_blankFinal() {
		i = 17;
	}
	
	public Ex19_blankFinal( int i){
		this.i = i;
	}
	
	void print() {
		System.out.println("i is equal to " + i);
	}
	
}
