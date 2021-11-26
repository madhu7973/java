package methods;

public class ReturnTypeMethods {

	String gradeCal(int sub1, int sub2, int sub3) {
		int totalMarks = sub1 + sub2 + sub3;
		String grade;
		if (totalMarks >= 210)
			grade = "FCD";
		else if (totalMarks >= 180)
			grade = "FC";
		else if (totalMarks >= 150)
			grade = "SC";
		else
			grade = "Fail";

		return grade;
	}

	public double simpleInterest(double p, double t, double r) {
		double si = (p * t * r) / 100;
		return si;
	}

	public void callTosi() {
		double si = simpleInterest(3, 5, 7);
		System.out.println("simple interest is: " + si);
	}

	public static void main(String[] args) {
		ReturnTypeMethods rtm = new ReturnTypeMethods();
		rtm.callTosi();
		double si = rtm.simpleInterest(9, 7, 3);
		System.out.println(si);
		
		String grade = rtm.gradeCal(67, 65, 69);
		System.out.println(grade);
	}
}
