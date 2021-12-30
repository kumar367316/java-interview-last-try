package com.core.designpattern.factory.builder;

public class BuilderTest {

	public static void main(String args[]) {
		Vehicle car = new Vehicle.VehicleBuilder("1500cc","4-Wheeler").setAirBags(4).build();
		
		Vehicle bike = new Vehicle.VehicleBuilder("1000cc","2-Wheeler").build();
		
		System.out.println(car.getEngine());
		System.out.println(car.getWheelType());
		System.out.println(car.getAirBags());
		
		System.out.println(bike.getEngine());
		System.out.println(bike.getWheelType());
		System.out.println(bike.getAirBags());
	}

}
