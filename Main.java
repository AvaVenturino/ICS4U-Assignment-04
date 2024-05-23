/*
 * This program uses oop
 *
 * @author  Ava Venturino
 * @version 1.0
 * @since   2024-04-24
 */

/**
 * This program uses stacks.
 */

import java.util.Scanner;

final class Main {

    /**
     * Prevent instantiation.
     * Throw an exception IllegalStateException.
     *
     * @throws IllegalStateException if this is ever called
     *
     */

    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    public static void topHalf(int starNumber) {
        String line = "";
        if (starNumber > 1) {
            line = "*".repeat(starNumber);
            System.out.print(line + "\n");
            topHalf(starNumber - 1);
        } else if (starNumber == 1) {
            line = "*";
            System.out.print(line);
        }
    }

    public static void bottomHalf(int starNumber, int counter) {
        String line = "";
        if (counter == 1) {
            line = "*";
            System.out.println("\n" + line);
            bottomHalf(starNumber, counter + 1);
        } else if (counter <= starNumber) {
            line = "*".repeat(counter);
            System.out.print(line + "\n");
            bottomHalf(starNumber, counter + 1);
        }
    }

    public static void main(String[] args) {

        System.out.println("Hourglass star pattern program.");

        // input
        Scanner userInput = new Scanner(System.in);
        System.out.print("\nEnter a number: ");

        int intInput = userInput.nextInt();

        if(intInput < 0) {
            System.out.println("Invalid Input. Try again with a positive number.");
        } else {
            int counter = 1;
            topHalf(intInput);
            bottomHalf(intInput, counter);
        }
        System.out.println("\nDone.");
    }
}
