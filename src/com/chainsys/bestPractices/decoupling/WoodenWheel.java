package com.chainsys.bestPractices.decoupling;

public class WoodenWheel implements IWheel {
		public String location;
		public void rotate() {
			System.out.println("Wooden wheel rotating");
		}
		public void stopRotating() {
			System.out.println("Wooden wheel stoped");
		}
	
}
