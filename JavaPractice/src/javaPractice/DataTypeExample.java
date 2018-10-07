package javaPractice;

public class DataTypeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte b = 126;
//		byte b1 = -129;   compile time error
//		byte holds 1 byte data (8 bits). Allowed range is -128 to 127
		short s = -32768;
//		short s1 = 32768;   compile time error
//		short type holds 2 bytes (16 bits). Allowed values range is -32768 to 32767
		int x = 65540;
		byte b1 = (byte) 45000;
		char ch = 'a';
		int i2 = (int) 'a';
		long l = 100l;
		float f = (float)100.456d;
		double d = 13456.999f;
		System.out.println(f);
		System.out.println(l);
		System.out.println(ch);
		System.out.println(x);
		System.out.println(b);
		System.out.println(s);
		System.out.println(b1);
		System.out.println(i2);
		System.out.println(d);
		
		int[] array1 = new int[3];
		System.out.println(array1.length);
		int array2[] = new int[100];
		System.out.println(array2.length);
		int []array3 = new int[1000];
		System.out.println(array3.length);
//		int array = new int[100];
		
		int[][] array4 = new int[5][3];
		System.out.println(array4.length);
		int[] []array5 = new int[4][3];
		int array6[][] = new int[10][20];
//		int[] []array7, (int[])array8[] = new int[5][5];
		
		
		
		int[][] number= new int[2][];
		number[(int)0.5] = new int[(int)1.5];
		System.out.println(number[(int)0.5]);;
		number[0] = new int[3];
//		number[-1] = new int[2];
//		System.out.println(number[-1]); // java..lang.ArrayIndexOutOfBoundsException
//		number[2] = new int[5];
//		System.out.println(number[2]); // java..lang.ArrayIndexOutOfBoundsException
		System.out.println(number[0]);
		System.out.println(number[1]);
//		System.out.println(number[1][0]); //NullPointerException
		
//		int array7[];
//		array7 = {20, 40, 60}; throws illegal start of expression error
		
		int[][] array8 = new int[4][3];
		array8[0] = new int[4];
		array8[1] = new int[2];
		System.out.println(array8[0].length);
		System.out.println(array8[1].length);
		System.out.println(array8[2].length);
		System.out.println(array8[3].length);
		System.out.println(array8[4].length);
	}

}
