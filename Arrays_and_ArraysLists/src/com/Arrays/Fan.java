package com.Arrays;

public class Fan {
	// state
	private String make;
	private double radius;
	private String color;
	private boolean isOn;
	private byte speed;

	// creation
	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
	}

	// isOn
	public void isOn(boolean isOn) {
		this.isOn = isOn;
		this.speed = (byte) 5;
	}

	public void switchOn() {
		this.isOn(true);
	}

	public void switchOff() {
		this.isOn = false;
		this.speed = (byte) 0;
	}

	public void setSpeed(byte speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return String.format("make - %s, radius - %f, color - %s, isOn - %b, speed - %d", make, radius, color, isOn,
				speed);
		
	}

}
