/*Write a Java program to,
a. create a new tree set, add some colours (string) and print out the tree set.
b. iterate through all elements in a tree set.
c. add all the elements of a specified tree set to another tree set.
d. create a reverse order view of the elements contained in a given tree set.
e. get the first and last elements in a tree set.
f. clone a tree set list to another tree set.
g. get the number of elements in a tree set.
h. compare two tree sets.
Create a TreeSet that stores a set of numbers,   
i. find the numbers less than 7 in a tree set.
j. get the element in a tree set which is greater than or equal to the given element.
k. get the element in a tree set which is less than or equal to the given element.
l. get the element in a tree set which is strictly greater than or equal to the given element.
m. get an element in a tree set which is strictly less than the given element.
n. retrieve and remove the first element of a tree set.
o. retrieve and remove the last element of a tree set.
p. remove a given element from a tree set. */

import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        // a. Create a new TreeSet, add colors and print
        TreeSet<String> colourSet = new TreeSet<>();
        colourSet.add("black");
        colourSet.add("white");
        colourSet.add("pink");
        colourSet.add("blue");
        colourSet.add("yellow");
        colourSet.add("green");

        System.out.println("Printing the elements in the colourSet: " + colourSet);

        // b. Iterate through all elements
        System.out.println("Iterating and printing all the elements in the Tree Set:");
        Iterator<String> it = colourSet.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // c. Add all elements to another TreeSet
        TreeSet<String> copiedColourSet = new TreeSet<>();
        System.out.println("Adding the elements of original TreeSet to another set:");
        Iterator<String> it2 = colourSet.iterator();
        while (it2.hasNext()) {
            copiedColourSet.add(it2.next()); 
        }
        System.out.println("Copied TreeSet: " + copiedColourSet);

        // d. Reverse order view
        System.out.println("Reverse order view of the TreeSet:");
        Iterator<String> rev = colourSet.descendingIterator();
        while (rev.hasNext()) {
            System.out.print(rev.next() + " ");
        }
        System.out.println();

        // e. First and last elements
        System.out.println("First Element in the TreeSet: " + colourSet.first());
        System.out.println("Last Element in the TreeSet: " + colourSet.last());

        // f. Clone TreeSet
		@SuppressWarnings("unchecked")

        TreeSet<String> colourSetClone = (TreeSet<String>) colourSet.clone();
        System.out.println("Cloned TreeSet: " + colourSetClone);

        // g. Number of elements
        System.out.println("Number of elements in the TreeSet: " + colourSet.size());

        // h. Compare two TreeSets
        System.out.println("Comparing copied and cloned colour sets:");
        System.out.println("Are they equal? " + colourSetClone.equals(copiedColourSet));

        // TreeSet of numbers
        TreeSet<Integer> numbersSet = new TreeSet<>();
        numbersSet.addAll(Arrays.asList(34, 48, 6, 35, 1, 56, 10, 3, 90, 21, 59, 24));
        System.out.println("The number set: " + numbersSet);

        // i. Find numbers < 7
        System.out.println("Numbers less than 7: " + numbersSet.headSet(7)); 

        // j. ≥ given element
        System.out.println("Number greater than equal to  34: " + numbersSet.ceiling(34)); 

        // k. ≤ given element
        System.out.println("Number less than or equal to 24: " + numbersSet.floor(24)); 

        // l. Strictly > given element
        System.out.println("Number > 24: " + numbersSet.higher(24)); 
  
        // m. Strictly < given element
        System.out.println("Number < 24: " + numbersSet.lower(24)); 

        // n. Remove first element
        System.out.println("First element removed: " + numbersSet.pollFirst());
        System.out.println("TreeSet after removing first: " + numbersSet);

        // o. Remove last element
        System.out.println("Last element removed: " + numbersSet.pollLast());
        System.out.println("TreeSet after removing last: " + numbersSet);

        // p. Remove a given element (e.g., 100)
        System.out.println("Removing 100 from the TreeSet:");
        numbersSet.remove(100);
        System.out.println("TreeSet after removing 100: " + numbersSet);
    }
}
