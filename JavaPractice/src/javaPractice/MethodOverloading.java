package javaPractice;

class Adder {
	
	Adder() {
		System.out.println("This is parent class constructor");
	}
	
	{
		System.out.println("Parent class Instance block");
	}
	
	static String name;
	
	static long add(int a, long b) {
		System.out.println("long return type called");
		return a + b;
	}
	
	static int add(int a, int b) {
		System.out.println("int return type called");
		return a + b;
	}
	
	static double add(double a, double b) {
		System.out.println("double return type called");
		return Math.round(a + b);
	}
	
	String collegeName(String sName, String college) {
		return sName + " is from " + college + "============================";
	}

}

public class MethodOverloading extends Adder {
	
	MethodOverloading() {
//		super();
		System.out.println("This is child class constructor");
	}
	
	{}
	
	String getUserName(String firstName, String lastName) {
		return firstName.toLowerCase().charAt(0) + lastName.toLowerCase();
	}
	
	String getUserName(String firstName, String middleName, String lastName) {
		if (middleName == "") {
		return firstName.toLowerCase().charAt(0) + lastName.toLowerCase();
		} else {
			return firstName.toLowerCase().charAt(0) + middleName.toLowerCase() + lastName.toLowerCase();
		}
	}
	
	static int add(int a, int b) {
		int firstValue = a;
		int secondValue = b;
		System.out.println("first value is " + firstValue);
		System.out.println("second value is " + secondValue);
		return firstValue + secondValue;
	}
	
	static String name =  "Sreenivasulu Thota";
	void getName() {
		System.out.println("name before " + super.name);
		System.out.println("name after " + name);
	}
	
	String collegeName(String name, String village) {
		System.out.println("user name is " + name);
		System.out.println("user is from " + village + " village");
		return name + " is from " + village;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Adder.add(2.2,2));
		System.out.println(Adder.add(4, 6));
		System.out.println(Adder.add(5, 44));
		MethodOverloading mo = new MethodOverloading();
//		String userName = mo.getUserName("Sreenivasulu", "Thota");
//		System.out.println("user name" + userName);
//		
//		String userNameWithMiddle = mo.getUserName("Sreenivasulu", "NoMiddleName", "Thota");
//		System.out.println("user name with middle" + userNameWithMiddle);
//		
//		System.out.println(add(100, 100));
//		mo.getName();
		Adder ad = new Adder();
		System.out.println(mo.collegeName("Sreenivasulu", "ACET"));
	}

}
