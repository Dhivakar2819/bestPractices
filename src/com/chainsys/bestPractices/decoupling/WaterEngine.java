package com.chainsys.bestPractices.decoupling;

public class WaterEngine implements Iengine {
	public void start() {
		System.out.println("Water Engine start");
	}
	public void stop() {
		System.out.println("Water Engine stop");
	}
}
