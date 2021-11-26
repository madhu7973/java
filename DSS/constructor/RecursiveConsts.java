package constructor;

public class RecursiveConsts {

	RecursiveConsts() {
		this(10);
	}

	RecursiveConsts(int i) {
		this();
	}

	public static void main(String[] args) {
		System.out.println("recursive consts");
	}

}
