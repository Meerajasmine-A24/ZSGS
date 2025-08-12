/*1. Write a Java program
a. to create a new array list, add some colours (string) and print out the collection.
b. to iterate through all elements in an array list.
c. to insert an element into the array list at the first position.
d. to retrieve an element (at a specified index) from a given array list.
e. to update specific array element by given element.
f. to remove the third element from an array list.
g. to search an element in an array list.
h. to sort a given array list.
i. to copy one array list into another.
j. to shuffle elements in an array list. */

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator; 

public class Problem1{
	public static void main(String[]args){
		List<String> colours=new ArrayList<>();
		colours.add("Black");
		colours.add("White");
		colours.add("green");
		colours.add("Blue");
	
	// Printing the collection
	System.out.println(colours);
	
	//  to iterate through all elements in an array list.
	
	   System.out.println("Iterating through all the elemnts in the arrayList ");
	   Iterator it=colours.iterator();
	   while(it.hasNext()){
		   System.out.println(it.next());
	   } 
	   
	
    // Iterate to all elements 
	
	// insert an element into the array list at the first position.
	  colours.add(0,"purple");
	  System.out.println("Colours after inserting ");
	    
	  System.out.println(colours);
	  
	  // retrieve an element (at a specified index) from a given array list.
	  
	  System.out.println("Element at index 2 : "+colours.get(2));
	  
	  // to update specific array element by given element.
	  
	  colours.set(4,"pink");
	  System.out.println("Colours after Updating ");
	  System.out.println(colours);
	  
	  // to remove the third element from an array list.
	  
	  colours.remove(2);
	  
	  System.out.println("Colours list After removing the third element : ");
	  System.out.println(colours);
	  
	  // to search an element in an array list.
	  
	  boolean hasWhite=false;
	  boolean hasYellow=false;
	  System.out.println("Contains Yellow : "+colours.contains("yellow"));
	   System.out.println("Contains Green  : "+colours.contains("green"));
	   
	   // to sort a given array list.
	   
	   Collections.sort(colours);
	   System.out.println("Colours After Sorting ");
	   System.out.println(colours);
	     
	   //  to copy one array list into another.
	   
	   List<String> colours2 = new ArrayList<>(List.copyOf(colours));
	   
	   System.out.println("Original List : "+colours);
	   System.out.println("Copied List : "+colours2);
	   
	   //to shuffle elements in an array list
	   
	   System.out.println("Array Elements After Shuffled ");
	   Collections.shuffle(colours);
	   System.out.println(colours);
	   System.out.println("Checking that the copied list was shuffled or not by printing ");
	   System.out.println(colours2);
	    
	  
	}
	
}
