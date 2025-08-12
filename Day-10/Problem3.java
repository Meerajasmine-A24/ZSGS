/*
3. Write a Java program to,
a. append the specified element to the end of a hash set.
b. iterate through all elements in a hash list.
c. get the number of elements in a hash set.
d. empty the hash set.
e. test a hash set is empty or not.
f. clone a hash set to another hash set.
g. convert a hash set to an array.
h. convert a hash set to a tree set.
i. convert a hash set to a List/ArrayList.
j. compare two hash set.
‌*/

import java.util.*;

public class Problem3{
	public static void main(String[]args){
		HashSet<Integer> set=new HashSet<>();
		set.add(100);
		set.add(43);
		set.add(33); 
		set.add(55);
		set.add(87);     
		set.add(43);
		set.add(68);
		set.add(100);
		
		System.out.println("Set at Initial Stage : ");
		System.out.print(set);
		
		// apppend elememt at the last 
		
		set.add(56);
		System.out.println("Set at after appending the value 56 at last : ");
		System.out.print(set);
		
		// iterate through all elements in a hash list.
		Iterator<Integer> it = set.iterator();
		System.out.println("Iterating and printing all the elements from the set ");
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
		
		// get the number of elements in a hash set.
		System.out.println("Number of Elements in the Hash Set : "+set.size());
		
		// empty the hash set.
		System.out.println("Making the HashSet Empty ");
		set.clear();
		// test a hash set is empty or not.
		System.out.println("Testing a set is empty or not by printing the set ");
		System.out.println("Set is empty "+ set.isEmpty());
		
		// again adding elements to the set 
		set.add(100);
		set.add(43);
		set.add(33);
		set.add(55);
		set.add(87);
		set.add(43);
		set.add(68);
		set.add(100);
		
		//  clone a hash set to another hash set.
		
		@SuppressWarnings("unchecked")
		
         HashSet<Integer> set2 = (HashSet<Integer>) set.clone();

		
		System.out.println("Original Set was : "+set);
		System.out.println("cloned Set was : "+set2);
		
		// convert a hash set to an array.
		
		Object[]array=set.toArray();
		System.out.print(Arrays.toString(array));
		
		//  convert a hash set to a tree set.
		
		Set<Integer> treeSet=new TreeSet<>(set);
		
		System.out.println("Tree Set was : "+treeSet);
		
		// convert a hash set to a List/ArrayList.
		
		List<Integer> list =new ArrayList<>(set);
		
		System.out.println("Array List was  : "+list);
		
		// compare two hash set.
		
		boolean value=set.equals(set2);
		
		System.out.println("Two sets are equal : "+ value );
		
	}
}

		
		
		
	
		
		
		
		
		
		