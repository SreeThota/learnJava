package javaPractice.basicsPractice;


public class DataTypesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		byte data type (1 byte)
		byte b = 100;
		System.out.println("b value is " + b);
		b = 127;
		System.out.println("b value is " + b);
/*      b = 135;  CE: Possible Loss of precision. Found: int, required: byte
        b = -145; CE: Possible Loss of precision. Found: int, required: byte
        The allowed range for byte is '128 to 127'. If it exceeds above range, we will get above exception
        **/
		
//		Short data type ( 2 bytes)
		short s = 32767;
		System.out.println("s value is " + s);
		s = -32768;
		System.out.println("s value is " + s);
/*      s = -32769; CE: CE: Possible Loss of precision. Found: int, required: short
        s = 32768; CE: Possible Loss of precision. Found: int, required: short
        The allowed range for short is '-32768 to 32767'. If it exceeds above range, we will get above exception
        **/
		
//		int data type (4 byte)
		int i = 2147483647;
		System.out.println("i value is " + i);
		i = -2147483648;
		System.out.println("i value is " + i);
/*		i = 2147483648;  CE: Integer value out of range
		i = -2147483649; CE: Integer value out of range
		The allowed range for int data type is '-2147483648 to 2147483647'. If it exceeds above range, we will get above exception
**/
		
//		long data type (8 bytes)
		long l = 2147483648l;
		System.out.println("l value is " + l);
		l = -2147483649l;
		System.out.println("l value is " + l);
//      The allowed range for long data type is '-2^63 to 2^63-1. 
		
		float f = 10.5555555555555555555555f;
		System.out.println("f value is " + f);
		f = 10000000000000000000000000000000.0f;
		System.out.println("f value is " + f);

		double d = 10.5555555555555555555555;
		System.out.println("d value is " + d);
		d = 200000000000000000000000000000000000000000000.00;
		System.out.println("d value is "+ d);
		
		boolean bl = false;
		bl = (i < -2147483648);
		System.out.println("bl value is " + bl);
		bl = (s == -32768);
		System.out.println("bl value is " + bl);
		
		char ch = 'a';
		ch = 'Z';
		System.out.println("ch value is " + (byte)ch);
		System.out.println("ch value is " + (short)ch);
		System.out.println("ch value is " + (int)ch);
		System.out.println("ch value is " + (long)ch);
		System.out.println("ch value is " + (float)ch);
		System.out.println("ch value is " + (double)ch);
		
	}

}

