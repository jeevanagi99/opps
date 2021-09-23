package com.X_workz.oops;

public class MobileTest {

	public static void main(String[] args) {
		Mobile mi = new Mobile();
		mi.brand = "mi";
		mi.colour = "black";
		mi.price = 14000;
		mi.ram = 8;
		System.out.println(mi.brand);
		System.out.println(mi.colour);
		System.out.println(mi.price);
		System.out.println(mi.ram);
		mi.switchingOff();
		mi.switchingOn();
		mi.playMusic();
		mi.playGames();
	}

}
