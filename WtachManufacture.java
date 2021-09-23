package com.X_workz.oops;

public class WtachManufacture {

	public static void main(String[] args) {
		watch mi = new watch();
		mi.brand = "mi";
		mi.color = "black";
		mi.model = "smart band";
		mi.price = 2000;
		System.out.println(mi.brand);
		System.out.println(mi.color);
		System.out.println(mi.model);
		System.out.println(mi.price);
		mi.notifiaction();
		mi.belt();
		mi.time();
		mi.cell();
	}

}
