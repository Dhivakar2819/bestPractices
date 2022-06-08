package com.chainsys.bestPractices.decoupling;
// object of the class can work with any engine, and any wheel.
// The car class is de coupled from PetrolEngine class, and SteelWheel class
public class Car {
	private Iengine engine;// early bound with petrol engine interface
	private IWheel[] wheels; // early bound with steel wheel interface
	// the type of engine, and the type of wheel will be injected to the car class
	//at run time using the constructors. This is called as constructor based
	//dependency injection
	public Car(Iengine engine,IWheel[] wheel){
		this.engine=engine;
		this.wheels=wheel;
		
		}
	public void startCar() {
		engine.start();
		wheels[0].rotate();
		wheels[1].rotate();
		wheels[2].rotate();
		wheels[3].rotate();
	}
	public IWheel[] getWheels() {
		return this.wheels;
	}
}
