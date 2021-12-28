package interfaces;

public interface Int1 extends Int2{

	static String staticMethod() {
		return "static method";
	}

	default String defaultMethod() {
		return "default method";
	}

	String abstractMethod(String s) ;
	
	 default void m1() {
		Int2.super.defaultMethod();
	}

}
