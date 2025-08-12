/* 2. Write a Java program to,
a. append the specified element to the end of a linked list.
b. iterate through all elements in a linked list.
c. iterate through all elements in a linked list starting at the specified position.
d. iterate a linked list in reverse order.
e. insert the specified element at the specified position in the linked list.
f. insert elements into the linked list at the first and last position.
g. insert the specified element at the front of a linked list.
h. insert the specified element at the end of a linked list.
i. insert some elements at the specified position into a linked list.
j. get the first and last occurrence of the specified elements in a linked list. */


import java.util.Collection;
import java.util.*;
 
public class Problem2{
	public static void main(String[]args){
		LinkedList<Integer> list=new LinkedList<>();
	for (int i=1;i<=10;i++){
		list.add(i);
	}
	System.out.println("Initial Elements in the linked list : "+list);
		// append the specified element to the end of a linked list.
	list.add(11);
	System.out.println("\n Linked list after appending the last value : "+list);
	
	//  iterate through all elements in a linked list.
	
	Iterator it=list.iterator();
	System.out.println("Iterating all the elements in the list ");
	while(it.hasNext()){
		System.out.print(it.next()+" ");
	}
	
	// iterate through all elements in a linked list starting at the specified position.
	
	Iterator it1=list.iterator();
	int position=3;
	for(int i=0;i<position && it1.hasNext() ;i++){
		it1.next();
	}
	System.out.println("\nItearting the element from the 3 position in the list ");
	
	while(it1.hasNext()){
		System.out.print(it1.next()+" ");
	}
	
	// iterate a linked list in reverse order
	ListIterator<Integer> rev = list.listIterator(list.size());
	System.out.println("\nIterating the elements in the reverse Order ");
	while(rev.hasPrevious()){
		System.out.print(rev.previous()+" ");
	}
	
	// insert the specified element at the specified position in the linked list.
	
	System.out.println("\n Inserting the value 78  in 5 th index" );
	list.add(5,78);
	System.out.println("\n List after appending the value 78 :"+  list);
	
	//insert elements into the linked list at the first and last position.

     System.out.println("\n Adding 56 value in front / first of the linked list ");
     list.addFirst(56);
	 
	 System.out.println("\n Adding 78  value in Last / end of the linked list ");
     list.addFirst(78);    

    // get the first and last occurrence of the specified elements in a linked list.
	
	System.out.println("\n First Index Position of 78 : "+list.indexOf(78));
	System.out.println("\n Last Index Position of 78 : "+list.lastIndexOf(78));
	
	}
}

	
	
	
     	 
	
	
	
	
		
	
	
	
	
	
		