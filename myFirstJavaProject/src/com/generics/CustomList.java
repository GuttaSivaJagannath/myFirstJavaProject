package com.generics;

import java.util.ArrayList;

public class CustomList<T> {
	ArrayList<T> List = new ArrayList<>();

	public void addElement(T element1) {
		List.add(element1);
	}

	public void removeElement(T element2) {
		List.remove(element2);
	}

	@Override
	public String toString() {
		return List.toString();
	}

	public T get(int index) {
		return List.get(index);

	}

}

