package com.coderscampus.assignment5;
@SuppressWarnings("unchecked")
public class CustomArrayList<T> implements CustomList<T> {
	//Object[] items = new Object[10];
		
    private Object[] customArray; // my custom array    
    private int nextIndex; // index which shall point to next index position where element is to be added
    private int initialSize; // initial size of the list
 
    /**
     * Constructor to initialize a custom array list
     */
    public CustomArrayList(){
        this.nextIndex = 0;
        this.initialSize = 10;
        this.customArray = new Object[initialSize];     
    }
	
    // helper method to grow the array dynamically
    /**
     * 
     * @return reference to a new array with increased size
     */
    private Object[] growArray() {
    	//As instructed by the assignment, the new generated array should be the double of the previous one when nextIndex >= customArray.length
    	initialSize=initialSize*2;
        Object [] copiedArray = new Object[initialSize];
        for (int i=0;i<customArray.length;i++){
            copiedArray[i]=customArray[i];          
        }
        customArray = copiedArray;
        return customArray;
    }
 
    /**
     * 
     * @param object - the element being added
     * @param list - reference to the list
     */
 
    // method to add elements to the end of Custom Array List
	@Override
	public boolean add(T item) {
		// TODO Auto-generated method stub
        if(nextIndex>=customArray.length){
            // call the growArray method to copy existing contents
            customArray=growArray(); 
        }
        customArray[nextIndex]=item;
        nextIndex++;
		return false;
	}
	
	// method to get the actual size of Custom Array List
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return customArray.length;
	}
	
	// method to get elements from Custom Array List
	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return (T)customArray[index];
	}
	
}
