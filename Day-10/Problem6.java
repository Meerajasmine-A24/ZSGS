/*
6. Write a Java program to,
1. associate the specified value with the specified key in a Tree Map.
2. copy a Tree Map content to another Tree Map.
3. search a key in a Tree Map.
4. search a value in a Tree Map.
5. get all keys from the given a Tree Map.
6. delete all elements from a given Tree Map.
7. sort keys in Tree Map by using comparator.
8. get a key-value mapping associated with the greatest key and the least key in a map.
9. get the first (lowest) key and the last (highest) key currently in a map.
10. get a reverse order view of the keys contained in a given map. */


import java.util.*;

public class Problem6{
	public static void main(String[] args){

		// 1. associate the specified value with the specified key in a Tree Map.
		TreeMap<Integer, String> map1 = new TreeMap<>();
		map1.put(3, "Apple");
		map1.put(1, "Banana");
		map1.put(5, "Cherry");
		map1.put(2, "Orange");
		map1.put(4, "Strawberry");

		System.out.println("TreeMap map1 contents: " + map1);

		// 2. copy a Tree Map content to another Tree Map.
		TreeMap<Integer, String> map2 = new TreeMap<>(map1);
		System.out.println("Copied TreeMap map2: " + map2);

		// 3. search a key in a Tree Map.
		System.out.println("If key 3 exist " + map1.containsKey(3));

		// 4. search a value in a Tree Map.
		System.out.println("Does value Apple  exist  " + map1.containsValue("Date"));

		// 5. get all keys from the given a Tree Map.
		Set<Integer> keySet = map1.keySet();
		System.out.println("All keys in map1: " + keySet);

		// 6. delete all elements from a given Tree Map.
		map2.clear();
		System.out.println("TreeMap map2 after clearing: " + map2);

		// 7. sort keys in Tree Map by using comparator (descending order here).
		TreeMap<Integer, String> sortedMap = new TreeMap<>(Collections.reverseOrder());
		sortedMap.putAll(map1);
		System.out.println("TreeMap sorted in descending key order: " + sortedMap);

		// 8. get a key-value mapping associated with the greatest key and the least key in a map.
		System.out.println("Entry with greatest key: " + map1.lastEntry());
		System.out.println("Entry with least key: " + map1.firstEntry());

		// 9. get the first (lowest) key and the last (highest) key currently in a map.
		System.out.println("First (lowest) key: " + map1.firstKey());
		System.out.println("Last (highest) key: " + map1.lastKey());

		// 10. get a reverse order view of the keys contained in a given map.
		Set<Integer> reverseKeys = map1.descendingMap().keySet();
		System.out.println("Reverse order view of keys: " + reverseKeys);
	}
}
