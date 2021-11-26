package dataTypes;

public class LiteralType {
	public static void main(String[] args) {
		int x1 = 10; // Here value 10 is a constant which can be a literal.
		int x2 = 0100;
		int x3 = 0XFace;
//		int x4 = 0xbee r; // here r is not in the range of hexadecimal value, Syntax error on token "r",
		// delete this token
		int x5 = 0x100Face;

		int x6 = 3;
		int x7 = 0x5; // Decimal value is 5
		int x8 = 010; // Decimal value is 8

		System.out.println(x6 + x7 + x8);

		double d1 = 0x3456Face;
		double d2 = 01234;

		char ch1 = 97; // a's unicode value is 97
//		char ch2 = 65536; //max allowed range is 0 to 65535.

		char ch3 = '\u0061'; // \u0061 value is a

		/*
		 * a's unicode value is 97. when divided by 16 we get 1 as reminder. so 61
		 */
	}

}
