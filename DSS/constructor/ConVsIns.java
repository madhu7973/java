package constructor;

public class ConVsIns {

	static int count = 0;
	{
		count++;
	}

	 ConVsIns() {

	}

	ConVsIns(int i) {

	}

	ConVsIns(double d) {

	}

	public static void main(String[] args) {

		ConVsIns ci1 = new ConVsIns();
		ConVsIns ci2 = new ConVsIns(10);
		ConVsIns ci3 = new ConVsIns(10.5);
		System.out.println("number of objects created: " + count);

	}
}
