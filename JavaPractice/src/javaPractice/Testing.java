package javaPractice;

class Dog{
	String name = "puppy";
	 static void eat(){System.out.println("dog is eating...");}  
	 void walking() {
		 System.out.println("Dog is walking in his/her own way");
	 }
	 }  
public class Testing extends Dog{
	String name = "Testing";
	void walking() {
		System.out.println("Testing blcom is walking");
	}
	
	static void eat() {System.out.println("Testing class eating my brain :)");}
	
	public static void main(String args[]){  
		  Dog d1=new Dog();  
		  d1.walking();
		  Dog.eat();
		  Dog t1 = new Testing();
		  t1.walking();
		  eat();
		  System.out.println(t1.name);
		  System.out.println(d1.name);
}
}
