import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class InputOutputNotes {
    public static void main(String[] args) {

        // Setting up the Scanner
        Scanner in = new Scanner(System.in); // Creating scanner object





        // 1. 1D Arrays (The Line)
        /*
        Concept: A single row of fixed memory slots.

        // INPUT SYNTAX

        Rule: You *must* use standard for loop. *Why?* You need the index(i) to tell java exactly which
        slot (arr[i]) to fill. You CANNOT use an enhanced for-loop for input because it gives you a copy
        of the value, not the slot itself.
         */

        // Step 1: Create the array (must specify size)
        int[] arr = new int[5];

        // Step 2: Loop to read input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt(); // Store input at index 'i'
        }

        // OUTPUT SYNTAX

        /*
        Option A: Enhanced For-loop (Cleanest) Use this when you just want to read values
        and do not care about the index number.
         */
        for (int num : arr) {
            System.out.println(num + " "); //Prints value
        }

        /*
        Option B: The "Lazy" Debug Way. Best for quickly checking your work in an interview.
         */
        System.out.println(Arrays.toString(arr)); //Prints "[1, 2, 3, 4, 5]"





        // 2D Arrays (The Grid)
        /*
        Concept: An array where every slot holds another array. You need two loops (Nested loops).
         */

        // INPUT SYNTAX

        // Rule: Outer loop for Rows, Inner loop for Columns.


        // Step 1: Create the matrix (3 rows, 3 columns)
        int[][] arr2D = new int[3][3];

        // Step 2: Nested Loop for Input
        for (int row = 0; row < arr2D.length; row++) {          // 1. Pick a row
            for (int col = 0; col < arr2D[row].length; col++) { // 2. Go through every column in that row
                arr2D[row][col] = in.nextInt();                 // 3. Fill the cell
            }
        }

        // OUTPUT SYNTAX

        /*
        Option A: Enhanced For-loop (Nested) This is elegant but can be tricky to remember.
        Read it as: "For every row (which is an int array) inside the matrix..."
         */
        for (int[] row : arr2D) {               // Get the row array
        for (int col : row) {                   // Get the number inside the row
                System.out.println(col + " ");
            }
            System.out.println();               // New line after each row
        }

        /*
        Option B: The "Lazy" Mix: You can use Arrays.toString() on each row to save time.
         */
        for (int[] row : arr2D) {
            System.out.println(Arrays.toString(arr2D));
        }




        // ArrayList (The Dynamic List)
        /*
        Concept: A flexible list that grows on its own. You do not use square brackets [].
        You use methods like .add() and .get()
         */

        // INPUT SYNTAX

        // Creating a 1D ArrayList
        ArrayList<Integer> list = new ArrayList<>(5);

        // Case A: You know how many items (Standard Loop)
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());     // No index needed! Just .add()
        }

        /*
        Case B: You don't know how many items (While Loop) This keeps reading until the input stops (useful for coding contests).
        To come out of the loop have to press ctrl + d or ctrl + x
         */
        while (in.hasNextInt()) {
            list.add(in.nextInt());
        }

        /*
        // OUTPUT SYNTAX
        Rule: ArrayList has a beautiful built-in toString() method. You don't need a loop at all just to see the data.
         */
        System.out.println(list);




        // 2D ArrayList or List of Lists (HIGHLY VALUABLE FOR ATLASSIAN AND CANVA)

        // Step 1: Creating 2D ArrayList
        ArrayList<ArrayList<Integer>> multiList = new ArrayList<>();
        /*
        The "Atlassian" Trap: At this point, you have no rows. If you try to add a number to row 0,
        the code crashes (IndexOutOfBoundsException).
         */

        // Step 2: Initialising the adjacency list
        // We want 3 rows. We must create 3 empty lists and put them inside the main list.
        for (int i = 0; i < 3; i++) {
            multiList.add(new ArrayList<>());
        }
        /*
        Visual before loop: multiList = []
        Visual after loop:  multiList = [ [], [], [] ] (We now have 3 empty buckets ready for data).
         */


        // INPUT SYNTAX
        // Now that the empty rows exist, you can throw numbers into them.

        // list.get(i) retrieves the list at index 'i' (the row)
        // .add(value) adds the number to that specific list
        multiList.get(0).add(10);
        multiList.get(0).add(20);
        multiList.get(0).add(50);

        //Using Loop for Input (Common in Interviews): If you are reading from a Scanner:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                multiList.get(i).add(in.nextInt()); // Go to row 'i', add the number
            }
        }


        // OUTPUT SYNTAX

        /*
        Option A: The "Lazy" Print (Whole Structure) Just like a 1D ArrayList,
        you can print the whole thing instantly
         */
        System.out.println(multiList);

        /*
        Option B: Specific Access (Like arr[row][col]) You cannot use square brackets [].
        You must chain .get() calls.
         */
        int val = multiList.get(0).get(1);
        // 1. list.get(0)   ->  Gets the first list: [10, 20]
        // 2. .get(1)       ->  Gets index 1 inside that list: 20

        // Option C: Iterating (Nested Loop)
        for (ArrayList<Integer> row : multiList) {  // For every list inside the big list...
            for (int num : row) {                   // For every number inside that small list...
                System.out.println(num + " ");
            }
            System.out.println();
        }
    }

    /*
                                            == FAANG Strategy Note ==

        When you interview at Atlassian or Canva, you will likely face a "Graph" problem (e.g., "Find the
        path between two employees").

        They will NOT give you the graph as a nice visual. They will usually give you a list of edges, and
        you will have to build this 2D ArrayList yourself to represent the connections.

            - Row 0 represents User 0.
            - The list inside Row 0 contains all the friends of User 0.

        Mastering that "Initialisation Loop (Step 1)" is the first like of code for about 30% of all hard
        interview problems.
     */
}
