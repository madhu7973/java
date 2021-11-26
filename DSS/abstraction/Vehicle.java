package abstraction;

abstract class Vehicle {

	int wheelNum;
	int gearNum;
	int seatNum;
	String model;
	double mileage;

	public Vehicle(int wheelNum, int gearNum, int seatNum, String model, double mileage) {
		this.wheelNum = wheelNum;
		this.gearNum = gearNum;
		this.seatNum = seatNum;
		this.model = model;
		this.mileage = mileage;
	}

}
