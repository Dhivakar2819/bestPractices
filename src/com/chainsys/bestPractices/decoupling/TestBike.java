package com.chainsys.bestPractices.decoupling;

public class TestBike {

	public static void main(String[] args) {
		PetrolEngine pe=new PetrolEngine();
		SteelWheel[] sWheels=new SteelWheel[4];
		sWheels[0]=new SteelWheel();
		sWheels[0].location="front";
		sWheels[1]=new SteelWheel();
		sWheels[1].location="back";
		
		Bike bike=new Bike(pe,sWheels);
		bike.setEngine(pe);
		bike.setWheels(sWheels);
		bike.startBike();
		
		DieselEngine de=new DieselEngine();
			WoodenWheel[] wWheels=new WoodenWheel[2];
			wWheels[0]=new WoodenWheel();
			wWheels[0].location="front";
			wWheels[1]=new WoodenWheel();
			wWheels[1].location="back";
			
		Bike secondBike=new Bike(de,sWheels);
		bike.setEngine(de);
		bike.setWheels(sWheels);
			secondBike.startBike();
			
			WaterEngine we=new WaterEngine();
			Bike thirdBike=new Bike(we,wWheels);
			bike.setEngine(we);
			bike.setWheels(wWheels);
			thirdBike.startBike();
	}

}
