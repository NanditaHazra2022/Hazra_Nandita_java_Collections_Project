/* Java program to demonstrate
 * binary search in dynamic array
 * using Collections.binarySearch method.
 * The dynamic array will be sorted
 * using Collections.sort method
 * for performing binary search. */

// Importing required classes.
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Main class.
public class ArrayListBinarySearch
{   // Start of main class.

    // Starting point of execution.
    public static void main(String[] args)
    {   // Start of execution thread.

        // Creating a string dynamic array
        List<String> items = new ArrayList<>();

        /* Adding elements to
         * the string dynamic array
         * using add method. */
        items.add("Books");
        items.add("Toys");
        items.add("Puzzles");
        items.add("Music");
        items.add("Dance");

        /* Sorting the string dynamic array
         * before binary search is performed. */
        Collections.sort(items);

        /* Performing binary search
         * in the sorted
         * string dynamic array,*/
        System.out.println("The index of Music is "
                + Collections.binarySearch(items, "Music"));

    }   // End of execution thread.

}   // End of main class.
