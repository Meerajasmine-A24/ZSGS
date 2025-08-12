/*
7. Write a Java program to,
1. associate the specified value with the specified key in a HashMap.
2. count the number of key-value (size) mappings in a map.
3. copy all of the mappings from the specified map to another map.
4. remove all of the mappings from a map.
5. check whether a map contains key-value mappings (empty) or not.
6. get a shallow copy of a HashMap instance.
7. test if a map contains a mapping for the specified key.
8. test if a map contains a mapping for the specified value.
9. create a set view of the mappings contained in a map.
10. get the value of a specified key in a map. */

import java.util.*;

public class Problem7{
	public static void main(String[] args){

		// 1.  associate the specified value with the specified key in a HashMap.
		HashMap<Integer, String> map1 = new HashMap<>();
		map1.put(3, "Apple");
		map1.put(1, "Banana");
		map1.put(5, "Cherry");
		map1.put(2, "Orange");
		map1.put(4, "Strawberry");

		System.out.println("Hash Map map1 contents: " + map1);
		
		// 2.count the number of key-value (size) mappings in a map.
		
		System.out.println("Number of key-value(size) of the map was : "+map1.size());
		

		// 3.  copy all of the mappings from the specified map to another map.
		HashMap<Integer, String> map2 = new HashMap<>(map1);
		System.out.println("Copied TreeMap map2: " + map2);
		System.out.println("TreeMap map1 contents: " + map1);
		
		//4.  remove all of the mappings from a map.
		map2.clear();
		
		// 5. check whether a map contains key-value mappings (empty) or not.
		System.out.println("checking the map is empty or not with size ");
		System.out.println("Map 1 size : "+map1.size());
		System.out.println("Map 2 size : "+map2.size());
		
		//6. get a shallow copy of a HashMap instance.
		  HashMap<Integer,String> copy = new HashMap<>(map2);
		  System.out.println("Shallow copied map : "+copy);
		  
		 // 7.test if a map contains a mapping for the specified key.
		    int keyToCheck = 2;  
           if (map1.containsKey(keyToCheck)) {
            System.out.println("Map contains key: " + keyToCheck);
             } 
		   else {
            System.out.println("Map does NOT contain key: " + keyToCheck);
           }		

        // 8.  test if a map contains a mapping for the specified value.
		
		 String valueToCheck = "Cherry";
        if (map1.containsValue(valueToCheck)) {
            System.out.println("Map contains value: " + valueToCheck);
        } 
		else {
            System.out.println("Map does NOT contain value: " + valueToCheck);
        }
		
		// 9. create a set view of the mappings contained in a map.
		
		
		Set<Map.Entry<Integer,String>> mapEntry=map1.entrySet();
		System.out.println("set views of the mappings in the map ");
		for(Map.Entry<Integer,String> entry : mapEntry){
			System.out.println(entry.getKey() + "->" + entry.getValue());
		}
		
		// 10. get the value of a specified key in a map.
		
		int key=5;
		System.out.println("Value for the key "+key+" is : "+map1.get(key));
	}
			

}
