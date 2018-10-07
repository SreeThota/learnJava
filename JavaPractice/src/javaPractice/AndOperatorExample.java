package javaPractice;

class OperatorExample{ 
	static int let = 100;
	int age() {
		System.out.println("The age is" + let);
		return let;
	}
	
	int age(int salary) {
		return let + salary;
	}
}  

public class AndOperatorExample {
	public static void main(String args[]){  
		int a=10;  
		int b=5;  
		int c=20;  
		System.out.println(a==b && a<c);//true || true = true  
		System.out.println(a>b&a>c);//true | true = true  
		System.out.println(a<b | a++>c);//true || true = true  
		System.out.println(a);//10 because second condition is not checked  
		System.out.println(a>b|a++<c);//true | true = true  
		System.out.println(a);//11 because second condition is checked  
		System.out.println("This is for testing");
		boolean eligible = false;
		if (!eligible) {
			int age = 18;
			eligible = (age >= 18 && age <= 60);
		}
		if (eligible) {
			System.out.println("Candidate is eligible to vote");
		}
		System.out.println("eligible" + eligible);
		OperatorExample o1 = new OperatorExample();
		o1.age();
		new OperatorExample().age();
		OperatorExample o2 = new OperatorExample();
		int data =  o2.age(49999);
		System.out.println("data is " + data);
	}
}