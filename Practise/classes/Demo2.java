package classes;

public class Demo2 {

	public static void main(String[] args) {
		Demo1 d1 = new Demo1();
		d1.age = 30;
		String ageName = d1.ageCal();
		System.out.println(ageName);
	}
}
