/*
5. Write a Java program to,
1. create a new priority queue, add some colors (string) and print out the elements of the priority queue.
2. iterate through all elements in priority queue.
3. add all the elements of a priority queue to another priority queue.
4. insert a given element into a priority queue.
5. remove all the elements from a priority queue.
6. count the number of elements in a priority queue.
7. compare two priority queues.
8. retrieve the first element of the priority queue.  
9. retrieve and remove the first element.
10. convert a priority queue to an array containing all of the elements of the queue. */

import java.util.*;
import java.util.Collection;

public class Problem5{
public static void main(String[]args){
	//  create a new priority queue, add some colors (string) and print out the elements of the priority queue.
	PriorityQueue<String> pq=new PriorityQueue<>();
	 pq.add("black");
     pq.add("white");
     pq.add("pink");
     pq.add("blue");
     pq.add("yellow");
     pq.add("green");
	 
	 System.out.println("Elements in the Priority Queue are : "+pq);
	 
	 // iterate through all elements in priority queue.
	 PriorityQueue<String> pq2=new PriorityQueue<>();
	 Iterator<String> it = pq.iterator();
	 while(it.hasNext()){
		 pq2.add(it.next());
	 }
	 System.out.println("Copied priority queue : "+pq2);
	 
	 // insert a given element into a priority queue.
	 pq.add("orange");
	 System.out.println("Queue after adding orange colour : "+pq);
	 
	 // count the number of elements in a priority queue.
	 System.out.println("Number of elements in the original queue : "+pq.size());
	  System.out.println("Number of elements in the copied  queue : "+pq2.size());
	  
	  // compare two priority queues.
	  System.out.println("Is original and copied priority queues are equal : "+pq.equals(pq2));
	  
	  // retrieve the first element of the priority queue
	  
	  System.out.println("First element of priority queue : "+pq.poll());
	  
	  System.out.println("Original queue after removing the first element : "+pq);
	  
	  // remove all the elements from a priority queue.
	  pq2.clear();
	  System.out.println("Copied priorty queue after removing all the elements : "+pq2);
	  
	  // convert a priority queue to an array containing all of the elements of the queue
	  int size=pq.size();
	  String[]array=new String[size];
	  int index=0;
	  Iterator<String> it2 = pq.iterator();
	 while(it2.hasNext()){
		 array[index++]=it2.next();
	 }
      
	  System.out.println("Array after adding the elemenets of priority quue : "+Arrays.toString(array));
}
}

	 
	  
	  
	  
	 
	 
	 
	 
	 
	 
	 
	 
	 

