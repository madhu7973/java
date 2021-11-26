package constructor;

public class Constructor1 {

	String name = "madhu";
	int age = 29;

	public Constructor1(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("name: " + name + ", age: " + age);
	}

	{
		name = "madhu";
		age = 29;
	}

	public static void main(String[] args) {
		Constructor1 con = new Constructor1("madhu", 29);
		con.name = "madhu";
		con.age = 29;
	}
}
