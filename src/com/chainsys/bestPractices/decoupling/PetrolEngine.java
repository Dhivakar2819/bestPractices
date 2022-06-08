package com.chainsys.bestPractices.decoupling;

public class PetrolEngine implements Iengine {
	public void start() {
		System.out.println("Petrol Engine started");
	}
	public void stop() {
		System.out.println("Petrol Engine stoped");
	}

}
