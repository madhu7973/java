package abstraction;

public class Bike extends Vehicle {

	int diskBreakNum;
	String startType;

//	Bike(int wheelNum, int gearNum, int seatNum, String model, double mileage, int diskBreakNum, String startType) {
//
//		this.wheelNum = wheelNum;
//		this.gearNum = gearNum;
//		this.seatNum = seatNum;
//		this.model = model;
//		this.mileage = mileage;
//		this.diskBreakNum = diskBreakNum;
//		this.startType = startType;
//
//	}
	
	Bike(int wheelNum, int gearNum, int seatNum, String model, double mileage, int diskBreakNum, String startType) {

		super(wheelNum, gearNum, seatNum, model, mileage);
		this.diskBreakNum = diskBreakNum;
		this.startType = startType;

	}

	Bike bike = new Bike(wheelNum, gearNum, seatNum, model, mileage, diskBreakNum, startType);
}
