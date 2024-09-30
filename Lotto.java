package exercise2;

import javax.swing.*;
import java.util.Random;

public class Lotto {
    // Array to hold three random numbers
    private final int[] numbers = new int[3];

    // Constructor to randomly assemble the array
    public Lotto() {
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            // Generate numbers between 1 and 9
            numbers[i] = rand.nextInt(9) + 1;
        }
    }

    // Method to return the array of numbers
    public int[] getNumbers() {
        return numbers;
    }

    // Method to calculate the sum of the numbers
    public int calculateSum() {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Create a Lotto instance
        Lotto lotto = new Lotto();
        int userChoice = Integer.parseInt(JOptionPane.showInputDialog("Choose a number between 3 and 27:"));
        int attempts = 0;
        boolean userWon = false;

        while (attempts < 5 && !userWon) {
            // Calculate the sum of the numbers
            int sum = lotto.calculateSum();
            JOptionPane.showMessageDialog(null, "Lotto numbers: " + lotto.getNumbers()[0] + ", " + lotto.getNumbers()[1] + ", " + lotto.getNumbers()[2] +
                    "\nSum: " + sum); // Display the lotto numbers and their sum

            if (userChoice == sum) {
                // User wins if their choice matches the sum
                userWon = true;
            } else {
                attempts++;
                if (attempts < 5) {
                    // Create a new Lotto instance for the next attempt
                    lotto = new Lotto();
                }
            }
        }

        // Determine the result after 5 attempts
        if (userWon) {
            JOptionPane.showMessageDialog(null, "Congratulations! You have won!");
        } else {
            JOptionPane.showMessageDialog(null, "Computer wins! Better luck next time.");
        }
    }
}










