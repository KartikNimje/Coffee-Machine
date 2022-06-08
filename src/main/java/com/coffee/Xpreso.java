package com.coffee;

public class Xpreso implements Coffee{

	String cream;
	
	
	public String getCream() {
		return cream;
	}

	public void setCream(String cream) {
		this.cream = cream;
	}

	public void typeOfCoffee() {
		System.out.println("Here is your Xprrresso");
		
	}

	public void rateOfCoffee() {
		System.out.println("250 RS");
		
	}
	public void displayCream() {
		System.out.println(cream);
	}

	public Xpreso(String cream) {
		//super();
		this.cream = cream;
	}

}
