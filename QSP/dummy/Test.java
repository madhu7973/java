package dummy;

public class Test {

	public static void main(String[] args) {
		Car c = new Car();
		c.setFuel("Petrol");
		System.out.println(c.getFuel());

		c.setSeater(6);
		System.out.println(c.getSeater());

		c.setWheel(4);
		System.out.println(c.getWheel());
//
//		c.setAcc(200);
//		System.out.println(c.getAcc());
//
//		c.setModel("2020");
//		System.out.println(c.getModel());

	}

}
