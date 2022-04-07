package Week2;

//type casting and type conversion
public class TypeConversion {

	public static void main(String[] args) {
		// type casting
		// byte, short, int, long, float, double -Numeric types
		// byte -> short -> int -> long -> float -> double (Auto conversion) - type
		// promotion
		// declare
		byte bn;
		short sn;
		int in;
		long ln;
		float fn;
		double dn;

		// assign
		bn = 15; // 15 assign to bn (variable)
		sn = bn; // accessing value of bn and assign to sn (auto conversion)
		in = sn; // accessing value of sn and assign to in (auto conversion)
		ln = in; // accessing value of in and assign to ln (auto conversion)
		fn = ln; // accessing value of ln and assign to fn (auto conversion)
		dn = fn; // accessing value of fn and assign to dn (auto conversion)

		System.out.println(bn);
		System.out.println(sn);
		System.out.println(in);
		System.out.println(ln);
		System.out.println(fn);
		System.out.println(dn);

		// Type casting - by force type conversion (double -> float -> long -> int ->
		// short -> byte)
		dn = 123456789.987654321;
		// fn = dn; //Type mismatch: cannot convert from double to float
		fn = (float) dn; // double to float (type cast) - numeric conversion (type cast)
		System.out.println(fn);

		// float to int - type cas?
		fn = 456.789f; // 456.789F;
		in = (int) fn;
		System.out.println(in);

		// Type Conversion
		// String to Numeric
		// Numeric to String

		// String to Numeric
		String str1 = "123456";
		int num1 = Integer.parseInt(str1);
		System.out.println(num1 + 678);

		// Numeric to String
		num1 = 897654321;
		str1 = Integer.toString(num1);
		System.out.println(str1);

		// string to byte, short, int, long, float, double
		String str2;

		// string to byte
		byte sc;
		str2 = "123456789987654321";
		sc = Byte.parseByte(str2);
		System.out.println(sc);

		// string to short
		short sc1;
		str2 = "123456789987654321";
		sc1 = Short.parseShort(str2);
		System.out.println(sc1);

		// string to int
		int sc3;
		str2 = "123456789987654321";
		sc3 = Integer.parseInt(str2);
		System.out.println(sc3);

		// string to long
		long sc4;
		str2 = "123456789987654321";
		sc4 = Long.parseLong(str2);
		System.out.println(sc4);

		// string to float
		float sc5;
		str2 = "123456789987654321";
		sc5 = Float.parseFloat(str2);
		System.out.println(sc5);

		// string to float
		double sc6;
		str2 = "123456789987654321";
		sc6 = Double.parseDouble(str2);
		System.out.println(sc6);
		// byte,short,int,long,float,double -> String
	}

}
