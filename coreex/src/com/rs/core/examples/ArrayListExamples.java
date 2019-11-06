package com.rs.core.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExamples {

	public static void main(String[] args) {
		List<String> southStates = new ArrayList<String>();
		
		southStates.add("AP");
		southStates.add("TS");
		southStates.add("TN");
		southStates.add("KT");
		// southStates.add(12);
		southStates.add(null);
		southStates.add("AP");
		southStates.add(null);
		southStates.add("AP");
		southStates.add(null);
		southStates.add("AP");

		List<String> northStates = new ArrayList<String>(2);
		northStates.add("OD");
		northStates.add("PB");
		northStates.add("OD");
		northStates.add("PB");

		List<String> indiaStates = new ArrayList<String>();
		indiaStates.addAll(northStates);
		System.out.println();

		Iterator<String> iterator = southStates.iterator();
		String stateCode = null;
		while (iterator.hasNext()) {
			stateCode = iterator.next();
			System.out.println(stateCode);
		}
	}

}
