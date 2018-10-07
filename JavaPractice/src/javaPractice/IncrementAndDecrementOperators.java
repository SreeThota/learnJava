package javaPractice;

public class IncrementAndDecrementOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Note: increment and decrement operators applicable to every primitive type except boolean
		
		int x = 10;
		int y = ++x;
		System.out.println(y);
		int z = x++;
		System.out.println(z);
		System.out.println(x);
//		int w = ++10; //CE: Unexpected Type found: value, required: variable
//		int w = ++ (++y);  //CE: Unexpected Type found: value, required: variable
		int w = ++y;
		System.out.println(w);
//		final int v = 20;
//		v = 100;
//		System.out.println(v);  // final variable re-assignment is not possible
		double d = 10.5;
		d++;
		System.out.println(d);
		char c = 'c';
		c++;
		System.out.println(c);
		
		byte b = 100;
		byte f = 101;
		byte e = (byte)(b + f);
		System.out.println(e);
		
//		Whenever we use arithmetic operators, the type of resultant variable will be like
//		Max(int, type of variable1, type of variable2,....)
		
		
//		IF ELSE
		
		if (true) {
			System.out.println("This is for if statement");
		}
		
//		if (true)
//			int z = 100;
		
//		There is no dangling else problem in Java. Every else statement is mapped to the NEAREST of statement. Ex:
		int age = 18;
		if (age > 15 && age < 18) {
			System.out.println("You are ready to vote");
		} if (age > 18) {
			System.out.println("You are already eligible to vote");
		} else  {
			System.out.println("We can't decide");
		}
		// here the else block is associated with 2nd if statement, but not for the first
		
//		SWITCH (The only allowed expressions under switch block are 'byte, short, char and int'. But this rule applicable until
//		version 1.4 only.From 1.5 version, corresponding wrapper classes (Byte, Short, Character, Integer respectively)
//		allowed and in addition to this, enum type also allowed.From 1.7 version onwards, we can pass String type also.
//		This is the only flow control statement which needs curely brackets. In this block, both case and default are optional.
//		i.e. An empty switch is an valid Java syntax. Inside switch, every statement must be declared or used under either case 
//		or default, i.e. Independent statements are not allowed inside a switch.age Otherwise, we will get complie time error
//		Duplicate case labels are not allowed. If we add, we will compile time error saying 'Duplicate case label'

	}

}	
