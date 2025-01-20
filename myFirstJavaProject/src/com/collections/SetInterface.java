package com.collections;

import java.util.HashSet;
import java.util.Set;

//Set, HashSet = it wont allows the duplication
public class SetInterface {
	public static void main(String[] SetInterface) {

	Set<String> si = Set.of("Apple", "Bat", "Cat");
	// si.add("Dog");
	// above statement will give error because the set will not allows the
	// modifications, in this case we use the HashSet
	System.out.println("Set : " + si);// set does not cares about the position, it will give random positions
	Set<String> hashSet=new HashSet<>(si);
	hashSet.add("Dog");
	hashSet.add("Dog");// if we add the same element in the hashSet, it will take only one of them, it
						// doesn't allow the duplications
	// hashSet.add(2, "Elephant");
	// in above statement, it wont allow the position that which we want to add
	System.out.println("HashSet :" + hashSet);
}
}
