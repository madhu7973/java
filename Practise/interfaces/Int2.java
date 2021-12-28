package interfaces;

public interface Int2 {
//	Int1.super.defaultMethod();

	/*
	 * public static void main(String[] args) { Int1.staticMethod();
	 * 
	 * 
	 * }
	 */

	default String defaultMethod() {
		return "default method of Int2";
	}

}
