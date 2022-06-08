package com.chainsys.bestProject.defaultmethod;

public interface Ivehicle {
	void start();
	default void move() {
		System.out.println("vehicle is moving");
	}

}
class Car implements Ivehicle{
	public void start() {
		System.out.println("car is starting");
	}
}
class Bike implements Ivehicle{
	public void start() {
		System.out.println("bike is starting");
	}
}
