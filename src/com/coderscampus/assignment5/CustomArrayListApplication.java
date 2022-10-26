package com.coderscampus.assignment5;

//import java.util.ArrayList;
//import java.util.List;


public class CustomArrayListApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create CustomList Type variable
		CustomList<String> customArray = new CustomArrayList<String>();
		//System.out.println(customArray);
		//Print initialized array of size 10
		System.out.println("Initial array size: " + customArray.getSize());
		printArrayListToConsole(customArray);
		
		//The for loop will add items (int values) to customArray as desired
		Integer i;
		for(i =0; i<51;i++){
            customArray.add(String.valueOf(i));
        }
		//Print out the resulting customArray
		System.out.println("Final array size: "+ customArray.getSize());
		printArrayListToConsole(customArray);
	}
	
	//Print customArray
	private static void printArrayListToConsole(CustomList<String> customArray) {
		for(int i =0; i<customArray.getSize(); i++){
            System.out.println("Index " +i+" --> "+customArray.get(i));
        }
		System.out.println("");
	}

}
	
