package com.chainsys.bestPractices.decoupling;

public class SteelWheel implements IWheel {
	public String location;
	public void rotate() {
		System.out.println("Steel wheel rotating");
	}
	public void stopRotating() {
		System.out.println("Steel wheel stoped");
	}
}
