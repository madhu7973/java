package staticModifier;

public class Student {

	String name;
	int rollNum;
	int age;
	double marks;
	static String clgNmae;

	public String getStuInfo() {
		return name + " " + Integer.toString(age);
	}

	public static String clgName() {
		return clgNmae;

	}

	public static double getMarks(int x, int y) {
		return (x + y) / 2;
	}

	public String getInfo() {
		return name + " " + Integer.toString(rollNum) + " " + Integer.toString(age) + " " + Double.toString(marks) + " "
				+ clgNmae;

	}
}
