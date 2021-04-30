//1. comments a.// b./* */ c./******/
//2. identifiers
//3. reserved words -53
//4. operators a. arithmetic(+,-,*,/,%) b. relational(==,>,<,)  c. logical(&&,||,!) d. bitwise
//5. separators  - {},[],(),.,;,
//6. literals - data , Integral(byte,short,int,long) ,Floating point(float,double) , Boolean(boolean) , Characters 
public class PrintMessage {

	public static void main(String[] args) {
//		Primitives data 8 

		byte b =100;   //8 bits 1 bytes ?-128 - +127
		short s = 10;//16 bits 2 bytes
		int i = 10;  // 32 bits 4 bytes
		long l = 10; //64 bits 8 bytes
		
		float f = 10.05F;// 32 bits 4 bytes
		double d = 10.05;//64 bits 8 bytes
		
		boolean b1 = true; // false
		
		char c = 'a'; // 16  // unicode universal 

//		System.out.println("This message prints on to console" + 10);
		
//		 value or literal - decimal 10 , octal - 010 , hexa decimal -0x10 , binary 0b1001	
		
	    int a = 0b10;  //010- 1*8(1)+0*8(0), 1*16(1)+0*16(0)
		System.out.println(a);
		
		float f1 = 10.05e1f;
		System.out.println(f1);
		
		char c1 = 'a';
		char c2 = 65;
		char c3 = '\u0C05'; 
		System.out.println(c2);
		
		byte b3 = 100; //short,int,long,float,double,char
		int i3 = b3 ;
		double d3 =b3;
		
		System.out.println(d3);
		
		int i4 = 32768;
		short b4 = (short)i4; // Type casting // 2's complement
		System.out.println(b4);
		
		short s5 = 'a';
		System.out.println(s5);
		
// Operator  - unary , binary , i/p data , o/p data 
//		+ 
//		relational (>) i/p integral , o/p boolean
//		logical (&&,||,!) i/p boolean , o/p boolean
//		assignment =, += , -= ,*=;
		System.out.println('a'>'b');
		int i8 = 100;
		i8 += 5; //i8 = i8+ 5; 
		System.out.println(i8);
//		== comparing
//		post increment , decrement (++,--)
		
		//data, operators - use to process data
		
//		Flow control stmts
//		if-else, switch- case, while,do-while,for, break,continue,return
		
		System.out.println("Hello World");

	
	}
}


