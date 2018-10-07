package javaPractice;

public class ConstructorPractice {
	ConstructorPractice() {
		System.out.println("This is a default constructor");
	}
	ConstructorPractice(int age) {
		String status = (age >= 18) ? "You are eligible to vote" : "Sorry, you are not eligible to vote";
		System.out.println(status);
	}
	ConstructorPractice(double salary, int age) {
		this();
		System.out.println("double first and int next");
	}
	ConstructorPractice(int age, double salary) {
		System.out.println("int first and double next");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorPractice c1 = new ConstructorPractice(), c2 = new ConstructorPractice(20),
				c3 = new ConstructorPractice(5000d, 20), c4 = new ConstructorPractice(15, 70000d);
		

	}

}
