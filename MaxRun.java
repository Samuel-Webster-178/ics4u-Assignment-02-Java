/*
 * This program calculates the max character run in a string
 *
 * @author  Samuel Webster
 * @version 1.0
 * @since   2024-04-03
 */


import java.util.Scanner;


/**
* This is the standard MaxRun class.
*/
final class MaxRun {

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this is ever called
    *
    * @throws IllegalStateException if this is ever called
    *
    */
    private MaxRun() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * This function calculates the max character run in a string.
    *
    * @param inputStr The user's input.
    *
    * @return maxRun The max run of the string
    */
    public static int maxRunFunction(String inputStr) {
        int maxRun = 0;
        int currentRun = 0;

        for (int i = 0; i < inputStr.length() - 1; i++) {
            if (inputStr.charAt(i) == inputStr.charAt(i + 1)) {
                currentRun++;
                if (currentRun > maxRun) {
                    maxRun = currentRun;
                }
            } else {
                currentRun = 1;
            }
        }
        return maxRun;
    }


    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(String[] args) {
        // Input
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        final String input = scanner.nextLine().trim();

        // Error check
        if (input.length()) {
            System.out.println("Invalid input.");
        } else {
            // Process & output
            final int maxRun = maxRunFunction(input);
            System.out.println("The string \"" + input + "\" has a max run of " + maxRun + "!");
        }

        System.out.println("\nDone.");

    }
}
