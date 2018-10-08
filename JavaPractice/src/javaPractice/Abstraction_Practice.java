package javaPractice;

abstract class ParentAbstractClass {
	ParentAbstractClass() {
		System.out.println("This is parent class construcctor");
	}
	abstract void print();
	void run() {
		System.out.println("We are running in parent classs");
	}
}

public class Abstraction_Practice extends ParentAbstractClass {
	
	Abstraction_Practice() {
		System.out.println("This is child class constructor");
	}
	
	void print() {
		System.out.println("Here, I am printing after implementation");
	}
	
	void run() {
		System.out.println("We are running in child classs ================");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentAbstractClass p1 = new Abstraction_Practice();
		p1.print();
		p1.run();
	}

}

/* output
This is parent class construcctor
This is child class constructor
Here, I am printing after implementation
We are running in child classs
**/