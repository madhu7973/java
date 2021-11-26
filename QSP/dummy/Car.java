package dummy;

public class Car extends Automobile {

//	private int acc;
//	private String model;
//
//	public int getAcc() {
//		return acc;
//	}
//
//	public void setAcc(int acc) {
//		this.acc = acc;
//	}
//
//	public String getModel() {
//		return model;
//	}
//
//	public void setModel(String model) {
//		this.model = model;
//	}
	
	public static void main(String[] args) {
		Car c = new Car();
		c.setFuel("Petrol");
		System.out.println(c.getFuel());
	}

}
