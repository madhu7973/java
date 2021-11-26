package abstraction;

public class Car extends Vehicle {

	String steerType;
	int airBagNum;

//	Car(int wheelNum, int gearNum, int seatNum, String model, double mileage, String steerType, int airBagNum) {
//
//		this.wheelNum = wheelNum;
//		this.gearNum = gearNum;
//		this.seatNum = seatNum;
//		this.model = model;
//		this.mileage = mileage;
//		this.steerType = steerType;
//		this.airBagNum = airBagNum;
//
//	}
	
	Car(int wheelNum, int gearNum, int seatNum, String model, double mileage, String steerType, int airBagNum) {

		super(wheelNum, gearNum, seatNum, model, mileage);
		this.steerType = steerType;
		this.airBagNum = airBagNum;

	}

	Car car = new Car(wheelNum, gearNum, seatNum, model, mileage, steerType, airBagNum);

}
