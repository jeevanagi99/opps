package com.X_workz.oops;

public class ACManufacture {

	public static void main(String[] args) {
		AC Sony = new AC();
		Sony.brand = "sony";
		Sony.price = 25000;
		Sony.capacity = 25;
		System.out.println(Sony.brand);
		System.out.println(Sony.price);
		System.out.println(Sony.capacity);
		Sony.switchOn();
		Sony.temprature();
		Sony.switchOff();
	}

}
