package com.chainsys.bestPractices.decoupling;
// object of the class can work with any engine, and any wheel.
// The car class is de coupled from PetrolEngine class, and SteelWheel class
public class Bike {
	private Iengine engine;// early bound with petrol engine interface
	public Iengine getEngine() {
		return engine;
	}
	// the type of engine will be injected to the bike class
	//at run time using the setter method. This is called as constructor based
	//dependency injection
	public void setEngine(Iengine engine) {
		this.engine = engine;
	}
	// the type of wheel will be injected to the bike class
	//at run time using the setter method. This is called as constructor based
	//dependency injection
	public void setWheels(IWheel[] wheels) {
		this.wheels = wheels;
	}
	private IWheel[] wheels; // early bound with steel wheel interface
	
	public Bike(Iengine engine,IWheel[] wheel){
		this.engine=engine;
		this.wheels=wheel;
		
		}
	public void startBike() {
		engine.start();
		wheels[0].rotate();
		wheels[1].rotate();
	}
	public IWheel[] getWheels() {
		return this.wheels;
	}
}
