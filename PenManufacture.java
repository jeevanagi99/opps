package com.X_workz.oops;

public class PenManufacture {

	public static void main(String[] args) {
		Pen Vertex = new Pen();
		Vertex.brand = " Vertex";
		Vertex.color = "black";
		Vertex.price = 50;
		Vertex.type = "Waterproof";
		System.out.println(Vertex.brand);
		System.out.println(Vertex.color);
		System.out.println(Vertex.price);
		System.out.println(Vertex.type);
		Vertex.open();
		Vertex.write();
		Vertex.refil();
		Vertex.close();
	}

}
