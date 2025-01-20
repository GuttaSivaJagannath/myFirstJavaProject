package com.generics;

public class GenericsRunner2 {

	public static void main(String[] args) {

		// for the strings
		CustomList<String> Name = new CustomList<>();
		Name.addElement("Siva ");
		Name.addElement("Jagannath");
		Name.addElement("Gutta");
		Name.addElement("Siva Jagannath Gutta");
		System.out.println(Name);

		// for Integer
		CustomList<Integer> age = new CustomList<>();
		age.addElement(24);
		System.out.println(age);

		// for the double values
		CustomList<Double> Height = new CustomList<>();
		Height.addElement(5.11);
		System.out.println(Height);

		// for floating values
		CustomList<Float> Weight = new CustomList<>();
		Weight.addElement(66.5F);
		System.out.println(Weight);

		// if we need to return the index values in the list, this is the process
		String value = Name.get(3);
		System.out.println(value);

		Integer value1 = age.get(0);
		System.out.println(value1);

		double value2 = Height.get(0);
		System.out.println(value2);

		float value3 = Weight.get(0);
		System.out.println(value3);
	}

}
