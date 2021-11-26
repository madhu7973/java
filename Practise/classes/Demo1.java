package classes;

public class Demo1 {
	
	int age;
	String ageName;

	String ageCal() {
		if (age >= 1 && age < 3)
			ageName = "baby";
		else if (age >= 3 && age < 12)
			ageName = "todler";
		else if (age >= 13 && age < 20)
			ageName = "teenager";
		else if (age >= 20 && age < 50)
			ageName = "midage";
		else if (age >= 50 && age < 70)
			ageName = "eilder";
		else
			ageName = "senior";
		return ageName;
	}
}
