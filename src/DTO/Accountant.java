package DTO;

import exception.InvalidParametersException;

import java.util.Scanner;

public class Accountant {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Enter the first parameter:");
        int firstParameter = terminal.nextInt();

        System.out.println("Enter the second parameter:");
        int secondParameter = terminal.nextInt();

        try {
            // Calling the method containing the counting logic
            count(firstParameter, secondParameter);
        } catch (InvalidParametersException exception) {
            // Print the message: The second parameter must be greater than the first
            System.out.println(exception.getMessage());
        }
    }

    static void count(int firstParameter, int secondParameter) throws InvalidParametersException {
        // Validate if firstParameter is greater than secondParameter and throw an exception
        if (firstParameter > secondParameter) {
            throw new InvalidParametersException("The second parameter must be greater than the first");
        }

        // Calculate the number of iterations
        int count = secondParameter - firstParameter;

        // Perform the for loop to print the numbers based on the count variable
        for (int i = 1; i <= count; i++) {
            System.out.println("Printing number " + i);
        }
    }
}
