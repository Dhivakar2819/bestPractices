package com.chainsys.bestPractices.decoupling;

public class DieselEngine implements Iengine {
	public void start() {
		System.out.println("Diesel Engine started");
	}
	public void stop() {
		System.out.println("Diesel Engine stoped");
	}
}
