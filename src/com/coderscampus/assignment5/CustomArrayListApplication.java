package com.coderscampus.assignment5;

import java.util.ArrayList;
import java.util.List;


public class CustomArrayListApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create CustomList Type variable
		CustomList<String> customArray = new CustomArrayList<String>();
		//System.out.println(customArray);
		//Print initialized array of size 10
		System.out.println("Initial Array:");
		printArrayListToConsole(customArray);
		
		//Insert numbers from 1 to 159 in customArray
		//If you replace 160 by 161 you will clearly see how the Array gets expanded
		Integer i;
		for(i =0; i<160;i++){
			String aux = "";
			aux=String.valueOf(i);
            customArray.add(aux);
        }
		//Print out the resulting customArray
		System.out.println("Array after adding "+i+" values: ");
		printArrayListToConsole(customArray);
	}
	
	//Print customArray
	private static void printArrayListToConsole(CustomList<String> customArray) {
		for(int i =0; i<customArray.getSize();i++){
            System.out.println("Index " +i+" --> "+customArray.get(i));
        }
		System.out.println("");
	}

}
	
