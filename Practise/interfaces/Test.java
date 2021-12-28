package interfaces;

public class Test implements Int1, Int2 {

	@Override
	public String abstractMethod(String s) {
		System.out.println(Int1.staticMethod());
		return s;
	}

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.defaultMethod());
		System.out.println(t.abstractMethod("calling abs method from main method implemented in test class"));
	}
}
