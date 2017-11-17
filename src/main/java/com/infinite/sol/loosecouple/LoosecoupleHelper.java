package com.infinite.sol.loosecouple;

public class LoosecoupleHelper {

	private IVehicle vehicle;

	public IVehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(IVehicle vehicle) {
		this.vehicle = vehicle;
	}

	public void printVehicleDetails(){
		this.vehicle.printDetails();
	}
}
