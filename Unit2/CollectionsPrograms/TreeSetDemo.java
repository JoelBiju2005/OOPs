import java.util.*;
import java.util.Collections;


import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        // Creating a TreeSet
        TreeSet<Integer> numbers = new TreeSet<>();

        // Adding elements
        numbers.add(50);
        numbers.add(20);
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);

        // Duplicate element (will not be added)
        numbers.add(20);

        // Display TreeSet
        System.out.println("TreeSet elements (sorted): " + numbers);

        // Accessing first and last elements
        System.out.println("First element: " + numbers.first());
        System.out.println("Last element: " + numbers.last());

        // Removing an element
        numbers.remove(40);
        System.out.println("After removing 40: " + numbers);

        // Checking if element exists
        System.out.println("Contains 30? " + numbers.contains(30));
    }
}
