package com.core.designpattern.factory.builder;

public class Vehicle {
	
	//mandatory fields
	private String engine;
	private String wheelType;
	
	//optional fields
	private int airBags;

	public String getEngine() {
		return engine;
	}

	public String getWheelType() {
		return wheelType;
	}

	public int getAirBags() {
		return airBags;
	}
	
	private Vehicle(VehicleBuilder builder) {
		this.engine = builder.engine;
		this.wheelType = builder.wheelType;
		this.airBags = builder.airBags;
	}
	
	
	public static class VehicleBuilder{
		
		private String engine;
		private String wheelType;
		
		private int airBags;

		public VehicleBuilder(String engine, String wheelType) {
			this.engine = engine;
			this.wheelType = wheelType;
		}

		public VehicleBuilder setAirBags(int airBags) {
			this.airBags = airBags;
			return this;
		}

		public Vehicle build() {
			return new Vehicle(this);
		}
		
	}

}
