import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;

        // Ask for a valid number
        do {
            System.out.print("Enter a number to check: ");
            number = input.nextInt();

            if (number <= 1) {
                System.out.println("Error: Please enter a number greater than 1.");
            }
        } while (number <= 1);

        // Count the divisors
        int divisorCount = 0;

        for (int m = 2; m <= number / 2; m++) {
            if (number % m == 0) {
                System.out.println("## " + number
                        + " is divisible by " + m + ".");
                divisorCount++;
            }
        }

        // Display the final result
        if (divisorCount == 0) {
            System.out.println("## " + number + " is prime!");
        } else {
            System.out.println("## " + number
                    + " is not prime. It is divisible by "
                    + divisorCount + " other numbers.");
        }

        input.close();
    }
}
