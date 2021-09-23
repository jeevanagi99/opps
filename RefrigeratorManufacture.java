package com.X_workz.oops;

public class RefrigeratorManufacture {

	public static void main(String[] args) {
		Refrigerator samsung = new Refrigerator();
		samsung.brand = "samsung";
		samsung.color = "red";
		samsung.price = 25000;
		samsung.type = "double door";
		System.out.println(samsung.brand);
		System.out.println(samsung.color);
		System.out.println(samsung.price);
		System.out.println(samsung.type);
		samsung.open();
		samsung.cooling();
		samsung.music();
	}

}
