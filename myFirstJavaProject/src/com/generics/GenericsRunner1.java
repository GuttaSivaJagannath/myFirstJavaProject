package com.generics;

public class GenericsRunner1 {

	public static void main(String[] args) {
		CustomList<String> cL = new CustomList<>();
		cL.addElement("IBM");
		cL.addElement("Experis IT");
		// cL.removeElement("Experis IT");
		System.out.println(cL);

		CustomList<Integer> cL1 = new CustomList<>();
		cL1.addElement(Integer.valueOf(0744));
		cL1.addElement(Integer.valueOf(31631));
		// cL.removeElement(31631);
		System.out.println(cL1);
	}

}
